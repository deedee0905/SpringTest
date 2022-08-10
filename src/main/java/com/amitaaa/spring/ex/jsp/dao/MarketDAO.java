package com.amitaaa.spring.ex.jsp.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.amitaaa.spring.ex.jsp.model.Market;

@Repository
public interface MarketDAO {
	
	public int insertSeller(
			
			@Param("nickname") String nickname
			, @Param("profileImage") String profileImage
			, @Param("temperature") double temperature
			);
	
	public Market selectSeller();

}
