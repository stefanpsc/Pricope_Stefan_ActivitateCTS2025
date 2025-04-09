package ro.cts.AdapterObiecte.clase;

public class AdaptorObiecteMedicament extends MedicamentFarmacie {

    MedicamentSpital medicamentSpital;

    public AdaptorObiecteMedicament(MedicamentSpital medicamentSpital) {
        super(medicamentSpital.getNumeMedicament(), "69.69.6969", medicamentSpital.getPret(), true);
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
