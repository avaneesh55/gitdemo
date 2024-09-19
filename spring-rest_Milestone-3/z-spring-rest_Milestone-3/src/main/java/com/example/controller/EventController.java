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
import com.example.exception.ResourceNotFoundException;
import com.example.service.EventService;

@RestController
@RequestMapping("/api/Events")
public class EventController {
	
	@Autowired
	EventService evtService; 
	
	// http://localhost:9898/api/Events
	@GetMapping
	public ResponseEntity<List<Event>> getAllEvents() {
		List<Event> eList = evtService.getAllEvents();
		return ResponseEntity.ok().body(eList);		
	}
	
	// http://localhost:9898/api/Events/1
	@GetMapping("/{id}")
	public ResponseEntity<Event> getEventById(@PathVariable Long id) throws ResourceNotFoundException{
		Event event = evtService.getEventById(id);
		return ResponseEntity.ok().body(event);			
	}
	
	// http://localhost:9898/api/Events
	@PostMapping
	public ResponseEntity<Event> createEvent(@RequestBody Event event){
		Event nevent = evtService.createEvent(event);
		return ResponseEntity.ok().body(nevent);
	}
	
	// http://localhost:9898/api/Events/1
	@PutMapping("/{id}")
	public ResponseEntity<Event> updateEvent(@PathVariable Long id, @RequestBody Event event) throws ResourceNotFoundException{
		Event nevent = evtService.updateEvent(id,event);
		return ResponseEntity.ok().body(nevent);
	}
	
	// http://localhost:9898/api/Events/1
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteEvent(@PathVariable Long id) throws ResourceNotFoundException{
		boolean flag = evtService.deleteEvent(id);
		return ResponseEntity.ok().body(flag);
	}
	
	
	
	
	
	
	
	
	
	
	

}
