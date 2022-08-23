package com.amitaaa.spring.ex.miniP.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.amitaaa.spring.ex.miniP.model.Booking;

@Repository
public interface PensionDAO {
	
	// 예약조회 
	public List<Booking> selectBooking();

	//예약추가
	public int insertBooking(
			@Param("name") String name
			,@Param("date") Date date
			,@Param("day") int day
			,@Param("headcount") int headcount
			,@Param("phoneNumber") String phoneNumber
			);
	
	
}
