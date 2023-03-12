package com.project.CarRental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.CarRental.model.BrandCar;

@Repository
public interface BrandCarRepository extends JpaRepository<BrandCar, Integer> {

}
