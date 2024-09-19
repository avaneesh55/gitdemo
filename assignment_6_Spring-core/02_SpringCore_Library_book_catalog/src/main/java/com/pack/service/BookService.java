package com.pack.service;

import java.util.ArrayList;
import java.util.List;

import com.pack.model.Book;

public class BookService {

	private List<Book> bookList = new ArrayList<>();
	
//	addCustomer(Customer customer): Adds a new customer to the system.
//	▪ getCustomerById(int id): Retrieves a customer by their ID.
//	▪ getAllCustomers(): Returns a list of all customers in the system.
	
	public BookService() {
		super();
	}
	public void addBook(Book book) {
		//System.out.println("done");
		this.bookList.add(book);
		
	}
	public Book getBookByTitle(String title){
		Book customer = this.bookList.stream()
        .filter(p -> p.getBkTitle().equals(title))
        .findFirst().orElse(null);
		
		return customer;
	}
	
	public List<Book> getAllBooks(){
		return this.bookList;
	}

}
