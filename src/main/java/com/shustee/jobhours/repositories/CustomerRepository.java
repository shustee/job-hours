package com.shustee.jobhours.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shustee.jobhours.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
    
    Customer findByCustomerPhone(String customerPhone);
    
}
