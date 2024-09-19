package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Flux<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Mono<Customer> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    public Mono<Customer> createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Mono<Customer> updateCustomer(Long id, Customer customer) {
        return customerRepository.findById(id)
                .flatMap(existingCustomer -> {
                    existingCustomer.setName(customer.getName());
                    existingCustomer.setEmail(customer.getEmail());
                    return customerRepository.save(existingCustomer);
                });
    }

    public Mono<Void> deleteCustomer(Long id) {
        return customerRepository.deleteById(id);
    }
}
