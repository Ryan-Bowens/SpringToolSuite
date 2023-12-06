package com.ryan.mvcdemo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ryan.mvcdemo.models.Donation;
import com.ryan.mvcdemo.services.DonationService;

@RestController
@RequestMapping("api")
public class DonationApiController {

	private final DonationService donationServ;
	public DonationApiController(DonationService donationServ) {
		this.donationServ = donationServ;
	}

	@GetMapping("/donations")
	public List<Donation> findAllDonations(){
		return donationServ.getAll();
	}
	
	@PostMapping("/donations")
	public Donation createDonation(@RequestParam("donationName")String donationName, 
			@RequestParam("donor") String donor, @RequestParam("quantity") 
			Integer quantity) {
		Donation newDonation = new Donation(donationName, donor, quantity);
		
		return donationServ.create(newDonation);
	}
	
//	--------------FIND ONE (/donations/{id})--------------
	@GetMapping("/donations/{id}")
	public Donation oneDonation(@PathVariable("id") Long id) {
		return null;
	}
	
}
