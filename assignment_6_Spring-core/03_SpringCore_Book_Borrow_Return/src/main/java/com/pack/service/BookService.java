package com.pack.service;

import java.util.HashMap;

import com.pack.model.Book;

public class BookService {

	HashMap<String,Book> bookMap = new HashMap<>();

	public BookService() {
		super();
	}
	
	public void addBook(Book book) {
		this.bookMap.put(book.getTitle(), book);
		//System.out.println(bookMap);
	}
	
	public Book getBook(String title) {
		Book book = null;
		if(bookMap.containsKey(title) && bookMap.get(title).isAvailable())
			book = this.bookMap.get(title);
		System.out.println(this.bookMap.get(title));
		return book;
	}
	
	public void updateBookAvailability(String title, boolean available) {
		
		Book book = null;
		if(bookMap.containsKey(title)) {
			book = bookMap.get(title);
			book.setAvailable(available);
			this.bookMap.put(title, book);
		}
	}
	
		
		
}
