package com.example.netuteca.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

@Table(name = "tb_Loans")
@Entity
public class LoanModel {
    @Id
    @GeneratedValue(generator = "tb_loan_sequence", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "tb_loan_sequence", allocationSize = 1)

    private Long id;

    @ManyToOne
    @JoinColumn(name = "reader_id")
    private ReaderModel readerModel;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private BookModel bookModel;

    @Temporal(TemporalType.DATE)
    private LocalDate loanDate;

    @Temporal(TemporalType.DATE)
    private LocalDate estimatedReturnDate;

    @Temporal(TemporalType.DATE)
    private LocalDate returnDate;

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

