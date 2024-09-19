package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "patient")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patientId;

	@NotBlank(message = "Patient name is required")
	@Size(min = 2, max = 100, message = "patient name must be between 2 and 100 characters")
	@Column(nullable = false)
	private String patientName;

	@NotBlank(message = "Gender is required")
	@Column(nullable = false)
	private String gender;

	@NotNull(message = "Age is required")
	@Min(value = 1, message = "Age must be at least 1")
	@Max(value = 100, message = "Age must be at most 100")
	@Column(nullable = false)
	private Integer age;

	@NotBlank(message = "Phone number is required")
	@Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be 10 digits")
	@Column(nullable = false)
	private String phoneNo;

	@NotBlank(message = "Address is required")
	@Size(min = 10, max = 100, message = "Address must be between 10 and 100 characters")
	private String address;

	@NotNull(message = "Doctor ID is required")
	private Integer doctorId;

	public Integer getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(int patientId, String patientName, String gender, Integer age, String phoneNo, String address,
			Integer doctorId) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.gender = gender;
		this.age = age;
		this.phoneNo = phoneNo;
		this.address = address;
		this.doctorId = doctorId;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
