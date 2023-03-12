package com.project.CarRental.service;

import java.util.List;

import com.project.CarRental.model.Role;

public interface RoleService {
	List <Role> getAllRole();
	Role getRoleById(int id);
	void saveRole(Role role);
	boolean deteleRole(int id);
}
