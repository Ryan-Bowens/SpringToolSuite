package com.ryan.savetravels.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ryan.savetravels.models.Expenses;
import com.ryan.savetravels.services.ExpensesService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/expenses")
public class ExpensesController {

	private final ExpensesService expensesServ;

	public ExpensesController(ExpensesService expensesServ) {
		this.expensesServ = expensesServ;
	}

	@GetMapping("")
	public String showAllExpenses(Model model, @ModelAttribute("expenseForm")Expenses expense) {
		model.addAttribute("allExpenses", expensesServ.getAll());
		return "displayExpenses.jsp";
	}
	
	@PostMapping("/post/new")
	public String postCreateExpense(@Valid @ModelAttribute("expenseForm")Expenses newExpense,
			BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("allExpenses", expensesServ.getAll());
			return "displayExpenses.jsp";
		}
		
		expensesServ.create(newExpense);
		return "redirect:/expenses";
	}
	
	@GetMapping("/edit/{id}")
	public String editExpense(@PathVariable("id") Long id, Model model) {
		model.addAttribute("expenseEdit", expensesServ.getOne(id));
		return "editExpenses.jsp";
	}
	
	@PatchMapping("/post/edit/{id}")
	public String postEditExpense(@Valid @ModelAttribute("expenseEdit")Expenses editExpense,
			BindingResult result) {
		if(result.hasErrors()) {
			return "editExpenses.jsp";
		}
		expensesServ.edit(editExpense);
		return "redirect:/expenses";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteExpense(@PathVariable("id") Long id) {
		expensesServ.delete(id);
		return "redirect:/expenses";
	}
	
}
