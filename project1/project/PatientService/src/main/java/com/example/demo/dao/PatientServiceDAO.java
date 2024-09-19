package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.Patient;
import com.example.demo.repo.PatientRepository;
import com.example.demo.service.PatientService;

@Service
public class PatientServiceDAO implements PatientService {

	
	@Autowired
	private PatientRepository patientRepository;
	
	@Override
	public List<Patient> getAllPatients() {
		
		return patientRepository.findAll() ;
	}

	@Override
	public Optional<Patient> getPatientById(int patientId) {
		
		return patientRepository.findById(patientId);
	}

	@Override
	public Patient createPatient(Patient newPatient) {
		return patientRepository.save(newPatient);
	}

	@Override
	public void deletePatient(int patientId) {
		patientRepository.deleteById(patientId);
		
	}

	 @Override
	    public Optional<Patient> updatePatient(Integer patientId, Patient newPatient) {
	        Optional<Patient> existingPatient = patientRepository.findById(patientId);
	        
	        if (existingPatient.isPresent()) {
	            Patient patient = existingPatient.get();
	            patient.setPatientName(newPatient.getPatientName());
	            patient.setGender(newPatient.getGender());
	            patient.setAge(newPatient.getAge());
	            patient.setPhoneNo(newPatient.getPhoneNo());
	            patient.setAddress(newPatient.getAddress());
	           // patient.setDoctorId(newPatient.getDoctorId());
	            patientRepository.save(patient);
	        }
	        
	        return existingPatient;
	    }

//	 @Override
//	    public Optional<Patient> getPatientsByDoctorId(int doctorId) {
//	        return patientRepository.findById((long) doctorId);
//	    }

	@Override
	public List<Patient> getPatientsByDoctor(@PathVariable int doctorId) {
		// TODO Auto-generated method stub
		return patientRepository.findByDoctorId(doctorId);
	}
}
