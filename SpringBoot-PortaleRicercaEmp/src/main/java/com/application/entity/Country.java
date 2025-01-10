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

@Entity
@Table(name = "COUNTRIES")
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COUNTRY_ID", length = 2, columnDefinition = "CHAR(2)")
	private String id;
	
	@Column(name = "COUNTRY_NAME")
	private String nomeStato;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "REGION_ID", nullable = false)
	private Region region;
	
	@OneToMany(mappedBy="country")
	private Set<Location> locations;

	public String getNomeStato() {
		return nomeStato;
	}

	public void setNomeStato(String nomeStato) {
		this.nomeStato = nomeStato;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public Set<Location> getLocations() {
		return locations;
	}

	public void setLocations(Set<Location> locations) {
		this.locations = locations;
	}

	public String getId() {
		return id;
	}
	
	
}
