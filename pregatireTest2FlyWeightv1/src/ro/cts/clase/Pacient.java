package ro.cts.clase;

public class Pacient implements PacientAbstract{
    private String numePacient;
    private String adresa;
    private String nrTelefon;

    public Pacient(String numePacient, String adresa, String nrTelefon) {
        this.numePacient = numePacient;
        this.adresa = adresa;
        this.nrTelefon = nrTelefon;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("numePacient='").append(numePacient).append('\'');
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaDescriere(Spitalizare spitalizare) {
        System.out.println(this.toString() + spitalizare.toString());
    }
}
