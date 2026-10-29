create database bdatividade;
show databases;
use bdatividade;

CREATE TABLE categorias (
	id int AUTO_INCREMENT PRIMARY KEY,
	nome varchar(50) NOT NULL
);

select * from categorias;

CREATE TABLE produtos (
	id int AUTO_INCREMENT PRIMARY KEY,
	nome varchar(50) NOT NULL,
  preco decimal(10, 2) NOT NULL,
  quantidade int NOT NULL,
  categoria_id int NOT NULL,
  constraint fk_produtos_categorias foreign key (categoria_id) references categorias(id)
);

select * from produtos;
