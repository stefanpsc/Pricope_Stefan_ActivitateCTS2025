package ro.cts.AdapterObiecte.main;

import ro.cts.AdapterObiecte.clase.AdaptorObiecteMedicament;
import ro.cts.AdapterObiecte.clase.MedicamentFarmacie;
import ro.cts.AdapterObiecte.clase.MedicamentSpital;

public class Main {

    public static void vindeMedicamente(MedicamentFarmacie medicamentFarmacie){
        System.out.println("Bine ati venit la farmacia inimi CATENAAAAAA");
        medicamentFarmacie.cumparaMedicament();
    }



    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("aspacardin", "69.69.6969", 6969.69f, true);
        vindeMedicamente(medicamentFarmacie);
        MedicamentSpital medicamentSpital = new MedicamentSpital(6969.69f,"extraveral");

        AdaptorObiecteMedicament adapterObiecte = new AdaptorObiecteMedicament(medicamentSpital);
        vindeMedicamente(adapterObiecte);
    }
}