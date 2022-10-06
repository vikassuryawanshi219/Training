package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.JwtUser;

public interface JwtUserRepository extends  JpaRepository<JwtUser, Integer>{
	JwtUser findByUsername(String username);

}
