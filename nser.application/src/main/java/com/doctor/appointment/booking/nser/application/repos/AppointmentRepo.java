package com.doctor.appointment.booking.nser.application.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctor.appointment.booking.nser.application.beans.appointment;

@Repository(value="AppointmentRepo")
public interface AppointmentRepo extends JpaRepository<appointment,Integer>{

}
