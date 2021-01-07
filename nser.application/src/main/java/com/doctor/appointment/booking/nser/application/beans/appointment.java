package com.doctor.appointment.booking.nser.application.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="appointment")
@Table(name = "appointment", schema = "doctorsappointment")
public class appointment {

	@Id
	@Column(name="appointmentID")
	private int AppointmentID;
	@Column(name="DoctorID")
	private int DoctorID;
	@Column(name="PatientID")
	private int PatientID;
	@Column(name="start_date")
	private Date StartDate;
	@Column(name="end_date")
	private Date EndDate;
	@Column(name="Status")
	private int Status;

	public appointment() {

	}

	public appointment(int appointmentID, int doctorID, int patientID, Date startdate, Date endtdate, int status) {
		AppointmentID = appointmentID;
		DoctorID = doctorID;
		PatientID = patientID;
		StartDate = startdate;
		EndDate = endtdate;
		Status = status;
	}

	
	public int getAppointmentID() {
		return AppointmentID;
	}

	public void setAppointmentID(int appointmentID) {
		AppointmentID = appointmentID;
	}

	public int getDoctorID() {
		return DoctorID;
	}

	public void setDoctorID(int doctorID) {
		DoctorID = doctorID;
	}

	public int getPatientID() {
		return PatientID;
	}

	public void setPatientID(int patientID) {
		PatientID = patientID;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startdate) {
		StartDate = startdate;
	}

	public Date getEndtDate() {
		return EndDate;
	}

	public void setEndtDate(Date endtdate) {
		EndDate = endtdate;
	}

	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		Status = status;
	}

}
