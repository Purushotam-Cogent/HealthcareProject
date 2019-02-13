package com.health.model;

public class Doctor {
	private int d_id;
	private String name;
	private String problem;
	private int tmeslot;
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	public int getTmeslot() {
		return tmeslot;
	}
	public void setTmeslot(int tmeslot) {
		this.tmeslot = tmeslot;
	}
	@Override
	public String toString() {
		return "Doctor [d_id=" + d_id + ", name=" + name + ", problem=" + problem + ", tmeslot=" + tmeslot + "]";
	}
	
	
	

}
