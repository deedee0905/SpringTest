package com.amitaaa.spring.ex.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.amitaaa.spring.ex.mybatis.bo.RealEstateBO;
import com.amitaaa.spring.ex.mybatis.model.RealEstate;

@Controller
@RequestMapping("/lesson03/test01")
public class RealEstateController {
	
	@Autowired
	private RealEstateBO realEstateBO;
	
	@RequestMapping("/1")
	@ResponseBody
	public RealEstate realEstate(@RequestParam("id") int id) {
		
		RealEstate realEstate = realEstateBO.getRealEstate(id);
		return realEstate;
	}
	
	
	@RequestMapping("/2")
	@ResponseBody
	public List<RealEstate> realEstateAsRentPrice(@RequestParam("rentPrice") int rent) {
		List<RealEstate> realRentPrice = realEstateBO.getRealEstateAsRentPrice(rent);
		return realRentPrice;
	}
	
	@RequestMapping("/3")
	@ResponseBody
	public List<RealEstate> realEstateBothConditions(@RequestParam("area") int area, @RequestParam("price") int price) {
		List<RealEstate> bothConditions = realEstateBO.getRealEstateBothConditions(area, price);
		return bothConditions;
	}
	
	
	

}
