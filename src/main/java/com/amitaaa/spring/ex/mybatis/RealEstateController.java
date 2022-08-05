package com.amitaaa.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.amitaaa.spring.ex.mybatis.bo.RealEstateBO;
import com.amitaaa.spring.ex.mybatis.model.RealEstate;

@Controller
public class RealEstateController {
	
	@Autowired
	private RealEstateBO realEstateBO;
	
	@RequestMapping("/lesson03/test01/1")
	@ResponseBody
	public RealEstate realEstate(@RequestParam("id") int id) {
		
		RealEstate realEstate = realEstateBO.getRealEstate(id);
		return realEstate;
	}
	
	
	@RequestMapping("/lesson03/test01/2")
	@ResponseBody
	public RealEstate rentPrice(@RequestParam("rentPrice") Integer rentPrice) {
		
		RealEstate rentprice = realEstateBO.getRentPrice(rentPrice);
		return rentprice;
		
	}
	

}
