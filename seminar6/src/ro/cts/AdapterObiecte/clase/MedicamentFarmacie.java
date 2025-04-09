package ro.cts.AdapterObiecte.clase;

public class MedicamentFarmacie {
    private String numeMedicament;
    private String dataExpirare;
    private boolean esteInStoc;
    private float pret;

    public MedicamentFarmacie(String numeMedicament, String dataExpirare, float pret, boolean esteInStoc) {
        this.numeMedicament = numeMedicament;
        this.dataExpirare = dataExpirare;
        this.pret = pret;
        this.esteInStoc = esteInStoc;
    }

    public void cumparaMedicament(){
        System.out.println("Medicamentul " + this.numeMedicament+ " care expira la: " + this.dataExpirare +" are pretul de " + this.pret);

    }

}
