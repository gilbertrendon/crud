package com.car.crud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
	@CrossOrigin(origins = "http://localhost:3000")
	public Car saveCar(@RequestBody Car car){
		System.out.println("Entré al método");

		int id = 0;
		String sid = "";
		try {
			List<Car> cars = new ArrayList<Car>();
			//logica para la lista de la base de datos
			//service.fetchUsuarioList();
			cars = service.fetchCarsList();
			for(int i=0;i<cars.toArray().length;i++) {
				id = cars.get(i).getId();
				System.out.println(sid+cars.get(i).getId());
					if(sid.equals(cars.get(i).getId())) {
						System.out.println("ya existe");
						//yaExiste = true;
						return car;
					}	
			}
		
		}catch(Exception e) {
			
			return car;
		}
		
		return service.saveCarToDB(car);
	}
	
	@GetMapping("/getcarbyid/{id}")
	public Car fetchCarById(@PathVariable int id){
		return service.fetchCarById(id).get();
	}
	
	@GetMapping("/deletecarbyid/{id}")
	@CrossOrigin(origins = "http://localhost:3000")
	public String DeleteCarById(@PathVariable int id){
		//return null;
		return service.deleteCarById(id);
	}
	
	
	
}
