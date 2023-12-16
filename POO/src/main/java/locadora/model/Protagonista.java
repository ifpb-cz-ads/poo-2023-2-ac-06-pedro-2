package locadora.model;

import java.util.ArrayList;
import locadora.dao.ExceptionDAO;
import locadora.dao.ProtagonistaDAO;


public class Protagonista {
    private Integer codProtagonista;
    private String nome;
    private ArrayList<Jogo> jogos = new ArrayList<Jogo> ();
    
    public Protagonista(){}
    
    public Protagonista(String nome){
        this.nome = nome;
    }

    public Integer getCodProtagonista() {
        return codProtagonista;
    }

    public void setCodProtagonista(Integer codProtagonista) {
        this.codProtagonista = codProtagonista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Jogo> getJogos() {
        return jogos;
    }

    public void setJogos(ArrayList<Jogo> jogos) {
        this.jogos = jogos;
    }

    public void cadastrarProtagonista(Protagonista protagonista) throws ExceptionDAO{
        new ProtagonistaDAO().cadastrarProtagonista(protagonista);
    }
    
    public ArrayList<Protagonista> listarProtagonista(String nome) throws ExceptionDAO{
        return new ProtagonistaDAO().listarProtagonista(nome);
    }
    public void alterarProtagonista(Protagonista protagonista) throws ExceptionDAO{
        new ProtagonistaDAO().alterarProtagonista(protagonista);
    }
    public void apagarProtagonista(Protagonista protagonista) throws ExceptionDAO{
        new ProtagonistaDAO().apagarProtagonista(protagonista);
    }

}
