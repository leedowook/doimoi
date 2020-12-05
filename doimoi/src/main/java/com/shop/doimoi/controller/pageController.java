package com.shop.doimoi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.shop.doimoi.vo.testVo;


@Controller
public class pageController {

	private ModelAndView mav;//얘가 담고있는 내용은 다음 view의 목적지 ,객체들
	
	@GetMapping("/")//form의 target 
	public String firstPage() {
		return "index";
	}
	
	@PostMapping("/testMappingName")
	public ModelAndView testPage(@ModelAttribute testVo testData) {
		mav = new ModelAndView();
		System.out.print(testData.getData1());
		mav.addObject("testObject","내용입니다");
		mav.addObject("byunsu",testData.getData2());
		mav.setViewName("test");
		return mav;
	}
}
