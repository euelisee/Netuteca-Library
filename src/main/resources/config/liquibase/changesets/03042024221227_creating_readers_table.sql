--changeset elise:03042024221227_creating_readers_table
CREATE TABLE IF NOT EXISTS public.tb_readers (
	id UUID NOT NULL,
    name TEXT,
    contact TEXT,
    email TEXT,
    cpf TEXT,
    PRIMARY KEY (id)
);
