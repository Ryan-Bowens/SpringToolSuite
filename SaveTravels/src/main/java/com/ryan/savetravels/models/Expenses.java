package com.ryan.savetravels.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "expenses")
public class Expenses {

	public Expenses() {}
	
//	ATTRIBUTES
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message="expense is required")
	private String expense;
	
	@NotBlank(message="vendor is required")
	private String vendor;
	
	@Min(0)
	@NotNull
	private Integer amount;
	
	private String description;
	
	@Column(updatable = false)
	private Date createdAt;
	
	private Date updatedAt;

//	public Expenses(@NotBlank(message = "expense is required") String expense,
//			@NotBlank(message = "vendor is required") String vendor, @Min(0) @NotNull Integer amount) {
//		super();
//		this.expense = expense;
//		this.vendor = vendor;
//		this.amount = amount;
//	}
//
//	public Expenses(Long id, @NotBlank(message = "expense is required") String expense,
//			@NotBlank(message = "vendor is required") String vendor, @Min(0) @NotNull Integer amount) {
//		super();
//		this.id = id;
//		this.expense = expense;
//		this.vendor = vendor;
//		this.amount = amount;
//	}

	public String getExpense() {
		return expense;
	}

	public void setExpense(String expense) {
		this.expense = expense;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getVendor() {
		return vendor;
	}
	
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}
	
	
	
}
