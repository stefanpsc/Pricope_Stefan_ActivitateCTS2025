package ro.cts.AdapterClasev2.Clase;

public class Farmacie {

    private String numeFarmacie;

    public Farmacie(String numeFarmacie) {
        this.numeFarmacie = numeFarmacie;
    }

    public void vindeMedicament(IMedicamentFarmacie medicamentFarmacie){
        System.out.println("Bun venit in farmacie");
        medicamentFarmacie.cumparaMedicament();
    }
}
