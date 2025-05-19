package ro.cts.AdapterClase.Clase;

public class AdaptorClaseMedicament  extends MedicamentSpital implements IMedicamentFarmacie{


    public AdaptorClaseMedicament(float pret, String numeMedicament) {
        super(pret, numeMedicament);
    }

    @Override
    public void cumparaMedicament() {
        super.achizitioneazaMedicament();
    }
}
