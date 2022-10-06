package com.collegeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collegeapp.model.University;

@Repository
public interface IUniversityRepository extends JpaRepository<University, Integer>{
	
	

}
