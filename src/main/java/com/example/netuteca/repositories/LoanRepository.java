package com.example.netuteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.netuteca.models.LoanModel;

public interface LoanRepository extends JpaRepository<LoanModel, Long> {}
