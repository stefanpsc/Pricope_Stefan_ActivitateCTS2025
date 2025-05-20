package ro.cts.AdapterClasev3.Main;

import ro.cts.AdapterClasev3.Clase.AdapterClaseMedicament;
import ro.cts.AdapterClasev3.Clase.Farmacie;
import ro.cts.AdapterClasev3.Clase.MedicamentFarmacie;


public class Main {
    public static void main(String[] args){
        Farmacie farmacie = new Farmacie("NONSTOP");
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("nurofen", "12.12.12",true,2000);
        MedicamentFarmacie medicamentFarmacie1 = new MedicamentFarmacie("nurofen", "12.12.12",true,1900);

        farmacie.vindeMedicament(medicamentFarmacie);
        farmacie.vindeMedicament(medicamentFarmacie1);

        AdapterClaseMedicament medicamentSpital = new AdapterClaseMedicament("Clor", 299);
        farmacie.vindeMedicament(medicamentSpital);
    }
}
