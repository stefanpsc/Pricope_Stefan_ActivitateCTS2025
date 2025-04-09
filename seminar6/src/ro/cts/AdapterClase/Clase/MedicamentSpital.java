package ro.cts.AdapterClase.Clase;

public class MedicamentSpital {
    private String numeMedicament;
    private float pret;

    public MedicamentSpital(float pret, String numeMedicament) {
        this.pret = pret;
        this.numeMedicament = numeMedicament;
    }

    public void achizitioneazaMedicament(){
        prezintaReteta();
        System.out.println("Medicamentul " +this.numeMedicament + "este achizitionat la pretul " + this.pret);
    }

    public void prezintaReteta(){
        System.out.println("Este prezentata reteta pentru medicamentul " +this.numeMedicament);
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public float getPret() {
        return pret;
    }
}
