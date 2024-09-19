package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Patient;
import com.example.demo.exceptions.ResourceNotFoundException;
import com.example.demo.service.PatientService;

@RestController
@RequestMapping("/papi")
public class PatientController {

	@Autowired
	private PatientService patientService;
	
	@GetMapping("/hello")
	String hello() {
		return "Hello World, Spring Boot.... Welcome to You!";
	}
//localhost:9198/papi/patients
	@GetMapping("/patients")
	public List<Patient> getAllPatients() {
		return patientService.getAllPatients();
	}
	
	//forQuery
//	localhost:9198/papi/patients/doctors/1 (find patient by doctors id)
	@GetMapping("/patients/doctors/{doctorId}")
	public List<Patient> getPatientByDoctor(@PathVariable int doctorId){
		return patientService.getPatientsByDoctor(doctorId);
	}
//localhost:9198/papi/doctors/1
	@GetMapping("/doctors/{patientId}")
	public Optional<Patient> getPatientById(@PathVariable int patientId) throws ResourceNotFoundException {
		Optional<Patient> patient = patientService.getPatientById(patientId);
		patient.orElseThrow(() -> new ResourceNotFoundException("Doctor not found for this id :: " + patientId));
		return patient;
	}

	@PostMapping("/patients")
	public Patient createPatient(@Validated @RequestBody Patient newPatient) {
		return patientService.createPatient(newPatient);

	}

	@DeleteMapping("/{patientId}")
	public void deletePatient(@PathVariable int patientId) {
		patientService.deletePatient(patientId);
	}


	@PutMapping("/{patientId}")
	public Optional<Patient> updatePatient(@PathVariable(value = "doctorId") Integer patientId,
			@Validated @RequestBody Patient newPatient) {
		return patientService.updatePatient(patientId, newPatient);
	}
}
