package com.pack;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.model.Book;
import com.pack.service.BookService;

public class BookApp {

	public static void main(String[] args) {

		ApplicationContext apcon = new ClassPathXmlApplicationContext("aplicationContext.xml");
		BookService bookService = (BookService) apcon.getBean("bookService");
		Book bk1 = (Book) apcon.getBean("bkObj", Book.class);
		Book bk2 = (Book) apcon.getBean("bkObj1", Book.class);

		

		bookService.addBook(bk2);
		bookService.addBook(bk1);

		// Retrieve and print customer details
		Book retrievedBook = bookService.getBookByTitle("Spring");
		if (retrievedBook != null)
			System.out.println(
				"Retrieved Customer: " + retrievedBook.getBkTitle() + " " + retrievedBook.getBkAuthor());
		else
			System.out.println("Customer not found!!");

		// List all customers in the system
		List<Book> allBooks = bookService.getAllBooks();
		System.out.println("All Customers:" + allBooks);

		// Display all customer details
		allBooks.stream().forEach(cs -> System.out.println(
				cs.getBkTitle() + " " + cs.getBkAuthor() + " " + cs.getBkISBN()));

	}

}
