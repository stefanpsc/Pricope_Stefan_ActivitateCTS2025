package ro.cts.AdapterClase.Main;

import ro.cts.AdapterClase.Clase.AdaptorClaseMedicament;
import ro.cts.AdapterClase.Clase.Farmacie;
import ro.cts.AdapterClase.Clase.MedicamentFarmacie;
import ro.cts.AdapterClase.Clase.MedicamentSpital;

public class Main {
    public static void main(String[] args){
        Farmacie farmacie = new Farmacie("Catena");
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Paracetamol","21.04.2025",true,200);
        MedicamentFarmacie medicamentFarmacie1 = new MedicamentFarmacie("Aspacardin","21.06.2025",true,190);

        farmacie.vindeMedicamente(medicamentFarmacie1);
        farmacie.vindeMedicamente(medicamentFarmacie);

        AdaptorClaseMedicament adaptorClaseMedicament = new AdaptorClaseMedicament("Aspacardin",500);
        farmacie.vindeMedicamente(adaptorClaseMedicament);


    }
}
