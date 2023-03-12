package com.project.CarRental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.CarRental.model.Role;

@Repository
public interface RoleRepository  extends JpaRepository<Role, Integer>{

}
