package ro.cts.program;

import ro.cts.clase.Rezervare;
import ro.cts.clase.RezervareBuilder;

public class Main {
    public static void main(String[] args){
        RezervareBuilder rezervare = new RezervareBuilder("Adrian");
        Rezervare rezervare1 = rezervare.setHasScauneErg(true).build();
        System.out.println(rezervare1);
    }
}
