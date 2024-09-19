package com.example.service;

import java.util.List;

import com.example.entity.Event;
import com.example.exception.ResourceNotFoundException;

public interface EventService {
	
	List<Event> getAllEvents();

	Event getEventById(Long id) throws ResourceNotFoundException;

	Event createEvent(Event event);

	Event updateEvent(Long id, Event event) throws ResourceNotFoundException;

	boolean deleteEvent(Long id) throws ResourceNotFoundException;

}
