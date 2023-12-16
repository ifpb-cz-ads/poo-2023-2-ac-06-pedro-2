package locadora.model;

import java.util.ArrayList;
import locadora.dao.ExceptionDAO;
import locadora.dao.JogoDAO;

public class Jogo {
    
    private Integer codjogo;
    private String titulo;
    private String genero;
    private String sinopse;
    private ArrayList<Protagonista> protagonista = new ArrayList<Protagonista> ();

    public Jogo(){
        
    }
    
    public Jogo(String titulo, String genero, String sinopse) {
        this.titulo = titulo;
        this.genero = genero;
        this.sinopse = sinopse;
    }

    public Integer getCodJogo() {
        return codjogo;
    }

    public void setCodJogo(Integer codjogo) {
        this.codjogo = codjogo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public ArrayList<Protagonista> getProtagonista() {
        return protagonista;
    }

    public void setAtores(ArrayList<Protagonista> protagonista) {
        this.protagonista = protagonista;
    }

    public void cadastrarJogo(Jogo jogo) throws ExceptionDAO {
        new JogoDAO().cadastrarJogo(jogo);
    }

    public ArrayList<Jogo> listarJogos(String nome) throws ExceptionDAO {
        return new JogoDAO().listarJogos(nome); 
    }

    public void alterarJogo(Jogo jogo) throws ExceptionDAO {
        new JogoDAO().alterarJogo(jogo);
    }

    public void apagarJogo(Jogo jogo) throws ExceptionDAO {
        new JogoDAO().apagarJogo(jogo);
    }


   
}
