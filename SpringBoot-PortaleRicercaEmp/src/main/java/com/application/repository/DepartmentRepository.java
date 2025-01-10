package com.application.repository;

import org.springframework.data.repository.CrudRepository;

import com.application.entity.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
