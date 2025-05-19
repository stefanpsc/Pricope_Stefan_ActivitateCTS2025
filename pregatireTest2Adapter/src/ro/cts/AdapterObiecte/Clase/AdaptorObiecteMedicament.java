package ro.cts.AdapterObiecte.Clase;


public class AdaptorObiecteMedicament extends MedicamentFarmacie {
    MedicamentSpital medicamentSpital;


    public AdaptorObiecteMedicament(MedicamentSpital medicamentSpital) {
        super(medicamentSpital.getNumeMedicament(), "10.05.2020",true,medicamentSpital.getPret());
        this.medicamentSpital = medicamentSpital;
    }

    public void cumparaMedicament(){
        medicamentSpital.achizitioneazaMedicament();
    }
}
