package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args){
        IMetodaPlata metodaPlata = new CardCalatorie(2);
        Calator calator = new Calator("STEFAN",metodaPlata);
        calator.platesteBilet(3);
        calator.setMetodaPlata(new CardBancar(100));
        calator.platesteBilet(50);
        calator.setMetodaPlata(new PlataSMS());
        calator.platesteBilet(20);

    }
}
