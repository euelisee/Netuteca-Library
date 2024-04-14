package com.example.netuteca.controllers;

import com.example.netuteca.models.LoanModel;
import com.example.netuteca.services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/")
public class LoanController {
    @Autowired
    private LoanService loanService;

    @PostMapping("/loans")
    public ResponseEntity<LoanModel> createLoan (@RequestBody LoanModel loanModel){
        LoanModel createLoanModel1 = loanService.saveLoan(loanModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(createLoanModel1);
    }


}
