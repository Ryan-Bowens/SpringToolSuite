package com.ryan.omijkuji.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/omikuji")
public class HomeController {

	
	@GetMapping("")
	public String postOmikuji() {
		return "postOmikuji.jsp";
	}
	
	@PostMapping("/form")
	public String formOmikuji(@RequestParam("number")int number, 
			@RequestParam("person")String person,@RequestParam("city")
			String city, @RequestParam("hobby")String hobby, 
			@RequestParam("thing")String thing,@RequestParam("nice")
			String nice, HttpSession session, RedirectAttributes redirectAttributes) {
		
		if(number < 5 || number > 25) {
			redirectAttributes.addFlashAttribute("error",
					"number needs to be between 5-25");
			return "redirect:/omikuji";
		}
		
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("thing", thing);
		session.setAttribute("nice", nice);
		return "redirect:/omikuji/show";
	}
	
	@GetMapping("/show")
	public String showOmikuji() {
		return "getOmikuji.jsp";
	}
}
