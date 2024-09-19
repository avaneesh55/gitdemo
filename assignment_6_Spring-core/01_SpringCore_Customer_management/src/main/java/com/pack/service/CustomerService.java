package com.pack.service;

import java.util.ArrayList;
import java.util.List;

import com.pack.model.Customer;

public class CustomerService {

	private List<Customer> customerList = new ArrayList<>();
	
//	addCustomer(Customer customer): Adds a new customer to the system.
//	▪ getCustomerById(int id): Retrieves a customer by their ID.
//	▪ getAllCustomers(): Returns a list of all customers in the system.
	
	public CustomerService() {
		super();
	}
	public void addCustomer(Customer customer) {
		//System.out.println("done");
		this.customerList.add(customer);
		
	}
	public Customer getCustomerById(int id){
		Customer customer = this.customerList.stream()
        .filter(p -> p.getId() == id)
        .findFirst().orElse(null);
		
		return customer;
	}
	
	public List<Customer> getAllCustomers(){
		return this.customerList;
	}

}
