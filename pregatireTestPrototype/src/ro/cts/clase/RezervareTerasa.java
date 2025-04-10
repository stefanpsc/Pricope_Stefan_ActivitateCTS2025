package ro.cts.clase;

public class RezervareTerasa extends AbstractRezervare{
    boolean esteFumator;

    public RezervareTerasa(){
        super();
    }


    public RezervareTerasa(int nrParticipanti, int ora, String numeClient, int ziuaLunii, boolean esteFumator) {
        super(nrParticipanti, ora, numeClient, ziuaLunii);
        this.esteFumator = esteFumator;
    }

    @Override
    public AbstractRezervare copiaza(int ziua) {
        RezervareTerasa rezervareTerasa = new RezervareTerasa();
        rezervareTerasa.ziuaLunii = ziua;
        rezervareTerasa.nrParticipanti = this.nrParticipanti;
        rezervareTerasa.numeClient = this.numeClient;
        rezervareTerasa.ora = this.ora;
        rezervareTerasa.esteFumator = this.esteFumator;
        return rezervareTerasa;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RezervareTerasa{");
        sb.append("esteFumator=").append(esteFumator);
        sb.append(", nrParticipanti=").append(nrParticipanti);
        sb.append(", ora=").append(ora);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", ziuaLunii=").append(ziuaLunii);
        sb.append('}');
        return sb.toString();
    }
}
