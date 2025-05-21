package ro.cts.main;

import ro.cts.clase.Autobuz;
import ro.cts.clase.Calator;
import ro.cts.clase.MijlocDeTransport;
import ro.cts.clase.Observer;

public class Main {
    public static void main(String[] args){
        Observer calator = new Calator("Mihai");
        Observer calator1 = new Calator("Stefan");
        Observer calator2 = new Calator("Grecu");

        MijlocDeTransport autobuz = new Autobuz(1);
        autobuz.adaugaObserver(calator);
        autobuz.adaugaObserver(calator1);
        autobuz.adaugaObserver(calator2);
        autobuz.pleacaDeLaCapat();

        ((Autobuz)autobuz).schimbaTraseu();
    }
}
