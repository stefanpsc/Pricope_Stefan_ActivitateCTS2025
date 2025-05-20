package ro.cts.clase;

import java.util.HashMap;

public class FactoryPacienti{
    private HashMap<String,PacientAbstract> colectiePacienti;

    public FactoryPacienti() {
      colectiePacienti = new HashMap<String,PacientAbstract>();
    }

    public PacientAbstract getPacient(String nume, String nrTelefon, String adresa) throws Exception{
        PacientAbstract pacientAbstract = colectiePacienti.get(nrTelefon);
        if(pacientAbstract == null){
            pacientAbstract = new Pacient(nume, adresa,nrTelefon);
            colectiePacienti.put(nrTelefon, pacientAbstract);
        }
            return pacientAbstract;
    }
}
