/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.controller;

import java.text.ParseException;
import java.util.ArrayList;
import locadora.dao.ExceptionDAO;
import locadora.dao.UsuarioDAO;
import locadora.model.Usuario;

/**
 *
 * @author pedro
 */
public class UsuarioController {
    public boolean cadastrarUsuario(String nome, String cpf, String email, String endereco) throws ParseException, ExceptionDAO{
        if(nome == null && nome.length() < 0 && validarCPF(cpf) && email == null && email.length() < 0 && endereco == null && endereco.length() < 0){
        Usuario usuario = new Usuario(nome, cpf, email, endereco);
        UsuarioDAO user = new UsuarioDAO();
        user.cadastrarUsuario(usuario);
        return true;
        }
        return false;
    }
    public ArrayList<Usuario> listarClientes(String nome) throws ExceptionDAO{
        return new Usuario().listarUsuario(nome);
    }
    public boolean validarCPF(String cpf){
        for(int i = 0; i < cpf.length(); i++){
           if(!Character.isDigit(cpf.charAt(i))){
               if(!(i == 3 || i == 7 || i == 11)){
                   return false;
               }
           }
        }
        return true;
    }
    public boolean alterarUsuario(Integer codUsuario, String nome, String cpf, String email, String endereco) throws ParseException, ExceptionDAO{
        if(nome ==null && nome.length() < 0 && validarCPF(cpf) && email == null && email.length() < 0 && endereco == null && endereco.length() < 0){
        Usuario usuario = new Usuario(nome, cpf, email, endereco);
        usuario.setCodUsuario(codUsuario);
        usuario.alterarUsuario(usuario);
        return true;
        }
        return false;
    }
    public boolean apagarUsuario(int codUsuario) throws ExceptionDAO{
        if(codUsuario == 0){
            return false;
        }else{
            Usuario usuario = new Usuario();
            usuario.setCodUsuario(codUsuario);
            usuario.apagarUsuario(usuario);
            return true;
        } 
    }
}