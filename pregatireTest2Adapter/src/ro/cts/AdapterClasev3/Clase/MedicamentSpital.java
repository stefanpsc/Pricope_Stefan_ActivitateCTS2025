package ro.cts.AdapterClasev3.Clase;

public class MedicamentSpital {

    private String numeMedicament;

    private float pret;

    public MedicamentSpital(String numeMedicament, float pret) {
        this.numeMedicament = numeMedicament;
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MedicamentSpital{");
        sb.append("numeMedicament='").append(numeMedicament).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }

    public void achizitioneazaMedicament(){
        prezintaReteta();
        System.out.println("Se achizitioneaza medicamentul " + this.numeMedicament+ " cu pretul " + this.pret);
    }
    public void prezintaReteta(){
        System.out.println("Se prezinta Reteta pentru medicamentul  " + this.numeMedicament);
    }
}
