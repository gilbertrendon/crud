package com.car.crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.crud.model.Car;
import com.car.crud.repo.CrudRepo;

@Service
public class CrudService {
	@Autowired
	private CrudRepo repo;
	
	public List<Car> fetchCarsList(){
		return repo.findAll();
	}
	
	public Car saveCarToDB(Car car) {
		return repo.save(car);
	}
	
	public Optional<Car> fetchCarById(int id) {
		return repo.findById(id);
	}
	
	public String deleteCarById(int id) {
		String result;
		try {
			repo.deleteById(id);
			result = "Car succesfully deleted";
		}catch(Exception e) {
			result = "Car is not deleted";	
		}
		return result;
	}
}
