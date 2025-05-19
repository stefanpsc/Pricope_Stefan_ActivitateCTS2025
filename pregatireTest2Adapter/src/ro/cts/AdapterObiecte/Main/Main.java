package ro.cts.AdapterObiecte.Main;

import ro.cts.AdapterObiecte.Clase.MedicamentFarmacie;
import ro.cts.AdapterObiecte.Clase.AdaptorObiecteMedicament;
import ro.cts.AdapterObiecte.Clase.MedicamentSpital;

public class Main {

    public static void vindeMedicamente(MedicamentFarmacie medicamentFarmacie){
        System.out.println("Bun venit la farmacia MEDFARM");
        medicamentFarmacie.cumparaMedicament();
    }
    public static void main(String[] args){
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("aspacardin", "69.69.6969", true,6969.69f );
        vindeMedicamente(medicamentFarmacie);
        MedicamentSpital medicamentSpital = new MedicamentSpital("extraveral",6969.69f);

        AdaptorObiecteMedicament adapterObiecte = new AdaptorObiecteMedicament(medicamentSpital);
        vindeMedicamente(adapterObiecte);
    }
}
