package com.ryan.daikichipathvariable.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/daikichi")
public class DaikichiTravelController {

	@GetMapping("/travel")
	public String travelTo(@RequestParam("keyword") String cityValue, Model model) {
		model.addAttribute("cityValue", cityValue);
		return "city.jsp";
	}

	@GetMapping("/lotto")
	public String lotto(@RequestParam("keyword")int lottoNum, Model model) {
		model.addAttribute("lottoNum", lottoNum);
		if(lottoNum % 2 == 0) {
			return "Lotto/lottoEven.jsp";
		}else {
			return "Lotto/lottoOdd.jsp";
		}
		
	}
}
