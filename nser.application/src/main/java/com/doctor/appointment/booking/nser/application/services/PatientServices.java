package com.doctor.appointment.booking.nser.application.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctor.appointment.booking.nser.application.beans.patients;
import com.doctor.appointment.booking.nser.application.repos.PatientsRepo;

@Service
public class PatientServices {
	
	
	@Autowired
	private PatientsRepo drep;
	
	
	public List<patients> listAllpatients(){
		return  drep.findAll();
	}
	
	public patients get(Integer PatientID) {
		
		return drep.findById(PatientID).orElseThrow(null);
	}
	
	
	public String addPatient(patients pat) {
		
		drep.save(pat);
		
		return "The Patient has been added";
		
	}

}
