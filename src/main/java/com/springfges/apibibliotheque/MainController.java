package com.springfges.apibibliotheque;

import com.springfges.apibibliotheque.user.Customer;
import com.springfges.apibibliotheque.user.CustomerRepository;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;

import com.google.gson.Gson;
import java.util.ArrayList;

@RestController
@RequestMapping(path="")
public class MainController {

    @Autowired
    CustomerRepository customerRepository;

    @PostMapping("/signin")
    public String signIn(@RequestBody Customer customer) {

        Customer customerTmp = customerRepository.findByLogin(customer.getLogin())
                .orElseThrow(() -> new RuntimeException("Password or Login are wrong"));

        if(!customerTmp.getPassword().equals(customer.getPassword())){
            throw new RuntimeException("Password or Login are wrong");
        }

        String access_token = "";

        if (customerTmp.getCategory().equals("adulte")) {
            HttpResponse<String> response = Unirest.post("https://dev-u2qigoy0.eu.auth0.com/oauth/token")
                    .header("content-type", "application/json")
                    .body("{\"client_id\":\"BVGnSDtTB0xggYM5U2PVcmS4pzyBAi07\"," +
                            "\"client_secret\":\"s2azjucuOHxI5-s8HY68FyI6yenxIQ_ghDYrX3aaibiBq_9u4pX78IBAE-dPLQqV\"," +
                            "\"audience\":\"http://bibliotheque-api/\",\"grant_type\":\"client_credentials\"," +
                            "\"scope\":\"adulte adolescent enfant\"}")
                    .asString();
            access_token = response.getBody().toString();
        } else if (customerTmp.getCategory().equals("adolescent")) {
            HttpResponse<String> response = Unirest.post("https://dev-u2qigoy0.eu.auth0.com/oauth/token")
                    .header("content-type", "application/json")
                    .body("{\"client_id\":\"npNw7KGuWzzvLXDdUrwGxDqBxxm7g5eW\"," +
                            "\"client_secret\":\"RnvOSNORcoPNH61USXkzScqoGHyVfteAksWRxWrf2bgh-nruj6HGBdKPLyqiI1f3\"," +
                            "\"audience\":\"http://bibliotheque-api/\",\"grant_type\":\"client_credentials\"," +
                            "\"scope\":\"adolescent enfant\"}")
                    .asString();
            access_token = response.getBody().toString();
        } else if (customerTmp.getCategory().equals("enfant")) {
            HttpResponse<String> response = Unirest.post("https://dev-u2qigoy0.eu.auth0.com/oauth/token")
                    .header("content-type", "application/json")
                    .body("{\"client_id\":\"y29Onuugkxjvy9nW8ILtr8lqz9kwH77y\"," +
                            "\"client_secret\":\"-dXH5la-wT2mAXZrCqwNYL1FYSxEdHGW3nHOlKU24pwpioCgdUpB1BzIEKg2FTwJ\"," +
                            "\"audience\":\"http://bibliotheque-api/\",\"grant_type\":\"client_credentials\"," +
                            "\"scope\":\"enfant\"}")
                    .asString();
            access_token = response.getBody().toString();
        } else {
            access_token = "false";
        }

        return access_token;
    }

    @PostMapping("/signup")
    public Customer signUp(@RequestBody Customer customer) {
        customer.setId(customerRepository.findAll().size()+1);

        if(customer.getAge() > 0 && customer.getAge() < 13) {
            customer.setCategory("enfant");
        } else if(customer.getAge() >= 13 && customer.getAge() < 18) {
            customer.setCategory("adolescent");
        } else if(customer.getAge() >= 18) {
            customer.setCategory("adulte");
        } else {
            throw new RuntimeException("Wrong age");
        }
        return customerRepository.save(customer);
    }
}