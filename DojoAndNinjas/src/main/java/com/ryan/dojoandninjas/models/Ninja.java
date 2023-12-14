package com.ryan.dojoandninjas.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="ninjas")
public class Ninja {
	
	public Ninja() {}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="dojo_id")
	private Dojo ninjaDojo;
	
	@NotBlank
	private String firstName;
	
	@NotBlank
	private String lastName;
	
	@Min(0)
	@NotNull
	private Integer age;
	
	@Column(updatable = false)
	private Date createdAt;

	private Date updatedAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Dojo getNinjaDojo() {
		return ninjaDojo;
	}

	public void setNinjaDojo(Dojo ninja) {
		this.ninjaDojo = ninja;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
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
