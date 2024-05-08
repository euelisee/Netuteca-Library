package com.example.netuteca.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.netuteca.models.BookModel;
import com.example.netuteca.services.BookService;

@RestController
@CrossOrigin
@RequestMapping("/api/")
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping("/books")
    public List<BookModel> getAll() {
        return service.getAll();
    }

    @GetMapping("books/{id}")
    public ResponseEntity<Object> getOne(@PathVariable UUID id) {
        var book1 = service.findById(id);
        if (book1.isEmpty()) { //Empty--vazia - quando ela aponta para um objeto que é vazio
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Book not found!");
        }
        return ResponseEntity.status(HttpStatus.OK).body(book1.get());
    }

    @PostMapping("/books")
    public ResponseEntity<Object> createBook(@RequestBody BookModel book) {
        var newBook = service.save(book);
        return ResponseEntity.status(HttpStatus.CREATED).body(newBook);
    }

    @PutMapping("books/{id}")
    public ResponseEntity<BookModel> updateBook(@PathVariable UUID id, @RequestBody BookModel bookModel) {
        return service.findById(id)
                .map(book2 -> {
                    book2.setTitle(bookModel.getTitle());
                    book2.setAuthor(bookModel.getAuthor());
                    book2.setGenre(bookModel.getGenre());
                    book2.setPublisher(bookModel.getPublisher());
                    book2.setHeight(bookModel.getHeight());

                    service.save(book2);
                    return ResponseEntity.status(HttpStatus.OK).body(book2);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("books/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable UUID id) {
        service.remove(id);
        return ResponseEntity.ok().<Void>build(); //estou retornando o statusCode 200 para evitar informaçoes de seguranca serem vazadas.
    }
}
