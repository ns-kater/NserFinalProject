package com.doctor.appointment.booking.nser.application.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctor.appointment.booking.nser.application.beans.appointment;
import com.doctor.appointment.booking.nser.application.repos.AppointmentRepo;

@Service
public class AppointmentServices {
	
	@Autowired
	private AppointmentRepo drep;
	
	
	public List<appointment> listAllappoint(){
		return  drep.findAll();
	}
	
	
	public appointment get(Integer AppointmentID) {
		
		return drep.findById(AppointmentID).orElseThrow(null);
	}
	
	public String creatappointment(appointment appoint) {
		
		drep.save(appoint);
		
		return "The appiontment has been booked";
		
	}
	
	public void updateppointment(appointment appoint) {
		
		drep.save(appoint);
	
	}
	
	public void removeAppointment (Integer id) {
		
		drep.deleteById(id);
		
	}
	
//	 public appointment updateStatus(Integer appointmentId, appointment appoint) {
//
//	        Optional<appointment> appointmentList = drep.findById(appointmentId);
//
//	        if(appointmentList.isPresent()){
//	            if(appoint.getStatus() != 0){
//	                appointmentList.get().setStatus(appoint.getStatus());
//	            }
//	            return drep.save(appointmentList.get());
//	        }
//	        return null;
//	    }
//	

}
