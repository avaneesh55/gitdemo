package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Event;
import com.example.exception.ResourceNotFoundException;
import com.example.repository.EventRepository;
import com.example.service.EventService;

@Service
public class EventServiceImpl implements EventService {
	
	@Autowired
	EventRepository EventRepo;

	@Override
	public List<Event> getAllEvents() {
		return EventRepo.findAll();
	}

	@Override
	public Event getEventById(Long id) throws ResourceNotFoundException {
		return EventRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Event not found"));
		
	}

	@Override
	public Event createEvent(Event event) {
		return EventRepo.save(event);
	}

	@Override
	public Event updateEvent(Long id, Event event) throws ResourceNotFoundException {
		Event exsistEvent =  EventRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Event not found"));
		
		exsistEvent.setName(event.getName());
		exsistEvent.setDate(event.getDate());
		exsistEvent.setTime(event.getTime());
		exsistEvent.setDescription(event.getDescription());
		exsistEvent.setLocation(event.getLocation());
		exsistEvent.setOrganizer(event.getOrganizer());
		
		return EventRepo.save(exsistEvent);
	}

	@Override
	public boolean deleteEvent(Long id) throws ResourceNotFoundException {
		EventRepo.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("Event not found"));
		return true;
	}

	

}
