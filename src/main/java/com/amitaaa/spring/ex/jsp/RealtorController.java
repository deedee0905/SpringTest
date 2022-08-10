package com.amitaaa.spring.ex.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amitaaa.spring.ex.jsp.bo.RealtorBO;
import com.amitaaa.spring.ex.jsp.model.Realtor;

@Controller
@RequestMapping("lesson04/test/02")
public class RealtorController {
	
	@Autowired
	private RealtorBO realtorBO;
	
	
	@PostMapping("/1")
	public String realtorInput() {
		return "jsp/realtorAdd";
	}
	
	//공인중개사 정보를 저장하는 메소드
	@GetMapping("/add_realtor")
	public String addRealtor(Model model, @ModelAttribute Realtor realtor) {
		
		int count = realtorBO.addRealtorByObject(realtor);
		
		model.addAttribute("Realtor", realtor);
		
		return "jsp/realtorInfo";
		
	}

}
