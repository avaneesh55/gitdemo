package com.example.service;

import java.util.List;


import com.example.entity.Participant;
import com.example.exception.ResourceNotFoundException;

public interface ParticipantService {
	
	List<Participant> getParticipantByEventId(long id) throws ResourceNotFoundException;

	Participant getParticipantsById(long id) throws ResourceNotFoundException;

	Participant createParticipant(Participant participant);

	Participant updateParticipant(long id, Participant participant) throws ResourceNotFoundException;

	boolean deleteParticipant(long id) throws ResourceNotFoundException;
}
