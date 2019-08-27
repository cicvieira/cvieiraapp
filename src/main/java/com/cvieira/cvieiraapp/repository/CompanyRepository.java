package com.cvieira.cvieiraapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cvieira.cvieiraapp.models.Company;

public interface CompanyRepository extends MongoRepository<Company, String>{

}
