--changeset elise:3
CREATE TABLE IF NOT EXISTS public.tb_readers (
	Id INT NOT NULL,
    Name TEXT,
    Contact TEXT,
    Email TEXT,
    Cpf TEXT,
    PRIMARY KEY (Id)
);

CREATE SEQUENCE IF NOT EXISTS tb_readers_sequence
INCREMENT BY 1
START WITH 1
OWNED BY public.tb_readers.Id;