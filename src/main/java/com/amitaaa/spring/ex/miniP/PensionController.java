package com.amitaaa.spring.ex.miniP;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	// 데이터를 전달 받고 db에 저장하는 api
	@GetMapping("/add")
	@ResponseBody
	public Map<String, String> addReservation(
			@RequestParam("name") String name
			, @RequestParam("date") String date // 2022-08-22
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
	
	// id로 예약 정보를 삭제하는 api
	// {"result":"success"} {"result":"fail"}
	@GetMapping("/delete")
	@ResponseBody
	public Map<String, String> deleteBooking(@RequestParam("id") int id){
		
		int count = pensionBO.deleteBooking(id);
		
		Map<String, String> map = new HashMap<>();
		
		if(count == 1) {
			// 삭제 성공
			map.put("result", "success");
		} else {
			// 삭제 실패
			map.put("result", "fail");
		}
		
		return map;
		
	}
	
	// 이름과 연락처를 받아서 DB를 조회해주는 api
	
	// 스프링에서 http 컨버터가 객체를 주면 알아서 json 형태로 만들어줌!(중요함!!)
	// 제이슨의 형태는 [] 리스트 또는 {} 딕셔너리 
	// {
	// 		"name":"김인규",
	//		"phoneNumber":"010-1234-5678",
	//		"date":"2022-08-12"
	// }
	
	@PostMapping("/find")
	@ResponseBody
	public Map<String, Object> findBooking(
			@RequestParam("name") String name
			, @RequestParam("phoneNumber") String phoneNumber){
		
		Booking booking = pensionBO.getBooking(name, phoneNumber);
		
		Map<String, Object> result = new HashMap<>();
		
		if(booking != null) {
			result.put("result", "success");
			result.put("data", booking);
		} else {
			result.put("result", "fail");
			
			
		}
		
		return result;
	}
	
	

}
