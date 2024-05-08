package com.example.netuteca.services;

import com.example.netuteca.models.BookModel;
import com.example.netuteca.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public List<BookModel> getAll() {
        return repository.findAll();
    }

    public Optional<BookModel> findById(UUID id) {
        return repository.findById(id);
    }

    public BookModel save(BookModel book) {
        return repository.save(book);
    }

    public void remove(UUID id) {
        repository.deleteById(id);
    }
}
