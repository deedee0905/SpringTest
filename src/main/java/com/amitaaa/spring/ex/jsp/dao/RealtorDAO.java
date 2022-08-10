package com.amitaaa.spring.ex.jsp.dao;

import org.springframework.stereotype.Repository;

import com.amitaaa.spring.ex.jsp.model.Realtor;

@Repository
public interface RealtorDAO {
	
	public int insertRealtorByObject(Realtor realtor);

}
