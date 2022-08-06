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
	
	

	

}
