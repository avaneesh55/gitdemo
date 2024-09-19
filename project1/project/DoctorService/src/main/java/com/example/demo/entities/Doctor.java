package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "doctor")
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int doctorId;

	@NotBlank(message = "Doctor name is required")
	@Size(min = 2, max = 100, message = "Doctor name must be between 2 and 100 characters")
	@Column(nullable = false)
	private String doctorName;

	@NotBlank(message = "Phone number is required")
	@Pattern(regexp = "(^$|[0-9]{10})", message = "Phone number must be 10 digits")
	@Column(nullable = false)
	private String phone;

	@NotBlank(message = "Qualification is required")
	@Column(nullable = false)
	private String qualification;

	@NotNull(message = "Experience is required")
	@Column(nullable = false)
	private int experience;

	@NotBlank(message = "Address is required")
	@Column(nullable = false)
	private String address;

	@NotBlank(message = "Specialization is required")
	@Column(nullable = false)
	private String specialization;

	@NotNull(message = "Basic fee is required")
	@Column(nullable = false)
	private double basicFee;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "doctor_Id", referencedColumnName = "doctorId")
	private List<Patient> patients = new ArrayList<>();

	public Doctor() {
		super();

	}

	public Doctor(int doctorId, String doctorName, String phone, String qualification, int experience, String address,
			String specialization, double basicFee) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.phone = phone;
		this.qualification = qualification;
		this.experience = experience;
		this.address = address;
		this.specialization = specialization;
		this.basicFee = basicFee;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public double getBasicFee() {
		return basicFee;
	}

	public void setBasicFee(double basicFee) {
		this.basicFee = basicFee;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", phone=" + phone + ", qualification="
				+ qualification + ", experience=" + experience + ", address=" + address + ", specialization="
				+ specialization + ", basicFee=" + basicFee + "]";
	}

}