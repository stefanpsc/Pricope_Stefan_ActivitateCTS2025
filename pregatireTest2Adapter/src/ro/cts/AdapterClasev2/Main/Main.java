package ro.cts.AdapterClasev2.Main;

import ro.cts.AdapterClase.Clase.AdaptorClaseMedicament;
import ro.cts.AdapterClase.Clase.Farmacie;
import ro.cts.AdapterClase.Clase.MedicamentFarmacie;

public class Main {

    public  static  void main(String[] args) {
        Farmacie farmacie = new Farmacie("DR MAX");

        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("ASPACARDIN", "12.02.2024", true, 200);
        MedicamentFarmacie medicamentFarmacie1 = new MedicamentFarmacie("NUROFEN", "12.01.2024", true, 23);
        MedicamentFarmacie medicamentFarmacie2 = new MedicamentFarmacie("Strepsils", "12.09.2044", true, 28);
        MedicamentFarmacie medicamentFarmacie3 = new MedicamentFarmacie("EUBIOTIC", "12.01.2014", true, 20);

        farmacie.vindeMedicamente(medicamentFarmacie);
        farmacie.vindeMedicamente(medicamentFarmacie1);
        farmacie.vindeMedicamente(medicamentFarmacie2);
        farmacie.vindeMedicamente(medicamentFarmacie3);

        AdaptorClaseMedicament adaptorClaseMedicament = new AdaptorClaseMedicament("ASHWAGANDA", 100);
        AdaptorClaseMedicament adaptorClaseMedicament1 = new AdaptorClaseMedicament("OMEGA 3", 800);

        farmacie.vindeMedicamente(adaptorClaseMedicament1);
        farmacie.vindeMedicamente(adaptorClaseMedicament);

    }

}
