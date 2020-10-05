package com.shop.doimoi.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class userDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
}
