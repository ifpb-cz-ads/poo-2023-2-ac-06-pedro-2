/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.dao;
import locadora.model.Jogo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class JogoDAO {
        public void cadastrarJogo(Jogo jogo) throws ExceptionDAO{
        Connection connect = null;
        try{
            Conexao conection = new Conexao();
            connect = conection.getConnection();

            String query = "INSERT INTO jogo (titulo, genero, sinopse) VALUES (?, ?, ?)";
            try (PreparedStatement preparedStatement = connect.prepareStatement(query)){
                preparedStatement.setString(1, jogo.getTitulo());
                preparedStatement.setString(2, jogo.getGenero());
                preparedStatement.setString(3, jogo.getSinopse());

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
    
        public ArrayList<Jogo> listarJogos(String nome) throws ExceptionDAO {
        String query = "select * from JOGO where nome like '%" + nome + "%' order by by nome";
        
       Connection connect = null;
       PreparedStatement pStatement = null;
       ArrayList<Jogo> jogos = null;
       
       try{
           Conexao conection = new Conexao();
            connect = conection.getConnection();
           pStatement = connect.prepareStatement(query);
           ResultSet rs = pStatement.executeQuery(query);
           
           if(rs!=null){
               jogos = new ArrayList<Jogo>();
               while(rs.next()){
                   Jogo jogo = new Jogo();
                   jogo.setCodJogo(rs.getInt("codJogo"));
                   jogo.setTitulo(rs.getString("titulo"));
                   jogo.setGenero(rs.getString("genero"));
                   jogo.setSinopse(rs.getString("sinopse"));
                   jogos.add(jogo);
                   
               }
           }
           
       } catch (SQLException e) {
           throw new ExceptionDAO("Error ao consultar o Jogo." + e);
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
    return jogos;
    }

    public void apagarJogo(Jogo jogo) throws ExceptionDAO {
        Connection connect = null;
        try {
            Conexao conection = new Conexao();
            connect = conection.getConnection();

            String query = "DELETE FROM JOGO WHERE codJogo=?";
            try (PreparedStatement preparedStatement = connect.prepareStatement(query)) {
                preparedStatement.setInt(1, jogo.getCodJogo());
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
    
    public void alterarJogo(Jogo jogo) throws ExceptionDAO {
        Connection connect = null;
        try {
            Conexao conection = new Conexao();
            connect = conection.getConnection();

            String query = "UPDATE JOGO SET titulo=?, genero=?, sinopse=? WHERE codJogo=?";
            try (PreparedStatement preparedStatement = connect.prepareStatement(query)) {
                preparedStatement.setString(1, jogo.getTitulo());
                preparedStatement.setString(2, jogo.getGenero());
                preparedStatement.setString(3, jogo.getSinopse());
                preparedStatement.setInt(4, jogo.getCodJogo());

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

