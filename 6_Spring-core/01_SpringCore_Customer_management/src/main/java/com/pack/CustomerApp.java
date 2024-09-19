package com.pack;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.model.Customer;
import com.pack.service.CustomerService;

public class CustomerApp {

	public static void main(String[] args) {

		ApplicationContext apcon = new ClassPathXmlApplicationContext("aplicationContext.xml");
		CustomerService customerService = (CustomerService) apcon.getBean("customerService");
		//Customer cus1 = (Customer) apcon.getBean("cusObj", Customer.class);
		Customer cus2 = (Customer) apcon.getBean("cusObj1", Customer.class);
		Customer cus3 = (Customer) apcon.getBean("cusObj2", Customer.class);

		
//		// custom1 and customer2 and called addCustomer ()
		customerService.addCustomer(new Customer(1,"momin","tf@rt.com","13554156") );
		customerService.addCustomer(cus2);
		customerService.addCustomer(cus3);

		// Retrieve and print customer details
		Customer retrievedCustomer = customerService.getCustomerById(102);
		if (retrievedCustomer != null)
			System.out.println(
					"Retrieved Customer: " + retrievedCustomer.getcName() + " (" + retrievedCustomer.getcEmail() + ")");
		else
			System.out.println("Customer not found!!");

		// List all customers in the system
		List<Customer> allCustomers = customerService.getAllCustomers();
		System.out.println("All Customers:" + allCustomers);

		// Display all customer details
		allCustomers.stream().forEach(cs -> System.out.println(
				cs.getId() + " " + cs.getcName() + " (" + cs.getcEmail() + ") " + cs.getcPhone()));

	}

}
