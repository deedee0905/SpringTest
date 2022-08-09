package com.amitaaa.spring.ex.jsp.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amitaaa.spring.ex.jsp.dao.MarketDAO;
import com.amitaaa.spring.ex.jsp.model.Market;

@Service
public class MarketBO {
	
	@Autowired
	private MarketDAO marketDAO;
	
	public int addSeller(String nickname, String profile, double temperature) {
		return marketDAO.insertSeller(nickname, profile, temperature);
	}
	
	// 셀러 출력
	public Market getSellerId() {
		return marketDAO.selectSeller();
	}
	

}
