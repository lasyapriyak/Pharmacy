package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.treatment;
import com.example.demo.repository.TreatmentRepository;
@Service
public class TreatmentService {
	
	@Autowired
	public TreatmentRepository repo;
	
	public treatment findTreatment(Integer treatmentid)
	{
		return repo.findByTreatmentid(treatmentid);
	}
	
	public Iterable<treatment> getAllTreatment()
	{
		return repo.findAll();
	}
	

}
