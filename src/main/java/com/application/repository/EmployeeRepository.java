package com.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.application.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	@Query(value = "SELECT e FROM Employee e WHERE (:nomeDip IS NULL OR e.department.nomeDip LIKE %:nomeDip%) "
			+ "AND (:nomeLocation IS NULL OR e.department.location.citta LIKE %:nomeLocation%) "
			+ "AND (:nomeCountry IS NULL OR e.department.location.country.nomeStato LIKE %:nomeCountry%)"
			+ "AND (:nomeEmployee IS NULL OR e.nome LIKE %:nomeEmployee%) "
			+ "AND (:nomeRegion IS NULL OR e.department.location.country.region.nomeRegione LIKE %:nomeRegion%)"
			+ "AND (:maxSal IS NULL OR e.salario <= :maxSal) " 
			+ "AND (:minSal IS NULL OR e.salario >= :minSal)")
	List<Employee> findByFilters(	
									@Param("nomeDip") String nomeDip, 
									@Param("nomeLocation") String nomeLocation,
									@Param("nomeCountry") String nomeCountry,
									@Param("nomeEmployee") String nomeEmployee,
									@Param("nomeRegion") String nomeRegion,
									@Param("maxSal") Integer maxSal,
									@Param("minSal") Integer minSal
								);
}

/*------------------------------------------------------------------------------------
	
	LA RICERCA E' CASE SENSITIVE SUL NOME, NON RIESCO A CORREGGERLA USANDO UPPER()
	
------------------------------------------------------------------------------------*/