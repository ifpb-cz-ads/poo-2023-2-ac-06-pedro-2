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
import locadora.model.Usuario;

/**
 *
 * @author pedro
 */
public class UsuarioDAO {
        public void cadastrarUsuario(Usuario usuario) throws ExceptionDAO{
        Connection connect = null;
        try{
            Conexao conection = new Conexao();
            connect = conection.getConnection();

            String query = "INSERT INTO USUARIO (nome, cpf, email, endereco) VALUES (?, ?, ?)";
            try (PreparedStatement preparedStatement = connect.prepareStatement(query)){
                preparedStatement.setString(1, usuario.getNome());
                preparedStatement.setString(2, usuario.getCpf());
                preparedStatement.setString(3, usuario.getEmail());
                preparedStatement.setString(4, usuario.getEndereco());

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
    
        public ArrayList<Usuario> listarUsuario(String nome) throws ExceptionDAO {
        String query = "select * from USUARIO where nome like '%" + nome + "%' order by by nome";
        
       Connection connect = null;
       PreparedStatement pStatement = null;
       ArrayList<Usuario> usuarios = null;
       
       try{
           Conexao conection = new Conexao();
            connect = conection.getConnection();
           pStatement = connect.prepareStatement(query);
           ResultSet rs = pStatement.executeQuery(query);
           
           if(rs!=null){
               usuarios = new ArrayList<Usuario>();
               while(rs.next()){
                   Usuario usuario = new Usuario();
                   usuario.setCodUsuario(rs.getInt("codUsuario"));
                   usuario.setNome(rs.getString("nome"));
                   usuario.setCpf(rs.getString("cpf:"));
                   usuario.setEmail(rs.getString("email"));
                   usuario.setEndereco(rs.getString("endereco"));
                   usuarios.add(usuario);
                   
               }
           }
           
       } catch (SQLException e) {
           throw new ExceptionDAO("Error ao consultar o jogo." + e);
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
    return usuarios;
    }

    public void apagarUsuario(Usuario usuario) throws ExceptionDAO {
        Connection connect = null;
        try {
            Conexao conection = new Conexao();
            connect = conection.getConnection();

            String query = "DELETE FROM USUARIO WHERE codUsuario=?";
            try (PreparedStatement preparedStatement = connect.prepareStatement(query)) {
                preparedStatement.setInt(1, usuario.getCodUsuario());
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

    public void alterarUsuario(Usuario usuario) throws ExceptionDAO {
        Connection connect = null;
        try {
            Conexao conection = new Conexao();
            connect = conection.getConnection();

            String query = "UPDATE JOGO SET titulo=?, genero=?, sinopse=? WHERE codJogo=?";
            try (PreparedStatement preparedStatement = connect.prepareStatement(query)) {
                preparedStatement.setString(1, usuario.getNome());
                preparedStatement.setString(2, usuario.getCpf());
                preparedStatement.setString(3, usuario.getEmail());
                preparedStatement.setString(3, usuario.getEndereco());
                preparedStatement.setInt(4, usuario.getCodUsuario());

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
