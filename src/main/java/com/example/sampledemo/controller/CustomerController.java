package com.example.sampledemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/customers")
public class CustomerController {


    @GetMapping("/{id}")
    public String getCustomer(@PathVariable Long id) {

        log.info("Received request to get customer, id={}", id);

        log.warn("validating request to get customer, id={}", id);

        return "Customer " + id;
    }
}
