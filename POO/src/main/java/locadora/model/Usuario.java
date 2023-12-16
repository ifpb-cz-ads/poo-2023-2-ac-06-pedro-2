package locadora.model;

import java.util.ArrayList;
import locadora.dao.ExceptionDAO;
import locadora.dao.UsuarioDAO;

/**
 *
 * @author pedro
 */
public class Usuario {
    private Integer codUsuario;
    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    
    public Usuario(){}
    
    public Usuario(String nome, String cpf, String email, String endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
    }

    public Integer getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

 public void cadastrarUsuario(Usuario usuario) throws ExceptionDAO{
        new UsuarioDAO().cadastrarUsuario(usuario);
    }
    
    public ArrayList<Usuario> listarUsuario(String nome) throws ExceptionDAO{
        return new UsuarioDAO().listarUsuario(nome);
    }
    public void alterarUsuario(Usuario usuario) throws ExceptionDAO{
        new UsuarioDAO().alterarUsuario(usuario);
    }
    public void apagarUsuario(Usuario usuario) throws ExceptionDAO{
        new UsuarioDAO().apagarUsuario(usuario);
    }
    

}
