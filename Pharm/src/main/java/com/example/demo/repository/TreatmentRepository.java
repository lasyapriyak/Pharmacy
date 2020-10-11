package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.treatment;

public interface TreatmentRepository extends CrudRepository<treatment,Integer>{
	
public treatment findByTreatmentid(Integer treatmentid);


}
