package com.springfges.apibibliotheque.user;

import com.springfges.apibibliotheque.book.Book;
import com.springfges.apibibliotheque.book.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping(path="api/user")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/add")
    public Customer addCustomer(@RequestBody Customer customer) throws RuntimeException{
        if(customer.getAge() > 0 && customer.getAge() < 13) {
            customer.setCategory("Enfant");
        } else if(customer.getAge() >= 13 && customer.getAge() < 18) {
            customer.setCategory("Ado");
        } else if(customer.getAge() >= 18) {
            customer.setCategory("adulte");
        } else {
            throw new RuntimeException("Wrong age");
        }
        return customerRepository.save(customer);
    }

    @GetMapping("/search/{userName}")
    public Optional<Customer> getCustomerByName(@PathVariable("userName") String userName){
        return customerRepository.findByName(userName);
    }

    @PostMapping("/{userId}/borrow/{bookId}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable("userId") int userId, @PathVariable("bookId") int bookId) throws Exception {
        Customer customer = customerRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Customer not found for this id :: " + userId));

        Book book = bookRepository.findById(bookId)
                .orElseThrow(() -> new RuntimeException("Book not found for this id :: " + bookId));

        Boolean checkEnfant = customer.getCategory().equals("enfant") && (book.getCategory().equals("ado") || book.getCategory().equals("adulte"));
        Boolean checkAdo = customer.getCategory().equals("ado") && book.getCategory().equals("adulte");

        if(checkEnfant || checkAdo){
            throw new RuntimeException("You are not old enough to borrow this book.");
        }

        Set<Book> borrow = customer.getBorrow();

        if(borrow.size() >= 3){
            throw new Exception("Too many borrowed books");
        } else{
            borrow.add(book);
        }

        customer.setBorrow(borrow);

        final Customer updatedCustomer = customerRepository.save(customer);
        return ResponseEntity.ok(updatedCustomer);
    }
}
