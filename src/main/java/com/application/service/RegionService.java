package com.application.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.application.entity.Region;
import com.application.repository.RegionRepository;

@Service
@Transactional
public class RegionService {

	@Autowired
	RegionRepository repo;
	
	public List<String> listAll(){
		List<Region> regions = (List<Region>) repo.findAll();
		List<String> regionNames = new ArrayList<String>();
		
		for(Region r : regions) {
			regionNames.add(r.getNomeRegione());
		}
		
		return regionNames;
		
	}
}
