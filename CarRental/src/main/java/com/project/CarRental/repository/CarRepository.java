package com.project.CarRental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.CarRental.model.Car;
@Repository
public interface CarRepository  extends JpaRepository<Car, Integer>{

}
