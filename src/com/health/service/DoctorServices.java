package com.health.service;

import java.util.ArrayList;

import com.health.model.Doctor;

public interface DoctorServices {

	public int saveDoctor(Doctor doctor);
	public ArrayList<Doctor> viewDcotor();
	
}
