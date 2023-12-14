package com.ryan.savetravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ryan.savetravels.models.Expenses;

@Repository
public interface ExpensesRepository extends CrudRepository<Expenses, Long> {
	List<Expenses> findAll();
	
//	List<Expenses> findByExpensesNameContaining(String name);
}
