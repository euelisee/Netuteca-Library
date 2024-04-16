package com.example.netuteca.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.netuteca.models.LoanModel;
import com.example.netuteca.repositories.LoanRepository;

@Service
public class LoanService {
    @Autowired
    private LoanRepository loanRepository;

    public List<LoanModel> getAllLoans() {
        return loanRepository.findAll();
    }

    public Optional<LoanModel> getLoanById(Long id) {
        return loanRepository.findById(id);
    }
    public LoanModel saveLoan(LoanModel loanModel) {
        return loanRepository.save(loanModel);
    }

    public void deleteLoan(Long id) {
        loanRepository.deleteById(id);
    }

    /*public void calculedFine(){
         LocalDate.now().plusDays(7);
         if(){
        }
    }*/
}
