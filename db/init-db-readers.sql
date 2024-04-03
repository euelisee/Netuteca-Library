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

INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'João Silva', '(11) 98765-4321', 'joao.silva@example.com', '123.456.789-00');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'Maria Santos', '(21) 12345-6789', 'maria.santos@example.com', '987.654.321-00');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'Pedro Oliveira', '(31) 55555-5555', 'pedro.oliveira@example.com', '111.222.333-44');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'Ana Souza', '(41) 99999-9999', 'ana.souza@example.com', '555.444.333-22');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'Luiz Pereira', '(51) 77777-7777', 'luiz.pereira@example.com', '777.888.999-00');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'Carla Costa', '(61) 33333-3333', 'carla.costa@example.com', '999.888.777-66');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'Fernando Santos', '(71) 22222-2222', 'fernando.santos@example.com', '222.111.444-55');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'Amanda Silva', '(81) 11111-1111', 'amanda.silva@example.com', '666.555.444-33');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'João Silva', '(11) 98765-4321', 'joao.silva@example.com', '123.456.789-00');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'João Silva', '(11) 98765-4321', 'joao.silva@example.com', '123.456.789-00');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'João Silva', '(11) 98765-4321', 'joao.silva@example.com', '123.456.789-00');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'Rafael Oliveira', '(91) 44444-4444', 'rafael.oliveira@example.com', '888.999.000-11');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'Camila Rodrigues', '(01) 88888-8888', 'camila.rodrigues@example.com', '333.222.111-00');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'Marcos Lima', '(02) 77777-7777', 'marcos.lima@example.com', '000.111.222-33');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'Juliana Costa', '(03) 66666-6666', 'juliana.costa@example.com', '222.333.444-55');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'Roberto Almeida', '(04) 55555-5555', 'roberto.almeida@example.com', '555.666.777-88');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'Patrícia Pereira', '(05) 44444-4444', 'patricia.pereira@example.com', '888.777.666-55');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'Mariana Oliveira', '(06) 33333-3333', 'mariana.oliveira@example.com', '666.555.444-33');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'Thiago Santos', '(07) 22222-2222', 'thiago.santos@example.com', '222.111.444-55');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'Carolina Silva', '(08) 11111-1111', 'carolina.silva@example.com', '666.555.444-33');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'Gustavo Lima', '(09) 00000-0000', 'gustavo.lima@example.com', '000.111.222-33');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'Vanessa Costa', '(10) 99999-9999', 'vanessa.costa@example.com', '222.333.444-55');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'José Almeida', '(11) 88888-8888', 'jose.almeida@example.com', '555.666.777-88');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'Aline Pereira', '(12) 77777-7777', 'aline.pereira@example.com', '888.777.666-55');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'Lucas Oliveira', '(13) 66666-6666', 'lucas.oliveira@example.com', '666.555.444-33');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'Beatriz Santos', '(14) 55555-5555', 'beatriz.santos@example.com', '222.111.444-55');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'Bruno Silva', '(15) 44444-4444', 'bruno.silva@example.com', '666.555.444-33');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'Fernanda Lima', '(16) 33333-3333', 'fernanda.lima@example.com', '222.111.444-55');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'Márcia Costa', '(17) 22222-2222', 'marcia.costa@example.com', '666.555.444-33');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'Diego Almeida', '(18) 11111-1111', 'diego.almeida@example.com', '222.111.444-55');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'Tatiane Pereira', '(19) 00000-0000', 'tatiane.pereira@example.com', '666.555.444-33');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'Gustavo Oliveira', '(20) 99999-9999', 'gustavo.oliveira@example.com', '222.111.444-55');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'Roberta Santos', '(21) 88888-8888', 'roberta.santos@example.com', '666.555.444-33');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'Guilherme Silva', '(22) 77777-7777', 'guilherme.silva@example.com', '222.111.444-55');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'Laura Lima', '(23) 66666-6666', 'laura.lima@example.com', '666.555.444-33');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'Raphael Costa', '(24) 55555-5555', 'raphael.costa@example.com', '222.111.444-55');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'Isabela Almeida', '(25) 44444-4444', 'isabela.almeida@example.com', '666.555.444-33');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'André Pereira', '(26) 33333-3333', 'andre.pereira@example.com', '222.111.444-55');
INSERT INTO tb_readers (Id, Name, Contact, Email, Cpf) VALUES  (nextval('tb_readers_sequence'), 'Nathalia Oliveira', '(27) 22222-2222', 'nathalia.oliveira@example.com', '666.123.453-21');