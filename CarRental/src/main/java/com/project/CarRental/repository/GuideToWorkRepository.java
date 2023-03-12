package com.project.CarRental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.CarRental.model.GuideToWork;

@Repository
public interface GuideToWorkRepository  extends JpaRepository<GuideToWork, Integer>{

}
