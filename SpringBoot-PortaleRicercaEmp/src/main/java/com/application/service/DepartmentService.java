package com.application.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.application.entity.Department;
import com.application.repository.DepartmentRepository;

@Service
@Transactional
public class DepartmentService {

	@Autowired
	DepartmentRepository repo;
	
	public List<String> listAll(){
		List<Department> departments = (List<Department>) repo.findAll();
		List<String> departmentNames = new ArrayList<String>();
		
		for(Department d : departments) {
			departmentNames.add(d.getNomeDip());
		}
		
		return departmentNames;
		
	}
}
