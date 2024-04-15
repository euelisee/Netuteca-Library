package com.example.netuteca.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Table(name = "tb_loans")
@Entity
public class LoanModel {
    @Id
    @GeneratedValue(generator = "tb_loans_sequence", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "tb_loans_sequence", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "reader_id")
    private ReaderModel readerModel;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private BookModel bookModel;

    @Temporal(TemporalType.DATE)
    @Column(name = "loan_date")
    private LocalDate loanDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "estimated_return_date")
    private LocalDate estimatedReturnDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "return_date")
    private LocalDate returnDate;

    @Column(name = "fine_value")
    private Double fineValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ReaderModel getReaderModel() {
        return readerModel;
    }

    public void setReaderModel(ReaderModel readerModel) {
        this.readerModel = readerModel;
    }

    public BookModel getBookModel() {
        return bookModel;
    }

    public void setBookModel(BookModel bookModel) {
        this.bookModel = bookModel;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDate getEstimatedReturnDate() {
        return estimatedReturnDate;
    }

    public void setEstimatedReturnDate(LocalDate estimatedReturnDate) {
        this.estimatedReturnDate = estimatedReturnDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Double getFineValue() {
        return fineValue;
    }

    public void setFineValue(Double fineValue) {
        this.fineValue = fineValue;
    }
}

