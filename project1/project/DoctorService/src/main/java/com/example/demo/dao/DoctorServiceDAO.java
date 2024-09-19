package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.example.demo.entities.Doctor;
import com.example.demo.exceptions.ResourceNotFoundException;
import com.example.demo.repo.DoctorRepository;
import com.example.demo.service.DoctorService;

@Service
public class DoctorServiceDAO implements DoctorService {

	@Autowired
	private DoctorRepository doctorRepository;

	@Override
	public Doctor createDoctor(@Validated Doctor newDoctor) {
		return doctorRepository.save(newDoctor);
	}

	@Override
	public List<Doctor> getDoctors() {
		return doctorRepository.findAll();
	}

	@Override
	public Optional<Doctor> getDoctorById(int doctorId) {
		return doctorRepository.findById(doctorId);
	}

	@Override
	public void deleteDoctorById(int doctorId) {
		doctorRepository.deleteById(doctorId);

	}

	@Override
	public ResponseEntity<Doctor> updateDoctor(Integer doctorId, Doctor newDoctor) {
		Optional<Doctor> existingDoctor = doctorRepository.findById(doctorId);

		if (existingDoctor.isPresent()) {
			Doctor doctor = existingDoctor.get();
			doctor.setDoctorName(newDoctor.getDoctorName());
			doctor.setPhone(newDoctor.getPhone());
			doctor.setQualification(newDoctor.getQualification());
			doctor.setExperience(newDoctor.getExperience());
			doctor.setAddress(newDoctor.getAddress());
			doctor.setSpecialization(newDoctor.getSpecialization());
			doctor.setBasicFee(newDoctor.getBasicFee());
			doctorRepository.save(doctor);
		}

		return ResponseEntity.of(existingDoctor);
	}
}
