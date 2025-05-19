package ro.cts.Main;

import ro.cts.Clase.Masa;
import ro.cts.Clase.Receptionist;

public class Main {
    public static void main (String[] args){
        Masa masa  = new Masa(true,20,15);
        Masa masa1 = new Masa(true, 23, 10);
        Masa masa2 = new Masa(true, 4, 13 );

        Receptionist receptionist = new Receptionist();
        System.out.println(receptionist.sepoateAsezaLaMasa(masa));
        System.out.println(receptionist.sepoateAsezaLaMasa(masa1));
        System.out.println(receptionist.sepoateAsezaLaMasa(masa2));
    }
}
