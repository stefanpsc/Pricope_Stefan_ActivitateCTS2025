package ro.cts.main;

import ro.cts.clase.IRezervare;
import ro.cts.clase.ProxyNrPersoane;
import ro.cts.clase.Rezervare;

public class Main {
    public static void main(String[] args){
        IRezervare rezervare = new Rezervare();
        rezervare.rezerva("GIGEL", 4,20);
        IRezervare proxyNumarPersoane = new ProxyNrPersoane(rezervare);
        proxyNumarPersoane.rezerva("Stefan", 2,20);
    }
}
