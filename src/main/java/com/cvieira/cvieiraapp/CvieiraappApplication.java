package com.cvieira.cvieiraapp;

/*
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import com.cvieira.cvieiraapp.models.Company;
import com.cvieira.cvieiraapp.models.Person;
import com.cvieira.cvieiraapp.repository.CompanyRepository;
import com.cvieira.cvieiraapp.repository.PersonRepository;
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.cvieira.cvieiraapp.CvieiraappApplication;

@SpringBootApplication
public class CvieiraappApplication{
	
	/*
	public class CvieiraappApplication implements CommandLineRunner{
	
	@Autowired
	CompanyRepository companyRepository;
	@Autowired
	PersonRepository personRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Person person1 = new Person();
		person1.setName("Cicero");	
		Person savedPerson = this.personRepository.save(person1);
		
		Company company1 = new Company();
		company1.setName("Empresa Cvieira");
		company1.setPeople(Arrays.asList(savedPerson));
		
		Company savedCompany = this.companyRepository.save(company1);		
	}
	*/
	
	public static void main(String[] args) {
		SpringApplication.run(CvieiraappApplication.class, args);
	}

}
