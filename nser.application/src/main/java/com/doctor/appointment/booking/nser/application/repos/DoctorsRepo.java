package com.doctor.appointment.booking.nser.application.repos;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctor.appointment.booking.nser.application.beans.doctors;

@Repository(value="DoctorsRepo")
public interface DoctorsRepo extends JpaRepository<doctors,Integer>{

	public List<doctors> findByLastNameAndAddress(String lastName, String address);


}
