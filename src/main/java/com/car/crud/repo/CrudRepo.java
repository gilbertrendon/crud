package com.car.crud.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.car.crud.model.Car;

@Repository
@Transactional
public interface CrudRepo extends JpaRepository<Car, Integer>{

}
