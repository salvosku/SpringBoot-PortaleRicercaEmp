package com.application.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.application.entity.Country;
import com.application.repository.CountryRepository;

@Service
@Transactional
public class CountryService {

	@Autowired
	CountryRepository repo;
	
	public List<String> listAll(){
		List<Country> countries = (List<Country>) repo.findAll();
		List<String> countryNames = new ArrayList<String>();
		
		for(Country c : countries) {
			countryNames.add(c.getNomeStato());
		}
		
		return countryNames;
		
	}
}
