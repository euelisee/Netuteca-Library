--changeset elise:1
CREATE TABLE IF NOT EXISTS public.tb_books (
	Id INT NOT NULL,
    Title TEXT,
    Author TEXT,
    Genre TEXT,
    Height INT,
    Publisher TEXT,
    PRIMARY KEY (Id)
);

CREATE SEQUENCE IF NOT EXISTS tb_books_sequence
INCREMENT BY 1
START WITH 1
OWNED BY public.tb_books.Id;