package com.application.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.application.entity.Location;
import com.application.repository.LocationRepository;

@Service
@Transactional
public class LocationService {

	@Autowired
	LocationRepository repo;
	
	public List<String> listAll(){
		List<Location> locations = (List<Location>) repo.findAll();
		List<String> locationNames = new ArrayList<String>();
		
		for(Location l : locations) {
			locationNames.add(l.getCitta());
		}
		
		return locationNames;
		
	}
}
