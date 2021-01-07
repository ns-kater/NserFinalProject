package com.doctor.appointment.booking.nser.application.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctor.appointment.booking.nser.application.beans.patients;


@Repository(value="PatientsRepo")
public interface PatientsRepo extends JpaRepository<patients,Integer>{

}
