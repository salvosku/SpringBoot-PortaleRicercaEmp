package com.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.application.service.CountryService;
import com.application.service.DepartmentService;
import com.application.service.EmployeeService;
import com.application.service.LocationService;
import com.application.service.RegionService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private DepartmentService departmentService;
	
	@Autowired
	private LocationService locationService;
	
	@Autowired
	private CountryService countryService;
	
	@Autowired
	private RegionService regionService;

	@GetMapping("/")
	public String showEmployeeList(Model model) {
		
		model.addAttribute("employees", employeeService.listAll());
		model.addAttribute("departments", departmentService.listAll());
		model.addAttribute("locations", locationService.listAll());
		model.addAttribute("countries", countryService.listAll());
		model.addAttribute("regions", regionService.listAll());
		
		return "research_page";
	}
	
	@PostMapping("/")
	public String searchOnEmployeeList(
			@RequestParam(required = false) String nomeDip,
	        @RequestParam(required = false) String nomeLocation,
	        @RequestParam(required = false) String nomeCountry,
	        @RequestParam(required = false) String nomeEmployee,
	        @RequestParam(required = false) String nomeRegion,
	        @RequestParam(required = false) Integer maxSal,
	        @RequestParam(required = false) Integer minSal,
	        Model model) {
		
		model.addAttribute("employees", employeeService.search(nomeDip, nomeLocation, nomeCountry, nomeEmployee, nomeRegion, maxSal, minSal));
		model.addAttribute("departments", departmentService.listAll());
		model.addAttribute("locations", locationService.listAll());
		model.addAttribute("countries", countryService.listAll());
		model.addAttribute("regions", regionService.listAll());
		
		return "research_page";
	}
}
