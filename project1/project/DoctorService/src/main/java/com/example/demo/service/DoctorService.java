package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.example.demo.entities.Doctor;

public interface DoctorService {

	Doctor createDoctor(Doctor newDoctor);

	List<Doctor> getDoctors();

	Optional<Doctor> getDoctorById(int doctorId);
	
	ResponseEntity<Doctor> updateDoctor(Integer doctorId, Doctor newDoctor);

	void deleteDoctorById(int doctorId);

	

}
