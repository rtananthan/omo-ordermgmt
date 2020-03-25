package com.omo.ordermgmt.com.omo.ordermgmt.repository.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerWSController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("ordermgmt/customer")
    public List<Customer> findCustomer(){
        List<Customer> customerList = customerRepository.findAll();
        return  customerList;
    }
}
