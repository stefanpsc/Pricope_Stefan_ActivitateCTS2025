package ro.cts.clase;

public class RezervareInterior extends AbstractRezervare{

    private boolean estelaParter;


    public RezervareInterior(int nrParticipanti, int ora, String numeClient, int ziuaLunii, boolean estelaParter) {
        super(nrParticipanti, ora, numeClient, ziuaLunii);
        this.estelaParter = estelaParter;
    }
    public RezervareInterior(){
        super();
    }
    @Override
    public AbstractRezervare copiaza(int ziua) {
        RezervareInterior rezervare = new RezervareInterior();
        rezervare.ziuaLunii =ziua;
        rezervare.nrParticipanti = this.nrParticipanti;
        rezervare.ora =this.ora;
        rezervare.numeClient = this.numeClient;
        rezervare.estelaParter = this.estelaParter;
        return  rezervare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RezervareInterior{");
        sb.append("estelaParter=").append(estelaParter);
        sb.append(", nrParticipanti=").append(nrParticipanti);
        sb.append(", ora=").append(ora);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", ziuaLunii=").append(ziuaLunii);
        sb.append('}');
        return sb.toString();
    }
}
