package com.application.repository;

import org.springframework.data.repository.CrudRepository;

import com.application.entity.Location;

public interface LocationRepository extends CrudRepository<Location, Integer> {

}
