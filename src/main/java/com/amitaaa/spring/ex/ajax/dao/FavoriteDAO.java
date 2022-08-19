package com.amitaaa.spring.ex.ajax.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.amitaaa.spring.ex.ajax.model.Favorite;

@Repository
public interface FavoriteDAO {
	
	public List<Favorite> selectLinkList();
	
	public int insertLink(
			@Param("name") String name
			,@Param("url") String url
			);
	
	// 이메일 중복 api DAO
	public int selectCountEmail(@Param("url") String url);


}
