package MaiFacOdata.main;

import MaiFacOdata.clase.Masa;
import MaiFacOdata.clase.Receptionist;

public class Main {
    public static void main (String[] args){
        Masa masa = new Masa(true,12,13);
        Masa masa1 = new Masa(false,12,12);
        Masa masa3 = new Masa(true,12,25);
        Masa masa2 = new Masa(true,12,12);

        Receptionist receptionist = new Receptionist();
        System.out.println(receptionist.sePoateAseza(masa));
        System.out.println(receptionist.sePoateAseza(masa2));
        System.out.println(receptionist.sePoateAseza(masa1));
        System.out.println(receptionist.sePoateAseza(masa3));


    }
}
