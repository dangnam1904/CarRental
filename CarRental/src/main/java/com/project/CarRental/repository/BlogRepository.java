package com.project.CarRental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.CarRental.model.Blog;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {

}
