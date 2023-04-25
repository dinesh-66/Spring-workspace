package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Nike.Nike;

public interface NRepo extends JpaRepository<Nike,Integer> {

}
