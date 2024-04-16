package com.example.netuteca.controllers;

import com.example.netuteca.models.LoanModel;
import com.example.netuteca.services.LoanService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/loans")
public class LoanController {
    @Autowired
    private LoanService loanService;

    @GetMapping
    public ResponseEntity<List<LoanModel>> getAllLoans() {
        var loans = loanService.getAllLoans();
        return ResponseEntity.status(HttpStatus.OK).body(loans);
    }

    @PostMapping
    public ResponseEntity<LoanModel> createLoan (@RequestBody LoanModel loanModel){
        LoanModel createLoanModel1 = loanService.saveLoan(loanModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(createLoanModel1);
    }
}
