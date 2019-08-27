package com.cvieira.cvieiraapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cvieira.cvieiraapp.models.Person;

public interface PersonRepository extends MongoRepository<Person, String>{

}
