
package com.example.entity;



import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Participant")
public class Participant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotBlank
	@NotNull
	private String name;
	
	@NotBlank
	@NotNull
	@Email
	private String email;
	@NotBlank
	@NotNull
	private String phone;
	@NotBlank
	@NotNull
	private String registrationStatus;

	@NotNull
	private long eventId;


	@ManyToOne
	@JoinColumn(name = "events_id")
	@JsonBackReference
	private Event event;

	public Participant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Participant(String name, String email, String phone, String registrationStatus, Event event) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.registrationStatus = registrationStatus;
		this.event = event;
	}

	public String getName() {
		return name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRegistrationStatus() {
		return registrationStatus;
	}

	public void setRegistrationStatus(String registrationStatus) {
		this.registrationStatus = registrationStatus;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}
	
	public long getEventId() {
		return eventId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	
}

