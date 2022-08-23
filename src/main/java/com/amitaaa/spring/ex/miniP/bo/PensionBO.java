package com.amitaaa.spring.ex.miniP.bo;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amitaaa.spring.ex.miniP.dao.PensionDAO;
import com.amitaaa.spring.ex.miniP.model.Booking;

@Service
public class PensionBO {
	
	@Autowired
	private PensionDAO pensionDAO;
	
	// 예약상태 조회
	public List<Booking> getReservation() {
		return pensionDAO.selectBooking();
	}
	
	// 예약 추가하기
	public int addBooking(
			String name
			, String date
			, int day
			, int headcount
			, String phoneNumber
			) {
		
		return pensionDAO.insertBooking(name, date, day, headcount, phoneNumber, "대기중");
		
	}
	
	public int deleteBooking(int id) {
		return pensionDAO.deleteBooking(id);
	}
	
	
}
