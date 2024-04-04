package com.example.netuteca.models;

import jakarta.persistence.*;

import java.util.List;

@Table(name = "tb_readers")
@Entity
public class ReaderModel {
    @Id
    @GeneratedValue(generator = "tb_readers_sequence", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "tb_readers_sequence", allocationSize = 1)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name = "contact")
    private String contact;
    @Column(name = "email")
    private String email;
    @Column(name = "cpf")
    private String cpf;
    @OneToMany(mappedBy = "readerModel")
    private List<LoanModel> loanModels;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

