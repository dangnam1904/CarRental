package com.project.CarRental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.CarRental.model.DetailBooking;

@Repository
public interface DetailBookingRepository extends JpaRepository<DetailBooking, Integer> {

}
