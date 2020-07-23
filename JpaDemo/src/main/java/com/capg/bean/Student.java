package com.capg.bean;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="Student_details")
public class Student {
	@Id
	
	private int sid;
	//@Column(name="student_name")
	private String sname;
	private String sbranch;
	public Student(int sid, String sname, String sbranch) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sbranch = sbranch;
	}
	public Student() {
		
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSbranch() {
		return sbranch;
	}
	public void setSbranch(String sbranch) {
		this.sbranch = sbranch;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sbranch=" + sbranch + "]";
	}
	


}
