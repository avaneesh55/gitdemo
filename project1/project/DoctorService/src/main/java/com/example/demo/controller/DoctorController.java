package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Doctor;
import com.example.demo.entities.Patient;
import com.example.demo.exceptions.ResourceNotFoundException;
import com.example.demo.feign.DoctorFeignClient;
import com.example.demo.service.DoctorService;

@EnableMethodSecurity
@RestController
@RequestMapping("/dapi")      //http://localhost:9196/dapi/doctors
public class DoctorController {

	@Autowired
	private DoctorService doctorService;
	
	@Autowired
	private DoctorFeignClient doctorFeignClient;

	@GetMapping("/hello")
	String hello() {
		return "Hello World, Spring Boot.... Welcome to You!";
	}
	
	@GetMapping("/patients/{doctorId}")
	public List<Patient> getPatientByDoctor(@PathVariable int doctorId){
		return doctorFeignClient.getPatientByDoctorId(doctorId);
	}

	@GetMapping("/doctors")
	List<Doctor> getAllDoctor() {
		return doctorService.getDoctors();

	}

	@PostMapping("/doctors")
	public Doctor createDoctor(@Validated @RequestBody Doctor newDoctor) {
		return doctorService.createDoctor(newDoctor);
	}

	@GetMapping("/doctors/{doctorId}")
	 Optional<Doctor> getDoctorById(@PathVariable int doctorId) throws ResourceNotFoundException {
		Optional<Doctor> doctor = doctorService.getDoctorById(doctorId);
		doctor.orElseThrow(() -> new ResourceNotFoundException("Doctor not found for this id :: " + doctorId));
		return doctor;
	}

	@DeleteMapping("/doctors/{doctorId}")
	public void deleteDoctorById(@PathVariable int doctorId) {
		doctorService.deleteDoctorById(doctorId);
	}

	@PutMapping("/{doctorId}")
	public ResponseEntity<Doctor> updateDoctor(@PathVariable(value = "doctorId") Integer doctorId,
			@Validated @RequestBody Doctor newDoctor) {
		return doctorService.updateDoctor(doctorId, newDoctor);
	}
	

	
	//http://localhost:9196/api/doctors/req?doctorId=1
	@GetMapping("/doctors/req")
	public Optional<Doctor> findDoctorByDoctorIdUsingRequestParam(@RequestParam int doctorId) {
		return doctorService.getDoctorById(doctorId);
	}
}
