package com.doctor.appointment.booking.nser.application.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;


 
@Entity(name="doctors")
@Table(name = "doctors", schema = "doctorsappointment")
@EntityListeners(AuditingEntityListener.class)
public class doctors {

	@Id
	@Column(name="DoctorID")
	private Integer DoctorID;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="Address")
	private String address;
	@Column(name="Speciality")
	private String Speciality;

	public doctors() {

	}

	public doctors(Integer doctorID, String firstname, String lastname, String Address, String speciality) {
		DoctorID = doctorID;
		firstName = firstname;
		lastName = lastname;
		address = Address;
		Speciality = speciality;
	}

	
	public Integer getDoctorID() {
		return DoctorID;
	}

	public void setDoctorID(Integer doctorID) {
		DoctorID = doctorID;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String Address) {
		address = Address;
	}

	public String getSpeciality() {
		return Speciality;
	}

	public void setSpeciality(String speciality) {
		Speciality = speciality;
	}

}
