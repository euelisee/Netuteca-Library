--changeset elise:03042024220712_creating_books_table
CREATE TABLE IF NOT EXISTS public.tb_books (
	id UUID NOT NULL,
    title TEXT,
    author TEXT,
    genre TEXT,
    height INT,
    publisher TEXT,
    PRIMARY KEY (id)
);
