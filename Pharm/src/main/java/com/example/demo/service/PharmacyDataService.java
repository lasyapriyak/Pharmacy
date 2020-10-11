package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.pharmacydata;
import com.example.demo.repository.PharmacyDataRepository;

@Service
public class PharmacyDataService {

	@Autowired
	private PharmacyDataRepository repo;
	
	public pharmacydata findMedicine(Integer medicineid)
	{
		return repo.findByMedicineid(medicineid);
	}
}
