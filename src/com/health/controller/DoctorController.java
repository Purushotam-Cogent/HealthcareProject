package com.health.controller;

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
	
	public static void main(String[] args) {
		DoctorController doc=new DoctorController();
		doc.viewAppointment();
	}

}
