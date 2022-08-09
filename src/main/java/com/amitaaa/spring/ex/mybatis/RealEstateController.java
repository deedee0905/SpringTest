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
	
	// 객체로 insert 하기
	@RequestMapping("/4")
	@ResponseBody
	public String realEstateByObject() {
		
		int count = realEstateBO.addRealEstateByObject(3, "푸르지용 리버 303동 1104호", 89, "매매", 100000);
		
		return "삽입 결과 : " + count ;
	}
	
	
	//field 로 insert 하기
	@RequestMapping("/5")
	@ResponseBody
	public String realEstateByField() {
		
		RealEstate realEstate = new RealEstate();
		realEstate.setRealtorId(5);
		realEstate.setAddress("썅떼빌리버 오피스텔 814호");
		realEstate.setArea(45);
		realEstate.setType("월세");
		realEstate.setPrice(100000);
		realEstate.setRentPrice(120);
		
		int count = realEstateBO.addRealEstateByField(realEstate);
		
		return "삽입 결과 : " + count;
	}
	
	
	@RequestMapping("/6")
	@ResponseBody
	public String realEstateUpdate() {
		
		int count = realEstateBO.updateRealEstate(24, "전세", 70000);
		return "변경완료 : " + count;
		
	}
	
	@RequestMapping("/7")
	@ResponseBody
	public String realEstateDelete(@RequestParam("id") int id) {
		int count = realEstateBO.deleteRealEstate(id);
		return "삭제 결과 : " + count;
	}
	
	

}
