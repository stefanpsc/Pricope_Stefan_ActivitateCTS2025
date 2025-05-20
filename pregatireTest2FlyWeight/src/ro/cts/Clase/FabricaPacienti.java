package ro.cts.Clase;

import java.security.PublicKey;
import java.util.HashMap;

public class FabricaPacienti {

    private HashMap<String,PacientAbstract>colectiePacienti;

    public FabricaPacienti() {
        colectiePacienti = new HashMap<String,PacientAbstract>();
    }

    public PacientAbstract getPacient(String nrTelefon) throws  Exception{
        PacientAbstract pacient = colectiePacienti.get(nrTelefon);
        if(pacient==null){
            throw new Exception("Pacientul nu exista");
        }else{
            return pacient;
        }
    }

    public PacientAbstract getPacient(String nume, String adresa, String numarTelefon ){
        PacientAbstract pacientAbstract = colectiePacienti.get(numarTelefon);
        if(pacientAbstract ==null){
            pacientAbstract = new Pacient(nume,adresa,numarTelefon);
            colectiePacienti.put(numarTelefon,pacientAbstract);
        }
            return pacientAbstract;
    }
}

