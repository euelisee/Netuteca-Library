package com.example.netuteca.repositories;

import com.example.netuteca.models.LoanModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LoanRepository extends JpaRepository<LoanModel, Long> {

}
