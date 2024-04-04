--changeset elise:03042024221227_creating_readers_table
CREATE TABLE IF NOT EXISTS public.tb_readers (
	id INT NOT NULL,
    name TEXT,
    contact TEXT,
    email TEXT,
    cpf TEXT,
    PRIMARY KEY (id)
);

CREATE SEQUENCE IF NOT EXISTS tb_readers_sequence
INCREMENT BY 1
START WITH 1
OWNED BY public.tb_readers.id;