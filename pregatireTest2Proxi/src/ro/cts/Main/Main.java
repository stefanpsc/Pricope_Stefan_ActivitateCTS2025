package ro.cts.Main;

import ro.cts.Clase.IRezervare;
import ro.cts.Clase.ProxyNrPersoane;
import ro.cts.Clase.ProxyOra;
import ro.cts.Clase.Rezervare;

public class Main {
    public static void main(String[] args){
        IRezervare rezervare = new Rezervare();
        rezervare.rezerva("Adelin", 5,15);
        IRezervare proxyNumarPersoane = new ProxyNrPersoane(rezervare);
        proxyNumarPersoane.rezerva("marintel", 3, 15);
        IRezervare proxyOra = new ProxyOra(proxyNumarPersoane);
        proxyOra.rezerva("Ionica", 5, 10);
    }
}
