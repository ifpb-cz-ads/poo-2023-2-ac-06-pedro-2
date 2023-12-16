package locadora.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public Conexao(){}

    public Connection getConnection() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/MVC";
        String username = "root";
        String password = "12345";  

        Connection conexao = null;
        try {
            // Carrega o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Estabelece a conexão
            conexao = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conexao;
    }
}


/*

drop database if exists MVC;
create database if not exists MVC;
use MVC;

CREATE TABLE USUARIO(
codUsuario int auto_increment not null,
nome varchar(50),
CPF varchar(14),
email varchar(30),
endereço varchar (50),
PRIMARY KEY (codUsuario))

CREATE TABLE JOGO(
codJogo int auto_increment not null,
título varchar(20),
gênero varchar(15),
sinopse varchar(50),
duração int,
PRIMARY KEY (codJogo))

CREATE TABLE PROTAGONISTA(
codProtagonista int auto_increment not null,
nome varchar(30),
PRIMARY KEY (codProtagonista))

CREATE TABLE JOGO_PROTAGONISTA(
codJogo int not null,
codProtagonista int not null,
PRIMARY KEY (codJogo,codProtagonista),
FOREIGN KEY (codJogo) REFERENCES Jogo (codJogo),
FOREIGN KEY (codProtagonista) REFERENCES Protagonista (codProtagonista))
*/