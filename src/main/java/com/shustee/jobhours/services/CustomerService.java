package com.shustee.jobhours.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shustee.jobhours.entities.Customer;
import com.shustee.jobhours.repositories.CustomerRepository;

@Service
public class CustomerService {
    
    @Autowired
    CustomerRepository customerRepository;

    public CustomerService() {

    }

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomer(String email) {
        return customerRepository.findByEmail(email);
    }

    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
