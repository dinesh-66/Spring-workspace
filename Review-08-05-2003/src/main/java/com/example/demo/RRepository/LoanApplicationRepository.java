package com.example.demo.RRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.RModel.LoanApplicationModel;

public interface LoanApplicationRepository extends JpaRepository<LoanApplicationModel, Integer> {



}
