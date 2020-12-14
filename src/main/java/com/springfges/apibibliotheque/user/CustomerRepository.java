package com.springfges.apibibliotheque.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource(path="user")
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    Optional<Customer> findByName(String name);
}
