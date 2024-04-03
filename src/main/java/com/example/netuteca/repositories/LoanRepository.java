package com.example.netuteca.repositories;

import com.example.netuteca.models.LoanModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<LoanModel, Long> {
}
