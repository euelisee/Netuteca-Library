--changeset elise:03042024221227_creating_readers_table
CREATE TABLE IF NOT EXISTS tb_loans (
    id INT PRIMARY KEY,
    reader_id INT,
    book_id INT,
    loan_date DATE,
    estimated_return_date DATE,
    return_date DATE,
    fine_value DOUBLE PRECISION,
    FOREIGN KEY (reader_id) REFERENCES tb_readers(id),
    FOREIGN KEY (book_id) REFERENCES tb_books(id)
);

CREATE SEQUENCE IF NOT EXISTS tb_loans_sequence
INCREMENT BY 1
START WITH 1
OWNED BY public.tb_loans.id;
