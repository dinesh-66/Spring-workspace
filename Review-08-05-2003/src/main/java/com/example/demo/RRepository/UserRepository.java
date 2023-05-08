package com.example.demo.RRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.RModel.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Integer> {

}
