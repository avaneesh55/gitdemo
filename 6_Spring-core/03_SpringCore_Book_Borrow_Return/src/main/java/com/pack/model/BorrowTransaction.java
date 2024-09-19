package com.pack.model;

import java.util.Date;

public class BorrowTransaction {
	
	private String borrowerName;
	private String bookTitle;
	private Date borrowDate;
	public BorrowTransaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BorrowTransaction(String borrowerName, String bookTitle, Date borrowDate) {
		super();
		this.borrowerName = borrowerName;
		this.bookTitle = bookTitle;
		this.borrowDate = borrowDate;
	}
	public String getBorrowerName() {
		return borrowerName;
	}
	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public Date getBorrowDate() {
		return borrowDate;
	}
	public void setBorrowDate(Date borrowDate) {
		this.borrowDate = borrowDate;
	}
	@Override
	public String toString() {
		return "BorrowTransaction [borrowerName=" + borrowerName + ", bookTitle=" + bookTitle + ", borrowDate="
				+ borrowDate + "]";
	}
	
	
	

}
