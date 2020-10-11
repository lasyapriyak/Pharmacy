package com.example.demo.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.pharmacydata;
import com.example.demo.entity.treatment;
import com.example.demo.service.PharmacyDataService;
import com.example.demo.service.PrescriptionService;
import com.example.demo.service.TreatmentService;

@RestController
public class HomeController {
	@Autowired
	private TreatmentService service;
	@Autowired
	private PharmacyDataService s;
	@Autowired
	private PrescriptionService ss;
	
	
	@GetMapping("/allUser")	
	@CrossOrigin
	public Iterable<treatment> findAllUser()
	{
		return service.getAllTreatment();
	}
	
	@GetMapping("/byTreatmentId/{treatmentid}")
	@Transactional
	@CrossOrigin	
	public treatment getByTreatmentId(@PathVariable Integer treatmentid)
	{
		return service.findTreatment(treatmentid);
	}
	
	@GetMapping("/MedicinebyTreatentId/{treatmentid}")
	@Transactional
	public Iterable<pharmacydata> getByMedicineId(@PathVariable Integer treatmentid)
	{
		return ss.getMedicines(treatmentid);
		
	}
	@GetMapping("/PharmacyBillAmount/{treatmentid}")
	@Transactional
	public float getPharmacyBillAmt(@PathVariable Integer treatmentid)
	{
	
		return ss.getBillAmt(treatmentid);
	}
}
