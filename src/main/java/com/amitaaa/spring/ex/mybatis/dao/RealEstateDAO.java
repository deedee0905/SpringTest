package com.amitaaa.spring.ex.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.amitaaa.spring.ex.mybatis.model.RealEstate;

@Repository
public interface RealEstateDAO {
	
	public RealEstate selectRealEstate(@Param("id") int id);
	
	public List<RealEstate> selectRealEstateAsRentPrice(@Param("rentPrice") int rent);
	
	public List<RealEstate> selectRealEstateBothConditions(@Param("area") int area, @Param("price") int price);
	
	public int insertRealEstateByObject(
			@Param("realtorId") int realtorId
			, @Param("address") String address
			, @Param("area") int area
			, @Param("type") String type
			, @Param("price") int Price
			);
	
	
	public int insertRealEstateByField(RealEstate realEstate);
	
	public int update(@Param("id") int id,
			@Param("type") String type ,
			@Param("price") int price);
	
	public int delete(@Param("id") int id);
	

}
