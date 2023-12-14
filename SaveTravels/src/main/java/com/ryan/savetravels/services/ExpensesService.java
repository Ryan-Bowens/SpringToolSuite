package com.ryan.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ryan.savetravels.models.Expenses;
import com.ryan.savetravels.repositories.ExpensesRepository;

@Service
public class ExpensesService {
	
	private final ExpensesRepository expensesRepo;

	public ExpensesService(ExpensesRepository expensesRepo) {
		this.expensesRepo = expensesRepo;
	}
	
	public List<Expenses> getAll(){
		return expensesRepo.findAll();
	}
	
	public Expenses create(Expenses expense) {
		return expensesRepo.save(expense);
	}
	
	public Expenses getOne(Long id) {
		Optional<Expenses> optionalexpenses = expensesRepo.findById(id);
		return optionalexpenses.isPresent() ? optionalexpenses.get() : null;
	}
	
	public Expenses edit(Expenses expense) {
		return expensesRepo.save(expense);
	}
	
	public void delete(Long id) {
		expensesRepo.deleteById(id);
	}

}
