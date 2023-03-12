package com.project.CarRental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.CarRental.model.Wards;

@Repository
public interface WardsRepository  extends JpaRepository<Wards, Integer>{

}
