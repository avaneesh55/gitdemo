package com.pack.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pack.model.Book;
import com.pack.model.BorrowTransaction;

public class BorrowService {
//	@Autowired
//	BookService bookService;

	private List<BorrowTransaction> transactions = new ArrayList<>();

	public List<BorrowTransaction> getTransactions() {
		return transactions;
	}

	public void borrowBook(String borrowerName, String bookTitle, BookService bookService) {
		
		Book book = bookService.getBook(bookTitle);
		//System.out.println("");
		if (book != null && book.isAvailable()) {
			book.setAvailable(false);
			BorrowTransaction borrowTransaction = 
					new BorrowTransaction(borrowerName, bookTitle, new Date());
			this.transactions.add(borrowTransaction);
		}
	}

	public void returnBook(String bookTitle, BookService bookService) {
		bookService.updateBookAvailability(bookTitle, true);
	}
	

}
