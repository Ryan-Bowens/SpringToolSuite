package com.ryan.dojoandninjas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ryan.dojoandninjas.models.Dojo;
import com.ryan.dojoandninjas.services.DojoService;
import com.ryan.dojoandninjas.services.NinjaService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/dojos")
public class DojoController {

	private final DojoService dojoServ;
	private final NinjaService ninjaServ;
	
	public DojoController(DojoService dojoServ, NinjaService ninjaServ) {
		this.dojoServ = dojoServ;
		this.ninjaServ = ninjaServ;
	}
	
	@GetMapping("/new")
	public String createDojo(@ModelAttribute("dojo")Dojo dojo) {
		return "dojo/newDojo.jsp";
	}
	
	@PostMapping("/post/new")
	public String postCreateDojo(@Valid @ModelAttribute("dojo")Dojo dojo, 
			BindingResult result) {
		if(result.hasErrors()) {
			return "dojo/newDojo.jsp";
		}
		dojoServ.create(dojo);
		return "redirect:/ninjas/new";
	}
	
	@GetMapping("/{id}")
	public String showOneDojo(@PathVariable("id")Long id, Model model) {
		model.addAttribute("dojo", dojoServ.getOne(id));
		return "dojo/showDojo.jsp";
		
	}
}
