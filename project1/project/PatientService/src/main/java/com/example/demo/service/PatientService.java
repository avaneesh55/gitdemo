package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Patient;

public interface PatientService {

	List<Patient> getAllPatients();

	Optional<Patient> getPatientById(int patientId);

	Patient createPatient(Patient newPatient);

	void deletePatient(int patientId);

	Optional<Patient> updatePatient(Integer patientId, Patient newPatient);

	//Optional<Patient> getPatientsByDoctorId(int doctorId);

	List<Patient> getPatientsByDoctor(int doctorId);
}
