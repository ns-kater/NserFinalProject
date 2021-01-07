package com.doctor.appointment.booking.nser.application.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="patients")
@Table(name = "patients", schema = "doctorsappointment")
public class patients {
	
	@Id
	@Column(name="patientid")
	private int patientid;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="Contact")
	private String Contact;

	public patients() {

	}

	public patients(int patinetID, String firstname, String lastname, String contact) {
		patientid = patinetID;
		firstName = firstname;
		lastName = lastname;
		Contact = contact;
	}

	
	public int getPatinetID() {
		return patientid;
	}

	public void setPaitnetID(int patinetID) {
		patientid = patinetID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstname) {
		firstName = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastname) {
		lastName = lastname;
	}

	public String getContact() {
		return Contact;
	}

	public void setContact(String contact) {
		Contact = contact;
	}

}
