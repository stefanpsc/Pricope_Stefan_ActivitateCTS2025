package ro.cts.AdapterClase.Clase;

public class Farmacie {

    private String numeFarmacie;

    public Farmacie(String numeFarmacie) {
        this.numeFarmacie = numeFarmacie;
    }

    public void vindeMedicamente(IMedicamentFarmacie medicamentFarmacie){
        System.out.println("Bun venit la Dr Max");
        medicamentFarmacie.cumparaMedicament();
    }
}
