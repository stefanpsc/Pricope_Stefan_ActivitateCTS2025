package ro.cts.AdapterClasev3.Clase;

public class Farmacie {
    private String numeFarmacie;

    public Farmacie(String numeFarmacie) {
        this.numeFarmacie = numeFarmacie;
    }

    public void vindeMedicament(IMedicamentFarmacie medicamentFarmacie){
        System.out.println("Bun venit la farmacie");
        medicamentFarmacie.cumparaMedicament();
    }
}
