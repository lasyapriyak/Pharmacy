package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class prescription {

	@Id
	private int prescriptionid;
	
	
	private int treatmentid;
	
	private int patientid;
	private int medicineid;
	private boolean status;
	private int quantity;
	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public prescription(int prescriptionid, int treatmentid, int patientid, int medicineid,boolean status,int quantity) {
		super();
		this.prescriptionid = prescriptionid;
		this.treatmentid = treatmentid;
		this.patientid = patientid;
		this.medicineid = medicineid;
		this.status=status;
		this.quantity=quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getPrescriptionid() {
		return prescriptionid;
	}

	public void setPrescriptionid(int prescriptionid) {
		this.prescriptionid = prescriptionid;
	}

	public int getTreatmentid() {
		return treatmentid;
	}

	public void setTreatmentid(int treatmentid) {
		this.treatmentid = treatmentid;
	}

	public int getMedicineid() {
		return medicineid;
	}

	public void setMedicineid(int medicineid) {
		this.medicineid = medicineid;
	}

	public int getPatientid() {
		return patientid;
	}

	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}

	public prescription() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
