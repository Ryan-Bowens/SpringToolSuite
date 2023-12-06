package com.ryan.mvcdemo.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "donation")
public class Donation {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Size(min=3, max=255)
	@NotEmpty(message="donationName is required")
	private String donationName;
	
	@Size(min=2, max=50)
	@NotEmpty(message="donor name is required")
	private String donor;
	
	@Min(0)
	@NotNull
	private Integer quantity;
	
	@Column(updatable = false)
	private Date createdAt;

	private Date updatedAt;
	
	public Donation() {}

//	right click -> source -> generate constructors (not id, created, updated)
	public Donation(@Size(min = 3, max = 255) @NotEmpty(message = "donationName is required") String donationName,
			@Size(min = 2, max = 50) @NotEmpty(message = "donor name is required") String donor,
			@Min(0) @NotNull Integer quantity) {
		super();
		this.donationName = donationName;
		this.donor = donor;
		this.quantity = quantity;
	}

//	right click -> source -> generate getters/setters (only get for id, created, updated)
	public String getDonationName() {
		return donationName;
	}

	public void setDonationName(String donationName) {
		this.donationName = donationName;
	}

	public String getDonor() {
		return donor;
	}

	public void setDonor(String donor) {
		this.donor = donor;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Long getId() {
		return id;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	@PrePersist //adds the created at date and time to sql on creation
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	@PreUpdate //add the updated at date and time when being updated
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
	
}
