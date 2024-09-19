package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Event;
import com.example.entity.Participant;
import com.example.exception.ResourceNotFoundException;
import com.example.service.EventService;
import com.example.service.ParticipantService;

@RestController
@RequestMapping("/api/participant")
public class ParticipantController {
	
	@Autowired
	ParticipantService partService;
	@Autowired
	EventService evtService;
	
	// http://localhost:9898/api/participant/event/102
	@GetMapping("/event/{eventId}")
	public ResponseEntity<List<Participant>> getParticipantByEventId(@PathVariable long eventId)  throws ResourceNotFoundException{
		List<Participant> prtList = partService.getParticipantByEventId(eventId);
		return ResponseEntity.ok().body(prtList);
	}
	
	// http://localhost:9898/api/participant/3
	@GetMapping("/{pId}")
	public ResponseEntity<Participant> getParticipantsById(@PathVariable long pId) throws ResourceNotFoundException {
		Participant part = partService.getParticipantsById(pId);
		return ResponseEntity.ok().body(part);
	}
	
	// http://localhost:9898/api/participant
	@PostMapping
	public ResponseEntity<Participant> createParticipant(@RequestBody Participant participant)  throws ResourceNotFoundException {
		Event event = evtService.getEventById(participant.getEventId());
		participant.setEvent(event);
		
		Participant part = partService.createParticipant(participant);
		return ResponseEntity.ok().body(part);
	}
	
	// http://localhost:9898/api/participant/1
	@PutMapping("/{pId}")
	public ResponseEntity<Participant> 
		updateParticipant(@PathVariable long pId, @RequestBody Participant participant)  throws ResourceNotFoundException{
		
		Participant part = partService.updateParticipant(pId, participant);
		return ResponseEntity.ok().body(part);
	}
	
	// http://localhost:9898/api/participant/2
	@DeleteMapping("/{pId}")
	public ResponseEntity<Boolean> deleteParticipant(@PathVariable long pId)  throws ResourceNotFoundException{
		boolean flag = partService.deleteParticipant(pId);
		return ResponseEntity.ok().body(flag);
	}
	
	
	

}
