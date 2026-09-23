#Exercício 01
create database bdaula01;
show databases;
use bdaula01;

create table pessoa (
id int AUTO_INCREMENT PRIMARY KEY,
nome varchar(50) NOT NULL,
sexo varchar(1) NOT NULL,
idioma varchar(50) NOT NULL);

show tables;
desc pessoa;

INSERT INTO pessoa (nome, sexo, idioma)
values ("Ricardo", "M", "Português");

select * from pessoa;

INSERT INTO pessoa (nome, sexo, idioma)
values 
("Vinícius", "M", "Alemão"),
("Zorzi", "M", "Inglês"),
("João", "M", "Inglês"),
("Pedro", "M", "Grego"),
("Camille", "F", "Catalão"),
("João", "M", "Francês");

#Exercício 02
create database escola;
use escola;

create table aluno (
id int AUTO_INCREMENT PRIMARY KEY,
nome varchar(50) NOT NULL,
idade int NOT NULL,
curso varchar(50) NOT NULL);

show tables;
desc aluno;

INSERT INTO aluno (nome, idade, curso)
values ("Camille", 24 , "Sistemas de Informação");

select * from aluno;

INSERT INTO aluno (nome, idade, curso)
values 
("Vinícius", 20, "Ciência da Computação"),
("Zorzi", 20, "Sistemas de Informação"),
("João", 20, "Ciência da Computação"),
("Pedro", 23, "Ciência da Computação"),
("João", 20, "Sistemas de Informação");

create table professor (
id int AUTO_INCREMENT PRIMARY KEY,
nome varchar(50) NOT NULL,
idade int NOT NULL,
disciplina varchar(50) NOT NULL);

show tables;
desc professor;

INSERT INTO professor (nome, idade, disciplina)
values 
("Ricardo", 30, "Laboratório de Desenvolvimento de Software"),
("Herysson", 30, "Modelagem de Processo"),
("Herysson", 30, "Otimização do Processo Decisório"),
("Ana Paula", 30, "Fundamentos de Sistemas Operacionais"),
("Alessandro", 30, "Internet das Coisas"),
("Fabiano", 30, "Inovação Tecnológica e Empreendedorismo"),
("Luiz", 30, "Modelagem e simulação");

select * from professor;

create table matriculas (
id int AUTO_INCREMENT PRIMARY KEY,
id_aluno int NOT NULL,
id_professor int NOT NULL,
constraint fk_matricula_aluno foreign key (id_aluno) references aluno(id),
constraint fk_matricula_professor foreign key (id_professor) references professor(id),
data_matricula date NOT NULL);

desc matriculas;

INSERT INTO matriculas (id_aluno, id_professor, data_matricula)
values 
(1, 1, "2025-01-15"),
(3, 1, "2026-05-23"),
(5, 2, "2024-08-27"),
(4, 2, "2025-02-20");

select * from matriculas;
