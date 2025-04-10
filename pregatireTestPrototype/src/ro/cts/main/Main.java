package ro.cts.main;

import ro.cts.clase.AbstractRezervare;
import ro.cts.clase.RezervareTerasa;

public class Main {
    public static void main(String[] args){
        AbstractRezervare rezervareTerasa = new RezervareTerasa(12,15,"Popica",12,true);
        AbstractRezervare rezervareTerasa1 = rezervareTerasa.copiaza(22);
        AbstractRezervare rezervareTerasa2 = rezervareTerasa.copiaza(30);
        System.out.println(rezervareTerasa.toString());
        System.out.println(rezervareTerasa1.toString());
        System.out.println(rezervareTerasa2.toString());
    }
}
