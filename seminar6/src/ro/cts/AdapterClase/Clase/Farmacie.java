package ro.cts.AdapterClase.Clase;

public class Farmacie{
    private String nume;

    public Farmacie(String nume){
        this.nume = nume;
    }

    public static void vindeMedicamente(IMedicamentFarmacie medicamentFarmacie){
        System.out.println("Bine ati venit la farmacia inimi CATENAAAAAA");
        medicamentFarmacie.cumparaMedicament();
    }
}
