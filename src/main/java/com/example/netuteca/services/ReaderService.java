package com.example.netuteca.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.netuteca.models.ReaderModel;
import com.example.netuteca.repositories.ReaderRepository;

@Service
public class ReaderService {

    @Autowired
    private ReaderRepository readerRepository;

    public  ReaderModel saveReader(ReaderModel readerModel){
        return readerRepository.save(readerModel);
    }
    public List<ReaderModel> getAllReaders() {
        return readerRepository.findAll();
    }
    public Optional<ReaderModel> getReaderById(Long id) {
        return readerRepository.findById(id);
    }
    public Optional<ReaderModel> findById(Long id) {
        return readerRepository.findById(id);
    }
    public void remove(Long id) {
        readerRepository.deleteById(id);
    }
}


