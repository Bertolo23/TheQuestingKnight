drop database if exists TheQuestingKnightDB;
create database if not exists TheQuestingKnightDB;
use TheQuestingKnightDB;

create table if not exists TipoPersonaje(
id int auto_increment primary key,
tipoPersonaje enum ('Luchador', 'Asesino', 'Tanque', 'Mago')
);

drop table if exists Partidas;
create table if not exists Partidas(
id int auto_increment primary key,
id_Personaje int,
FechaYHoraInicio varchar(50),
FechaYHoraFinal varchar(50),
Duracion varchar(50),
Vitalidad int,
Fuerza int,
Agilidad int,
PercepcionMagica int,
EstadisticaEspecial int,
Nivel int,
constraint FK_idPersonaje foreign key (id_Personaje) references TipoPersonaje(id)

);

Insert into TipoPersonaje (tipoPersonaje) values ('Luchador');
Insert into TipoPersonaje (tipoPersonaje) values ('Asesino');
Insert into TipoPersonaje (tipoPersonaje) values ('Tanque');
Insert into TipoPersonaje (tipoPersonaje) values ('Mago');
select * from TipoPersonaje;
select * from Partidas;