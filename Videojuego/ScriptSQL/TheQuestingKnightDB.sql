drop database if exists TheQuestingKnightDB;
create database if not exists TheQuestingKnightDB;
use TheQuestingKnightDB;

drop table if exists TipoPersonaje;
create table if not exists TipoPersonaje(
id int auto_increment primary key,
tipoPersonaje enum ('Luchador', 'Asesino', 'Tanque', 'Mago')
);

drop table if exists Estadisticas;
create table if not exists Estadisticas(
id int auto_increment primary key,
Vitalidad int,
Fuerza int,
Agilidad int,
PercepcionMagica int,
EstadisticaEspecial int,
Nivel int
);

drop table if exists InventariObjetos;
create table if not exists InventariObjetos(
id int auto_increment primary key,
Objeto_1 varchar(40) default null,
Objeto_2 varchar(40) default null,
Objeto_3 varchar(40) default null,
Objeto_4 varchar(40) default null
);

drop table if exists Partidas;
create table if not exists Partidas(
id int auto_increment primary key,
id_Personaje int,
id_Estadisticas int,
id_Inventario int,
FechaYHoraInicio varchar(50),
FechaYHoraFinal varchar(50),
Duracion varchar(50),
Victoria varchar(10),
constraint FK_idPersonaje foreign key (id_Personaje) references TipoPersonaje(id) on delete set null,
constraint FK_idEstadisticas foreign key (id_Estadisticas) references Estadisticas(id) on delete set null,
constraint FK_idInventario foreign key (id_Inventario) references InventariObjetos(id) on delete set null
);




Insert into TipoPersonaje (tipoPersonaje) values ('Luchador');
Insert into TipoPersonaje (tipoPersonaje) values ('Asesino');
Insert into TipoPersonaje (tipoPersonaje) values ('Tanque');
Insert into TipoPersonaje (tipoPersonaje) values ('Mago');
select * from TipoPersonaje;
