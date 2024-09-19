package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Event;
import com.example.entity.Participant;
import com.example.exception.ResourceNotFoundException;
import com.example.repository.EventRepository;
import com.example.repository.ParticipantRepository;
import com.example.service.ParticipantService;


@Service
public class ParticipantServiceImpl implements ParticipantService {
	
	@Autowired
	ParticipantRepository participantRepo;
	@Autowired
	EventRepository eventRepo;

	@Override
	public List<Participant> getParticipantByEventId(long eventId) throws ResourceNotFoundException {
		Event event = eventRepo.findById(eventId)
				.orElseThrow(() -> new ResourceNotFoundException("Event not found"));
		return participantRepo.findByEvent(event);
	}

	@Override
	public Participant getParticipantsById(long id) throws ResourceNotFoundException {
		
		return participantRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Participant not found"));
	}

	@Override
	public Participant createParticipant(Participant participant) {
		
		return participantRepo.save(participant);
	}

	@Override
	public Participant updateParticipant(long id, Participant participant) throws ResourceNotFoundException {
		Participant exParticipant = participantRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Participant not found"));
		
		exParticipant.setName(participant.getName());
		exParticipant.setEmail(participant.getEmail());
		exParticipant.setPhone(participant.getPhone());
		exParticipant.setRegistrationStatus(participant.getRegistrationStatus());
		
		return participantRepo.save(exParticipant);
		
	}

	@Override
	public boolean deleteParticipant(long id) throws ResourceNotFoundException {
		participantRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Participant not found"));
		
		return true;
	}

	
}
