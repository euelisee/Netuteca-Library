package com.example.netuteca.models;


import jakarta.persistence.*;

import java.util.List;

@Table(name = "tb_books")
@Entity
public class BookModel {
    @Id
    @GeneratedValue(generator = "tb_books_sequence", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "tb_books_sequence", allocationSize = 1)
    @Column(name = "id")
    private Long id;
    @OneToMany(mappedBy = "bookModel")
    private List<LoanModel> loanModels;

    @Column(name = "title")
    private String title;
    @Column(name = "author")
    private String author;
    @Column(name = "genre")
    private String genre;
    @Column(name = "height")
    private Integer height;
    @Column(name = "publisher")
    private String publisher;

    // Getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
