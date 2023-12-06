package com.ryan.sessionformdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;

@Controller 	//ctrl + shift + o to auto import ^
@RequestMapping("/home") //dont need this rn, its just proper... 
//							think of it like 100s of controllers/webpages
public class HomeController {

//---------------------	SESSION ---------------------
	@GetMapping("")
	public String setCount(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
//								("name", setToInitialNum)
		}
		int count = (int) session.getAttribute("count");
//		default saves as Object so this changes it to int
		count++;
		session.setAttribute("count", count);
		return "counterPage.jsp";
//		really strange error... just added /WEB-INF/counterPage.jsp
	}
	
	@GetMapping("/get/count")
	public String getCount() {
		return "countGet.jsp";
	}
//	localhost:8080/search?keyword=<whateverWePutIn>
	
//	--------------------- FORM ---------------------
	@GetMapping("/search")
	public String searchForm() {
		return "getForm/searchForm.jsp";
	}
	
	@GetMapping("/display")
	public String displayForm(@RequestParam("keyword") String searchValue, Model model) {
		model.addAttribute("searchValue", searchValue);
		return "getForm/displaySearchForm.jsp";
	}
	
	@GetMapping("/review/form")
	public String reviewForm() {
		return "postForm/reviewForm.jsp";
	}
	
	@PostMapping("/review/process")
	public String displayReviewForm(@RequestParam("movie")String movie, 
			@RequestParam("comment") String comment, 
			@RequestParam("rating")Integer rating, HttpSession session, 
			RedirectAttributes redirectAttributes, @RequestParam("name")
			String name) {
		
		if(rating < 0 || rating > 5) {
			redirectAttributes.addFlashAttribute("error", 
					"rating needs to be between 0-5");
			return "redirect:/home/review/form";
		}
		session.setAttribute("name", name);
		session.setAttribute("movie", movie);
		session.setAttribute("comment", comment);
		session.setAttribute("rating", rating);
		
		return "redirect:/home/review/display";
	}
	
	@GetMapping("/review/display")
	public String reviewDisplay() {
		return "postForm/display.jsp";
	}
}
