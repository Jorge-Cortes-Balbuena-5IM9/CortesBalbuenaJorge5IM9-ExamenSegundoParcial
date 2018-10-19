create database Examen;

use Examen;
create table usuarios1(
Nombre Varchar(20),
ApellidoPaterno varchar(20),
ApellidoMaterno varchar(20),
Escuela varchar(20),
MateriaFavorita varchar(20),
DeporteFavorito varchar(20),
Contraseña varchar(20)
);

insert into usuarios1 value("Jorge","Cortes","Balbuena","CECyT9","Canchas","Box","contra123"); 
select * from usuarios1;