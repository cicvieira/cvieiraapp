package com.cvieira.cvieiraapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cvieira.cvieiraapp.models.Cars;

public interface CarsRepository extends MongoRepository<Cars, String> {

}
