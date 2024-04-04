--changeset elise:03042024220712_creating_books_table
CREATE TABLE IF NOT EXISTS public.tb_books (
	id INT NOT NULL,
    title TEXT,
    author TEXT,
    genre TEXT,
    height INT,
    publisher TEXT,
    PRIMARY KEY (id)
);

CREATE SEQUENCE IF NOT EXISTS tb_books_sequence
INCREMENT BY 1
START WITH 1
OWNED BY public.tb_books.id;