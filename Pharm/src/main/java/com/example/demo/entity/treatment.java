package com.example.demo.entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class treatment {
	@Id
	private int treatmentid;
	
private int patientid;
private int physicianid;
private int labid;
private Date date;
private Time time;
private int status;
public int getTreatmentid() {
	return treatmentid;
}
public void setTreatmentid(int treatmentid) {
	this.treatmentid = treatmentid;
}
public int getPatientid() {
	return patientid;
}
public void setPatientid(int patientid) {
	this.patientid = patientid;
}
public int getPhysicianid() {
	return physicianid;
}
public void setPhysicianid(int physicianid) {
	this.physicianid = physicianid;
}
public int getLabid() {
	return labid;
}
public void setLabid(int labid) {
	this.labid = labid;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public Time getTime() {
	return time;
}
public void setTime(Time time) {
	this.time = time;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
public treatment(int treatmentid, int patientid, int physicianid, int labid, Date date, Time time, int status) {
	super();
	this.treatmentid = treatmentid;
	this.patientid = patientid;
	this.physicianid = physicianid;
	this.labid = labid;
	this.date = date;
	this.time = time;
	this.status = status;
}
public treatment() {
	super();
	// TODO Auto-generated constructor stub
}


}
