package com.application.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.OneToOne;

@Entity
@Table(name = "DEPARTMENTS")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DEPARTMENT_ID")
	private Long id;

	@Column(name = "DEPARTMENT_NAME")
	private String nomeDip;

	@OneToOne
	@JoinColumn(name = "manager_id")
	private Employee manager;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "LOCATION_ID")
	private Location location;
	
	@OneToMany(mappedBy="department")
	private Set<Employee> employees;

	public String getNomeDip() {
		return nomeDip;
	}

	public void setNomeDip(String nomeDip) {
		this.nomeDip = nomeDip;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	public Long getId() {
		return id;
	}

	
}