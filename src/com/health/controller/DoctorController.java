package com.health.controller;

import com.health.model.Doctor;
import com.health.service.DoctorServiceImpl;
import com.health.service.DoctorServices;

public class DoctorController {
	
	public void viewAppointment()
	{
		System.out.println("Below is Appointment time");
		int count=1;
		for(int i=1;i<=24;i++)
		{
			
			if(i<12) {
			System.out.println("Appointment "+count+" at "+i+"am");
			i++;
			}
			else {
				System.out.println("Appointment "+count+" at "+i+"pm");
				i++;
			}
			count++;
				
		}
		
	}
	public void viewReports()
	{
		System.out.println("Reports As Per Paisents");
		int count=1;
		for(int i=1;i<=24;i++)
		{
			
			System.out.println("-----Doctor "+i +" viewng Report ");
				
		}
		
	}
	public static void main(String[] args) {
		DoctorController doc=new DoctorController();
		doc.viewAppointment();
		
		Doctor doctor=new Doctor();
		doctor.setD_id(1001);
		doctor.setName("Porus");
		doctor.setProblem("Mouth Pain");
		doctor.setTmeslot(10);
		
		DoctorServices doctorServices=new DoctorServiceImpl();
		
		doctorServices.saveDoctor(doctor);
		
		
		
		
		
		
		
		
		
	}

}
