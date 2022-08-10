package com.amitaaa.spring.ex.jsp.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amitaaa.spring.ex.jsp.dao.RealtorDAO;
import com.amitaaa.spring.ex.jsp.model.Realtor;

@Service
public class RealtorBO {
	
	@Autowired
	private RealtorDAO realtorDAO;
	
	//인서트할꺼니까 타입 인트
	public int addRealtorByObject(Realtor realtor) {
		return realtorDAO.insertRealtorByObject(realtor);
		
	}

}
