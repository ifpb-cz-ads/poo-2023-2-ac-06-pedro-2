package locadora.controller;

import java.util.ArrayList;
import locadora.dao.ExceptionDAO;
import locadora.model.Protagonista;
import locadora.dao.ProtagonistaDAO;

/**
 *
 * @author pedro
 */
public class ProtagonistaController {
    public boolean cadastrarProtagonista(String nome) throws ExceptionDAO{
        if(nome != null && nome.length() > 0){
            Protagonista protagonista = new Protagonista(nome);
            ProtagonistaDAO prota = new ProtagonistaDAO();
            prota.cadastrarProtagonista(protagonista);
            return true;
        }
        return false;
    }
    
    public ArrayList<Protagonista> listarProtagonista(String nome) throws ExceptionDAO{
        return new Protagonista().listarProtagonista(nome);
    }

    public boolean alterarProtagonista(String nome, int codProtagonista) throws ExceptionDAO{
        if(nome != null && nome.length() > 0){
        Protagonista protagonista = new Protagonista(nome);
        protagonista.setCodProtagonista(codProtagonista);
        protagonista.alterarProtagonista(protagonista);
           return true;
        }
        return false;
    }
    public boolean apagarProtagonista(int codProtagonista) throws ExceptionDAO{
        if(codProtagonista == 0){
            return false;
        }else{
            Protagonista protagonista = new Protagonista();
            protagonista.setCodProtagonista(codProtagonista);
            protagonista.apagarProtagonista(protagonista);
            return true;
        } 
    }
    
}
