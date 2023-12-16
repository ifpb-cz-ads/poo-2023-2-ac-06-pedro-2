
package locadora.controller;

import java.util.ArrayList;
import locadora.dao.ExceptionDAO;
import locadora.dao.JogoDAO;
import locadora.model.Jogo;

public class JogoController {
    
    public boolean cadastrarJogo(String titulo, String genero, String sinopse) throws ExceptionDAO{
       if(titulo != null && titulo.length() > 0 && genero != null && genero.length() > 0 && sinopse != null && sinopse.length() > 0){
    Jogo jogo = new Jogo(titulo, genero, sinopse);                          
    JogoDAO joguim = new JogoDAO();
    joguim.cadastrarJogo(jogo);
    return true;
    
       }
    return false;
    }
        public ArrayList<Jogo> listarJogos(String nome) throws ExceptionDAO{
        return new Jogo().listarJogos(nome);
    }

    public boolean alterarJogo(Integer codJogo, String titulo, String genero, String sinopse) throws ExceptionDAO{
        if(titulo != null && titulo.length() > 0 && genero != null && genero.length() >0 && sinopse != null && sinopse.length() >0){
        Jogo jogo = new Jogo(titulo, genero, sinopse);
        jogo.setCodJogo(codJogo);
        jogo.alterarJogo(jogo);
           return true;
        }
        return false;
    }
    public boolean apagarJogo(int codJogo) throws ExceptionDAO{
        if(codJogo == 0){
            return false;
        }else{
            Jogo jogo = new Jogo();
            jogo.setCodJogo(codJogo);
            jogo.apagarJogo(jogo);
            return true;
        } 
    }
    
}
