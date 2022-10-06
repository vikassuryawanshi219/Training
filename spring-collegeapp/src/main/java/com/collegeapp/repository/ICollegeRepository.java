package com.collegeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collegeapp.model.College;

@Repository
public interface ICollegeRepository extends JpaRepository<College, Integer> {
	

}
