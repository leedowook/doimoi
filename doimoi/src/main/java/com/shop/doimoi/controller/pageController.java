package com.shop.doimoi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class pageController {

	private ModelAndView mav;//얘가 담고있는 내용은 다음 view의 목적지 ,객체들
	
	@GetMapping("/")//form의 target 
	public String firstPage() {
		return "index";
	}
	
}
