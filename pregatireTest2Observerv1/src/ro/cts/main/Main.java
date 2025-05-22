package ro.cts.main;

import ro.cts.clase.Autobuz;
import ro.cts.clase.Calator;
import ro.cts.clase.MijlocDeTransport;
import ro.cts.clase.Observer;

public class Main {
    public static void main(String[] args){
        Observer calator = new Calator("Georgica");
        Observer calator1 = new Calator("MIHAI");
        Observer calator2 = new Calator("GRECU");

        MijlocDeTransport autobuz = new Autobuz(3);
        autobuz.adaugaObserver(calator1);
        autobuz.adaugaObserver(calator2);
        autobuz.adaugaObserver(calator);

        autobuz.pleacaDeLaCapat();
        //
        // ((Autobuz)autobuz).schimbaTraseu();
    }
}
