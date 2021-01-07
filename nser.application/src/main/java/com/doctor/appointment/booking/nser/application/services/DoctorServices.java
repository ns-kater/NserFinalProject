package com.doctor.appointment.booking.nser.application.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctor.appointment.booking.nser.application.beans.doctors;
import com.doctor.appointment.booking.nser.application.repos.DoctorsRepo;



@Service
public class DoctorServices {
	
	@Autowired
	private DoctorsRepo drep;
	
	
	public List<doctors> listAll(){
		return  drep.findAll();
	}
	
	
	public doctors get(Integer DoctorID) {
		
		return drep.findById(DoctorID).orElseThrow(null);
	}
	
	
	public List<doctors> getByLastName(String lastName, String address) {
		
		return drep.findByLastNameAndAddress(lastName, address);
	}
	
	public String addDoctor(doctors doc) {
		
		drep.save(doc);
		
		return "The Doctor has been added";
		
	}
	
	public String removeDoctor(Integer id) {
		
		drep.deleteById(id);
		
		return "The Doctor has been removed";
		
	}
   

}
