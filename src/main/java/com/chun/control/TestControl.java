package com.chun.control;



import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gradlenone")
public class TestControl {
	
	@RequestMapping("/test")
	public String testMybatis(HttpServletRequest request) {
		
		String test = " 哈哈，第一个gradle项目";
		return test;
	}
	

}
