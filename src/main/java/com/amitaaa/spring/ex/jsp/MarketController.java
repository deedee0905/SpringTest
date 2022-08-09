package com.amitaaa.spring.ex.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.amitaaa.spring.ex.jsp.bo.MarketBO;
import com.amitaaa.spring.ex.jsp.model.Market;

@Controller
@RequestMapping("jsp/market")
public class MarketController {

	@Autowired
	private MarketBO marketBO;
	
	// 셀러 추가등록
	@PostMapping("/add")
	@ResponseBody
	public String addSeller(
			@RequestParam("nickname") String nickname
			, @RequestParam("profile") String profile
			, @RequestParam("temperature") double temperature
			) {
		
		int count = marketBO.addSeller(nickname, profile, temperature);
		return "삽입결과 : " + count;
		
	}
	
	@GetMapping("/input")
	public String sellerInput() {
		return "jsp/seller";
		
	}
	
	// 셀러 출력
	@GetMapping("/lastSeller")
	public String getSeller(Model market) {
		
//		Market sellerId = marketBO.getSellerId();
//		
//		market.addAttribute("profileImage", sellerId);
//		market.addAttribute("nickname", sellerId);
//		market.addAttribute("temperature", sellerId);
		
		return "jsp/sellerInfo";
	}
	
	
	

}
