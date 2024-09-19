package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Event;
import com.example.entity.Participant;
import java.util.List;


public interface ParticipantRepository extends JpaRepository<Participant, Long>{
	
	List<Participant> findByEvent(Event event);

}
