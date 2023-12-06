package com.ryan.routesspringdemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@RequestMapping("/option/1")
	public String option1() {
		return "Option 1 request mapping";
	}
	
}
