package com.health.dao;

import java.util.ArrayList;

import com.health.model.Doctor;

public class DoctorDAOImpl  implements DoctorDAO{

	@Override
	public int saveDoctor(Doctor doctor) {
		System.out.println(doctor);
		System.out.println("Doctor saved now");
		return 1;
	}

	@Override
	public ArrayList<Doctor> viewDcotor() {
		// TODO Auto-generated method stub
		return null;
	}

}
