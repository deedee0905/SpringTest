package com.amitaaa.spring.ex.mybatis.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amitaaa.spring.ex.mybatis.dao.RealEstateDAO;
import com.amitaaa.spring.ex.mybatis.model.RealEstate;

@Service
public class RealEstateBO {
	
	@Autowired
	private RealEstateDAO realEstateDAO;
	
	public RealEstate getRealEstate(int id) {
		RealEstate realEstate = realEstateDAO.selectRealEstate(id);
		return realEstate;
	}
	
	
	public List<RealEstate> getRealEstateAsRentPrice(int rent) {
		List<RealEstate> realEstateAsRentPrice = realEstateDAO.selectRealEstateAsRentPrice(rent);
		return realEstateAsRentPrice;
	}
	
	
	public List<RealEstate> getRealEstateBothConditions(int area, int price) {
		return realEstateDAO.selectRealEstateBothConditions(area, price);
	}
	
	// 객체로 인서트
	public int addRealEstateByObject(int realtorId, String address, int area, String type, int price) {
		return realEstateDAO.insertRealEstateByObject(realtorId, address, area, type, price);
	}
	
	// 필드로 인서트
	public int addRealEstateByField(RealEstate realEstate) {
	
		return realEstateDAO.insertRealEstateByField(realEstate);
	}
	

	
	public int updateRealEstate(int id, String type, int price) {
		return realEstateDAO.update(id, type, price);
	}

	public int deleteRealEstate(int id) {
		return realEstateDAO.delete(id);
	}

}
