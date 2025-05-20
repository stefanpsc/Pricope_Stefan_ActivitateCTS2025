package ro.cts.Main;

import ro.cts.Clase.FabricaPacienti;
import ro.cts.Clase.PacientAbstract;
import ro.cts.Clase.Spitalizare;

public class Main {
    public static void main(String[] args){

        FabricaPacienti fabricaPacienti = new FabricaPacienti();
        try{
            PacientAbstract pacient = fabricaPacienti.getPacient("Ionel","Bradului","07222333444");
            Spitalizare spitalizare = new Spitalizare(2,3,4);
            Spitalizare spitalizare1 = new Spitalizare(3,4,5);
            pacient.afiseazaDescriere(spitalizare);
            pacient.afiseazaDescriere(spitalizare1);

            fabricaPacienti.getPacient("Stefan","Pinului","07818181").afiseazaDescriere(spitalizare);
            fabricaPacienti.getPacient("07818181").afiseazaDescriere(spitalizare1);




        }catch (Exception e){
            throw new RuntimeException(e);
        }


    }

}
