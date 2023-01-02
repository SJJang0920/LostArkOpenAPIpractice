package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mypractice.lostarkapi.APIKey;

@Controller
public class IndexController {
	
	@RequestMapping("/index")
	public String index() throws Exception {
		return "apidatacall/APIDataCall";
	}
}
