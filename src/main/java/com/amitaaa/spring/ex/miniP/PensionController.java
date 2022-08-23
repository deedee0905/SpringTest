package com.amitaaa.spring.ex.miniP;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.amitaaa.spring.ex.miniP.bo.PensionBO;
import com.amitaaa.spring.ex.miniP.model.Booking;

@Controller
@RequestMapping("/mini")
public class PensionController {
	
	
	@Autowired
	private PensionBO pensionBO;
	
	
	// 전체 화면 페이지
	@GetMapping("/tongnamu")
	public String pensionView() {
		
		return "miniP/tongnamu";
	}
	
	
	// 예약 상태 페이지
	@GetMapping("/tables")
	public String reservationTable(Model model) {
		
		List<Booking> bookingList = pensionBO.getReservation();
		model.addAttribute("booking", bookingList);
		
		return "miniP/reservationList";
	}
	
	// 인풋 페이지
	@GetMapping("/input")
	public String reservationView() {
		return "miniP/addReservation";
	}
	
	// 예약 페이지
	@GetMapping("/add")
	@ResponseBody
	public Map<String, String> addReservation(
			@RequestParam("name") String name
			, @RequestParam("date") Date date
			, @RequestParam("day") int day
			, @RequestParam("headcount") int headcount
			, @RequestParam("phoneNumber") String phoneNumber
			) {
		
		int count = pensionBO.addBooking(name, date, day, headcount, phoneNumber);
		
		Map<String, String> map = new HashMap<>();
		
		if(count == 1) {
			map.put("result", "success");
		} else {
			map.put("result", "fail");
		}
		
		return map;
	}
	

}
