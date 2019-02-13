package com.health.dao;

import java.util.ArrayList;

import com.health.model.Doctor;

public interface DoctorDAO {

	public int saveDoctor(Doctor doctor);
	public ArrayList<Doctor> viewDcotor();
}
