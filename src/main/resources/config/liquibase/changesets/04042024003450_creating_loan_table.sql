--changeset elise:03042024221227_creating_readers_table
CREATE TABLE IF NOT EXISTS tb_loans (
    id UUID PRIMARY KEY,
    reader_id UUID,
    book_id UUID,
    loan_date DATE,
    estimated_return_date DATE,
    return_date DATE,
    fine_value DOUBLE PRECISION,
    FOREIGN KEY (reader_id) REFERENCES tb_readers(id),
    FOREIGN KEY (book_id) REFERENCES tb_books(id)
);
