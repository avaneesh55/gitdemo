package com.pack.model;

public class Book {
	

	private String bkTitle;
	private String bkAuthor;
	private String bkISBN;
	
	public Book() {
		super();
	}

	public Book(String bkTitle, String bkAuthor, String bkISBN) {
		super();
		this.bkTitle = bkTitle;
		this.bkAuthor = bkAuthor;
		this.bkISBN = bkISBN;
	}

	public String getBkTitle() {
		return bkTitle;
	}

	public void setBkTitle(String bkTitle) {
		this.bkTitle = bkTitle;
	}

	public String getBkAuthor() {
		return bkAuthor;
	}

	public void setBkAuthor(String bkAuthor) {
		this.bkAuthor = bkAuthor;
	}

	public String getBkISBN() {
		return bkISBN;
	}

	public void setBkISBN(String bkISBN) {
		this.bkISBN = bkISBN;
	}

	
}
