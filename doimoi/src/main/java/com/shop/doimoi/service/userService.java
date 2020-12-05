package com.shop.doimoi.service;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.shop.doimoi.dao.userDao;
@Service
public class userService {
	@Inject
	PasswordEncoder passwordEncoder;
	
	@Autowired
	userDao userDao;
	
	
	

}
