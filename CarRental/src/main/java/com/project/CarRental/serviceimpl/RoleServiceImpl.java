package com.project.CarRental.serviceimpl;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.CarRental.model.Role;
import com.project.CarRental.repository.RoleRepository;
import com.project.CarRental.service.RoleService;

@Service
public class RoleServiceImpl  implements RoleService{

	@Autowired
	private RoleRepository repository;

	@Override
	public List<Role> getAllRole() {
		
		return repository.findAll();
	}

	@Override
	public Role getRoleById(int id) {
		
		Optional<Role> optional = repository.findById(id);
	       Role role=null;

	        if( optional.isPresent()) {
	           role = optional.get();
	        } else {
	            throw new RuntimeException("Not found id role: " + id);
	        }

	        return role;
	}

	@Override
	public void saveRole(@RequestBody Role role) {
		role.setCreateDate(new Date(0));
		System.out.println(role);
		repository.save(role);
		
	}

	@Override
	public boolean deteleRole(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
}
