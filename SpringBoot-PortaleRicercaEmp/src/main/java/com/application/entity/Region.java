package com.application.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "REGIONS")
public class Region {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "REGION_ID")
	private Long id;
	
	@Column(name = "REGION_NAME")
	private String nomeRegione;
	
	@OneToMany(mappedBy="region")
	private Set<Country> countries;

	public String getNomeRegione() {
		return nomeRegione;
	}

	public void setNomeRegione(String nomeRegione) {
		this.nomeRegione = nomeRegione;
	}

	public Set<Country> getCountries() {
		return countries;
	}

	public void setCountries(Set<Country> countries) {
		this.countries = countries;
	}

	public Long getId() {
		return id;
	}
	
	
}
