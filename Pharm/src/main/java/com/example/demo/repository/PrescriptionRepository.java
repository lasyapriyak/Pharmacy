package com.example.demo.repository;

import java.util.Iterator;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.prescription;

public interface PrescriptionRepository extends CrudRepository<prescription,Integer> {

	public Iterable<prescription> findByTreatmentid(Integer treatmentid);
//	public Iterable<Integer> getMed(Integer treatmentid)
//	{
//		Iterable<Integer> i;
//		ArrayList<Integer> q=new ArrayList<Integer>();
//		
//	}
}
