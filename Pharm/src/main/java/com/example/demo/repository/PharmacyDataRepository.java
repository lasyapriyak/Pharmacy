package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.pharmacydata;


public interface PharmacyDataRepository extends CrudRepository<pharmacydata,Integer>{

	public pharmacydata findByMedicineid(Integer medicineid);
	
//	public Iterable<pharmacydata> findByMedicineid(Iterable<Integer> medicineid);
}
