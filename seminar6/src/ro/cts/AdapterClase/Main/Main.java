package ro.cts.AdapterClase.Main;

import ro.cts.AdapterClase.Clase.AdaptorClaseMedicament;
import ro.cts.AdapterClase.Clase.Farmacie;
import ro.cts.AdapterClase.Clase.MedicamentFarmacie;

public class Main {
    public static void main(String[] args){
        Farmacie farmacie = new Farmacie("Catena");

        MedicamentFarmacie medicamentFarmacie1 = new MedicamentFarmacie("Parasinus", "04.05.2028",28.5f,true);
        MedicamentFarmacie medicamentFarmacie2 = new MedicamentFarmacie("Paracetamol", "04.05.2028",28.1f,true);

        farmacie.vindeMedicamente(medicamentFarmacie1);
        farmacie.vindeMedicamente(medicamentFarmacie2);

        AdaptorClaseMedicament adaptorClaseMedicament = new AdaptorClaseMedicament(17.8f,"Paracetamol");
        farmacie.vindeMedicamente(adaptorClaseMedicament);
    }
}
