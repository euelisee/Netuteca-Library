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
        LoanModel save = loanRepository.save(loanModel);
        var variavel = loanRepository.findById(save.getId());
        if (variavel.isPresent()){
            return  variavel.get();
        }
        return null;
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
