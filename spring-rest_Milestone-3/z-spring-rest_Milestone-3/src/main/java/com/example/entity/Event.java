package com.example.entity;



import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "event")
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	private String name;
	
//	@NotBlank
	@NotNull
	@JsonFormat(pattern = "dd/MM/yyyy")
	private String date;
	
//	@NotBlank
	@NotNull
	@JsonFormat(pattern = "hh:mm:ss a")
	private String time;
	
	@NotBlank (message = "Should be there")
	@NotNull 
	private String location;
	
	private String description;
	@NotBlank
	@NotNull
	private String organizer;
	
	@OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	List<Participant> participant = new ArrayList<>();
	
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Event(String name, String date, String time, String location, String description, String organizer) {
		super();
		this.name = name;
		this.date = date;
		this.time = time;
		this.location = location;
		this.description = description;
		this.organizer = organizer;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOrganizer() {
		return organizer;
	}
	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}
}
	
	
	

