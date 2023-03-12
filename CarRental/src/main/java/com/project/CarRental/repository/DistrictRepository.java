package com.project.CarRental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.CarRental.model.District;

@Repository
public interface DistrictRepository extends JpaRepository<District, Integer> {

}
