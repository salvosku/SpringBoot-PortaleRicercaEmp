package com.application.repository;

import org.springframework.data.repository.CrudRepository;

import com.application.entity.Country;

public interface CountryRepository extends CrudRepository<Country, String> {

}
