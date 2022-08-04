package com.amitaaa.spring.ex.database.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.amitaaa.spring.ex.database.model.Store;



@Repository
public interface StoreDAO {
	//store 테이블의 모든 데이터 조회 결과 리턴
	
	public List<Store> selectStoreList();
	

}
