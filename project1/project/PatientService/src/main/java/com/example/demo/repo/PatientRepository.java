package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer>{
	
	//@Query(value="select p from patient p where p.doctorId = :docId")
	List<Patient> findByDoctorId(Integer doctorId);

}
