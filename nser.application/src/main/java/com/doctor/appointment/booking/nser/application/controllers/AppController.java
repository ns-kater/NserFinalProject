package com.doctor.appointment.booking.nser.application.controllers;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.doctor.appointment.booking.nser.application.beans.appointment;
import com.doctor.appointment.booking.nser.application.beans.doctors;
import com.doctor.appointment.booking.nser.application.beans.patients;
import com.doctor.appointment.booking.nser.application.services.AppointmentServices;
import com.doctor.appointment.booking.nser.application.services.DoctorServices;
import com.doctor.appointment.booking.nser.application.services.PatientServices;

@RestController
public class AppController {

	@Autowired
	private DoctorServices DocServ;
	
	@Autowired
	private PatientServices PatServ;
	
	@Autowired
	private AppointmentServices AppServ;
	
	@GetMapping("/doctors")
	public List<doctors> listAllDoctors() {
		return DocServ.listAll();
	}
	
	@GetMapping("/getdocByid")
	public doctors getDoctorByID(@RequestParam Integer id) {
		try {
		return DocServ.get(id);
		} catch(NoSuchElementException e) {
			return null;
		}
	}
	
	@GetMapping("/getdocBylastnamAndLocation")
	public List<doctors> getDoctorByLastName(@RequestParam String lastName, @RequestParam String address ) {
		return DocServ.getByLastName(lastName, address);
	}
	
	@PostMapping("/doctors")
	public String AddDoctor(@RequestBody doctors doctor) {
		
		return DocServ.addDoctor(doctor);
	}
	
	@DeleteMapping("/doctors/{id}")
	public String RemoveDoctor(@PathVariable Integer id) {
		
		return DocServ.removeDoctor(id);
	}
	
	/**************************************************************************/
	
	@GetMapping("/patients")
	public List<patients> listAllpatients() {
		return PatServ.listAllpatients();
	}
	
	@PostMapping("/patients")
	public String AddPatient(@RequestBody patients pat) {
		
		return PatServ.addPatient(pat);
	}
	@GetMapping("/patients/{id}")
	public patients getPatientByID(@PathVariable Integer id) {
		try {
		return PatServ.get(id);
		} catch(NoSuchElementException e) {
			return null;
		}
	}
	
	/***************************************************************************/
	
	
	@GetMapping("/appointments")
	public List<appointment> listAllAppoint() {
		return AppServ.listAllappoint();
	}
	
	@PostMapping("/appointments")
	public String bookAppointment(@RequestBody appointment appoint) {
		
		return AppServ.creatappointment(appoint);
			
	}
	
	@PutMapping("/appointments/{id}")
	public ResponseEntity<?> updateAppointment(@RequestBody appointment appoint, @PathVariable Integer id) {
		
		try {
		appointment existAppointment = AppServ.get(id);
		AppServ.updateppointment(appoint);
		return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@DeleteMapping("/appointments/{id}")
	public void deleteAppointment(@PathVariable Integer id) {			
		AppServ.removeAppointment(id);		
		
	}
			

}
