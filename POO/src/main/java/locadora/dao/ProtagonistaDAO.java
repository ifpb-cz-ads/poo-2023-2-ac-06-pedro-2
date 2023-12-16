/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import locadora.model.Protagonista;

/**
 *
 * @author pedro
 */
public class ProtagonistaDAO {
        public void cadastrarProtagonista(Protagonista protagonista) throws ExceptionDAO{
        Connection connect = null;
        try{
            Conexao conection = new Conexao();
            connect = conection.getConnection();

            String query = "INSERT INTO PROTAGONISTA (nome) VALUE (?)";
            try (PreparedStatement preparedStatement = connect.prepareStatement(query)){
                preparedStatement.setString(1, protagonista.getNome());

                preparedStatement.executeUpdate();
            }
            System.out.println("Item adicionado com sucesso!");
        }catch (SQLException e){
            throw new RuntimeException(e);
        }finally {
            if(connect != null){
                try{
                    connect.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
    
        public ArrayList<Protagonista> listarProtagonista(String nome) throws ExceptionDAO {
        String query = "select * from PROTAGONISTA where nome like '%" + nome + "%' order by by nome";
        
       Connection connect = null;
       PreparedStatement pStatement = null;
       ArrayList<Protagonista> protagonistas = null;
       
       try{
           Conexao conection = new Conexao();
            connect = conection.getConnection();
           pStatement = connect.prepareStatement(query);
           ResultSet rs = pStatement.executeQuery(query);
           
           if(rs!=null){
               protagonistas = new ArrayList<Protagonista>();
               while(rs.next()){
                   Protagonista protagonista = new Protagonista();
                   protagonista.setCodProtagonista(rs.getInt("codProtagonista"));
                   protagonista.setNome(rs.getString("nome"));
                   protagonistas.add(protagonista);
                   
               }
           }
           
       } catch (SQLException e) {
           throw new ExceptionDAO("Error ao consultar o Cliente." + e);
        }finally{
           try{
               if(pStatement!=null) { pStatement.close();}
           } catch (SQLException e) {
                throw new ExceptionDAO("Error ao fechar o pStatement:" + e);
           }
           try{
               if(connect!=null) {connect.close();}
           } catch (SQLException e) {
                 throw new ExceptionDAO("Error ao fechar conexão:" + e);
           }
       }
    return protagonistas;
    }

    public void apagarProtagonista(Protagonista protagonista) throws ExceptionDAO {
        Connection connect = null;
        try {
            Conexao conection = new Conexao();
            connect = conection.getConnection();

            String query = "DELETE FROM PROTAGONISTA WHERE codProtagonista=?";
            try (PreparedStatement preparedStatement = connect.prepareStatement(query)) {
                preparedStatement.setInt(1, protagonista.getCodProtagonista());
                preparedStatement.executeUpdate();
            }
            System.out.println("Item removido com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (connect != null) {
                try {
                    connect.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

        public void alterarProtagonista(Protagonista protagonista) throws ExceptionDAO {
        Connection connect = null;
        try {
            Conexao conection = new Conexao();
            connect = conection.getConnection();

            String query = "UPDATE JOGO SET nome=? WHERE codProtagonista=?";
            try (PreparedStatement preparedStatement = connect.prepareStatement(query)) {
                preparedStatement.setString(1, protagonista.getNome());

                preparedStatement.executeUpdate();
            }
            System.out.println("Item alterado com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (connect != null) {
                try {
                    connect.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

}
}

