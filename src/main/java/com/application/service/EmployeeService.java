package com.application.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.application.dto.EmployeeDTO;
import com.application.entity.Employee;
import com.application.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeService {

	@Autowired
	EmployeeRepository repo;

	public List<EmployeeDTO> search(String nomeDip, String nomeLocation, String nomeCountry, String nomeEmployee,
			String nomeRegion, Integer maxSal, Integer minSal) {
		List<Employee> employees = repo.findByFilters(nomeDip, nomeLocation, nomeCountry, nomeEmployee, nomeRegion, maxSal, minSal);
		return convertToDTO(employees);
	}

	public List<EmployeeDTO> listAll() {
		List<Employee> employees = (List<Employee>) repo.findAll();
		return convertToDTO(employees);
	}
	
	public List<EmployeeDTO> convertToDTO(List<Employee> emps){
		List<EmployeeDTO> employeesDTO = new ArrayList<EmployeeDTO>();
		
		for(Employee e : emps) {
			EmployeeDTO empdto = new EmployeeDTO(e.getId(), e.getNome(), e.getCognome(), e.getEmail(), e.getTelefono(), e.getDataAssunzione(), e.getLavoro().getJobTitle(), 
					e.getSalario(), e.getPercComm(), e.getManager().getNome(), e.getDep().getId());
			employeesDTO.add(empdto);
		}
		
		return employeesDTO;
	}
}
