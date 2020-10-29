package com.car.crud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.car.crud.model.Car;
import com.car.crud.services.CrudService;

@RestController
public class CrudRestController {
	@Autowired
	private CrudService service;
	
	@GetMapping("/getcarlist")
	public List<Car> fetchCarList(){
		List<Car> cars = new ArrayList<Car>();
		cars = service.fetchCarsList();
		return cars;
	}
	
	@PostMapping("/addcar")
	public Car saveCar(@RequestBody Car car){
		return service.saveCarToDB(car);
	}
	
	@GetMapping("/getcarbyid/{id}")
	public Car fetchCarById(@PathVariable int id){
		return service.fetchCarById(id).get();
	}
	
	@DeleteMapping("/deletecarbyid/{id}")
	public String DeleteCarById(@PathVariable int id){
		//return null;
		return service.deleteCarById(id);
	}
	
	
	
}
