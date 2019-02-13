package com.health.service;

import java.util.ArrayList;

import com.health.dao.DoctorDAO;
import com.health.dao.DoctorDAOImpl;
import com.health.model.Doctor;

public class DoctorServiceImpl implements DoctorServices{
	DoctorDAO doctorimpl;
	
	public DoctorServiceImpl() {
		doctorimpl=new DoctorDAOImpl();
		
	}

	@Override
	public int saveDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return doctorimpl.saveDoctor(doctor);
	}

	@Override
	public ArrayList<Doctor> viewDcotor() {
		// TODO Auto-generated method stub
		return doctorimpl.viewDcotor();
	}

}
