package com.pack.model;

public class Customer {
	
	private int id;
	private String cName;
	private String cEmail;
	private String cPhone;
	
	public Customer() {
		super();
	}

	public Customer(int id, String cName, String cEmail, String cPhone) {
		super();
		this.id = id;
		this.cName = cName;
		this.cEmail = cEmail;
		this.cPhone = cPhone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcEmail() {
		return cEmail;
	}

	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}

	public String getcPhone() {
		return cPhone;
	}

	public void setcPhone(String cPhone) {
		this.cPhone = cPhone;
	}
	
	
	

}
