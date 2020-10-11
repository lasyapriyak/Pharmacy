package com.example.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.pharmacydata;
import com.example.demo.entity.prescription;
import com.example.demo.repository.PharmacyDataRepository;
import com.example.demo.repository.PrescriptionRepository;

@Service
public class PrescriptionService {

	@Autowired
	public PrescriptionRepository r;
	@Autowired
	public PharmacyDataRepository rr;
	
	public Iterable<pharmacydata> getMedicines(Integer treatmentid)
	{

		Iterable<prescription> p=r.findByTreatmentid(treatmentid);
		Iterable<pharmacydata> pp;
		ArrayList<pharmacydata> a=new ArrayList<pharmacydata>();
		for(prescription i:p)
		{
//			pp.iterator(rr.findByMedicineid(i.getMedicineid()));
			System.out.println(i.getMedicineid());
			pharmacydata y= rr.findByMedicineid(i.getMedicineid());
			System.out.println(y.getMedicinename()+" "+y.getPrice());
			a.add(y);
		}
		for(pharmacydata i:a)
		{
			System.out.println(i.getMedicineid()+" "+i.getMedicinename());
		}
		pp=a;
		return pp;
		
		
		
	}
	
	public float getBillAmt(Integer treatmentid)
	{
		Iterable<prescription> p=r.findByTreatmentid(treatmentid);
		Iterable<pharmacydata> pp;
		ArrayList<pharmacydata> a=new ArrayList<pharmacydata>();
		float s=0.0f;
		for(prescription i:p)
		{
//			pp.iterator(rr.findByMedicineid(i.getMedicineid()));
//			System.out.println(i.getMedicineid());
			pharmacydata y= rr.findByMedicineid(i.getMedicineid());
			System.out.println("Prev Availability: "+y.getAvailability());
			if(y.getAvailability()>=i.getQuantity() && i.isStatus()==false)
			{
			System.out.println(y.getMedicinename()+" "+y.getPrice());
			s=s+y.getPrice();
			i.setStatus(true);
			y.setAvailability(y.getAvailability()-i.getQuantity());
			}
			System.out.println("After "+y.getAvailability());
	
//			a.add(y);
		}
		
		
		return s;
	}
}

