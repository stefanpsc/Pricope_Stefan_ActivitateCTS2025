package ro.cts.AdapterClasev3.Clase;

public class AdapterClaseMedicament extends MedicamentSpital implements IMedicamentFarmacie{


    public AdapterClaseMedicament(String numeMedicament, float pret) {
        super(numeMedicament, pret);
    }


    @Override
    public void cumparaMedicament() {
        super.achizitioneazaMedicament();
    }
}
