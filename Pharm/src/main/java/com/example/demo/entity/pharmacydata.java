package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class pharmacydata {
	@Id
private int medicineid;
	
private String medicinename;
private String type;
private float price;
private int availability;

public pharmacydata(int medicineid, String medicinename, String type, float price, int availability) {
	super();
	this.medicineid = medicineid;
	this.medicinename = medicinename;
	this.type = type;
	this.price = price;
	this.availability = availability;
}

public int getMedicineid() {
	return medicineid;
}

public void setMedicineid(int medicineid) {
	this.medicineid = medicineid;
}

public String getMedicinename() {
	return medicinename;
}

public void setMedicinename(String medicinename) {
	this.medicinename = medicinename;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

public int getAvailability() {
	return availability;
}

public void setAvailability(int availability) {
	this.availability = availability;
}

public pharmacydata() {
	super();
	// TODO Auto-generated constructor stub
}

}
