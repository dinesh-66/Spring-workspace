package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Nike.LoginModel;

public interface LapRepository extends JpaRepository<LoginModel, Integer> 
{
	LoginModel findByusername(String username);
}
