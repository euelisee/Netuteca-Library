package com.example.netuteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.netuteca.models.BookModel;

@Repository
public interface BookRepository extends JpaRepository<BookModel, Long> {}
