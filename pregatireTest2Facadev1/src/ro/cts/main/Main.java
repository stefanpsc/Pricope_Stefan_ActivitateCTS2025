package ro.cts.main;

//B.6. În momentul în care un client vine la restaurant pentru o masă, recepționistul trebuie să
//verifice dacă are masă liberă, apoi să verifice dacă acea masă a fost debarasată de la plecarea
//ultimului client, de asemenea trebuie să verifice dacă au fost puse șervețele noi pe masă. Managerul
//restaurantului dorește realizarea unui modul care să simplifice munca recepționistului și să nu mai
//fie nevoit să verifice în toate locurile ci doar într-un singur loc.

import ro.cts.clase.Masa;
import ro.cts.clase.Receptionist;

public class Main {
    public static void main(String[] args){
        Receptionist receptionist = new Receptionist();
        Masa masa = new Masa(true, 23,13);
        System.out.println(receptionist.sePoateAsezaClientul(masa));

        Masa masa1 = new Masa(true, 20,13);
        System.out.println(receptionist.sePoateAsezaClientul(masa1));

        Masa masa2 = new Masa(true, 25,13);
        System.out.println(receptionist.sePoateAsezaClientul(masa2));
    }
}
