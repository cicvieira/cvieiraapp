package com.cvieira.cvieiraapp.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cvieira.cvieiraapp.models.Cars;
import com.cvieira.cvieiraapp.repository.CarsRepository;


@RestController
@RequestMapping("/cars")
public class CarsResource {
	
	@Autowired
	private CarsRepository repository;
	
	public CarsResource (CarsRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping
	@ResponseBody
	public List<Cars> findAll(){
		return this.repository.findAll();
	}
	
	@PostMapping
	public Cars create(@RequestBody Cars car) {
		return this.repository.save(car);		
	}
	
	@GetMapping("/{id}")
	public Cars findById(@PathVariable String id) {
		return this.repository.findById(id).orElse(null);
	}
	
	@DeleteMapping("/{id}")
	public void remove(@PathVariable String id) {
		this.repository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public Cars update(@PathVariable String id, @RequestBody Cars car) {
		Cars toUpdate = this.repository.findById(id).orElse(null);
		
		if(toUpdate != null) {
			toUpdate.setMarca(car.getMarca());
			toUpdate.setModelo(car.getModelo());
			toUpdate.setCombustivel(car.getCombustivel());
			toUpdate.setAno(car.getAno());
			toUpdate.setValor(car.getValor());
		}
		
		Cars newCar = this.repository.save(toUpdate);
		
		return newCar;
	}
	

}
