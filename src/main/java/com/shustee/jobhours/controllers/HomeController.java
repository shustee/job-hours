package com.shustee.jobhours.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shustee.jobhours.entities.Customer;
import com.shustee.jobhours.services.CustomerService;

@RestController
public class HomeController {

    @Autowired
    CustomerService customerService;

    @GetMapping("customers")
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @GetMapping("customer")
    public Customer getCustomer(String customerPhone) {
        return customerService.getCustomer(customerPhone);
    }

    @PostMapping("customer")
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }
    
}
