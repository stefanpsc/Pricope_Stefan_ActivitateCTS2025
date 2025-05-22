package ro.cts.main;

import ro.cts.clase.Autobuz;
import ro.cts.clase.Calator;
import ro.cts.clase.MijlocDeTransport;
import ro.cts.clase.Observer;

public class Main {
    public static void main(String[] args){
        Observer calator = new Calator("MARIAN");
        Observer calator1 = new Calator("Eric");
        Observer calator2 = new Calator("Alex");

        MijlocDeTransport autobuz = new Autobuz(2);
        autobuz.adaugaObserver(calator);
        autobuz.adaugaObserver(calator1);
        autobuz.adaugaObserver(calator2);
        autobuz.schimbaLinia();

    }
}
