package ro.cts.main;


import ro.cts.clase.FactoryPacienti;
import ro.cts.clase.Pacient;
import ro.cts.clase.PacientAbstract;
import ro.cts.clase.Spitalizare;

public class Main {
    public static void main(String[] args){
        FactoryPacienti factoryPacienti = new FactoryPacienti();
        try{
            PacientAbstract pacientAbstract = factoryPacienti.getPacient("Ion", "010101","ad");
            Spitalizare spitalizare = new Spitalizare(2,2,2);
            pacientAbstract.afiseazaDescriere(spitalizare);

            factoryPacienti.getPacient("Ion","010101","ad").afiseazaDescriere(spitalizare);

        }catch (Exception e){
            throw new RuntimeException(e);
        }


    }

}
