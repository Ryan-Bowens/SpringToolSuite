package com.ryan.dojoandninjas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ryan.dojoandninjas.models.Ninja;
import com.ryan.dojoandninjas.services.DojoService;
import com.ryan.dojoandninjas.services.NinjaService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/ninjas")
public class NinjaController {

	private final NinjaService ninjaServ;
	private final DojoService dojoServ;
	
	public NinjaController(NinjaService ninjaServ, DojoService dojoServ) {
		this.ninjaServ = ninjaServ;
		this.dojoServ = dojoServ;
	}
	
	@GetMapping("/new")
	public String createNinja(@ModelAttribute("ninja")Ninja ninja, Model model) {
		model.addAttribute("allDojos", dojoServ.getAll());
		return "ninja/newNinja.jsp";
	}
	
	@PostMapping("/post/new")
	public String postCreateNinja(@Valid @ModelAttribute("ninja")Ninja ninja,
			BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("allDojos", dojoServ.getAll());
			return "ninja/newNinja.jsp";
		}
		model.addAttribute("allDojos", dojoServ.getAll());
		ninjaServ.create(ninja);
		return "redirect:/dojos/new";
	}
}
