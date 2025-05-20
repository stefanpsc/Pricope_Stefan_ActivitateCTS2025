package ro.cts.AdapterClasev3.Clase;

public class MedicamentFarmacie implements IMedicamentFarmacie {

    private String numeMedicament;
    private String dataExpirare;
    private boolean esteInStoc;
    private float pret;


    public MedicamentFarmacie(String numeMedicament, String dataExpirare, boolean esteInStoc, float pret) {
        this.numeMedicament = numeMedicament;
        this.dataExpirare = dataExpirare;
        this.esteInStoc = esteInStoc;
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MedicamentFarmacie{");
        sb.append("numeMedicament='").append(numeMedicament).append('\'');
        sb.append(", dataExpirare='").append(dataExpirare).append('\'');
        sb.append(", esteInStoc=").append(esteInStoc);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void cumparaMedicament() {
        System.out.println("Medicamentul " + this.numeMedicament+ " care expira la: " + this.dataExpirare +" are pretul de " + this.pret);
    }
}
