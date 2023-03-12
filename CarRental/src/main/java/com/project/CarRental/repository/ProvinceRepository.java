package com.project.CarRental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.CarRental.model.Province;

@Repository
public interface ProvinceRepository extends JpaRepository<Province, Integer> {

}
