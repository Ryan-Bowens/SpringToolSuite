package com.ryan.dojoandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ryan.dojoandninjas.models.Dojo;
import com.ryan.dojoandninjas.repositories.DojoRepository;

@Service
public class DojoService {
	
	private final DojoRepository dojoRepo;
	public DojoService(DojoRepository dojoRepo) {
		this.dojoRepo = dojoRepo;
	}
	
	public Dojo create(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	
	public Dojo getOne(Long id) {
		Optional<Dojo> dojo = dojoRepo.findById(id);
		return dojo.isPresent() ? dojo.get() : null;
	}
	
	public List<Dojo> getAll(){
		return dojoRepo.findAll();
	}
}
