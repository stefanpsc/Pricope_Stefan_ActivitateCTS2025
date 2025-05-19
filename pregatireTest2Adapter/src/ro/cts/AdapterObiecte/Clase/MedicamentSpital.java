package ro.cts.AdapterObiecte.Clase;

public class MedicamentSpital {
    private String numeMedicament;
    private float pret;

    public MedicamentSpital(String numeMedicament, float pret) {
        this.numeMedicament = numeMedicament;
        this.pret = pret;
    }


    public void achizitioneazaMedicament(){
        prezintaReteta();
        System.out.println("Se achizioneaza medicamentul" + this.numeMedicament + " cu pretul " +this.pret);
    }
    public void prezintaReteta(){
        System.out.println("Se prezinta reteta pentru Medicamentul " + this.numeMedicament);
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public float getPret() {
        return pret;
    }
}
