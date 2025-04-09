package clase;

public class AutoritateReglementareMasiniEager {
    private String nume;
    private String website;
    private int nrReglementari;

    private static AutoritateReglementareMasiniEager instance = new AutoritateReglementareMasiniEager("Autoritate", "www.autoritate.ro", 2);

    public void setWebsite(String website) {
        this.website = website;
    }

    private AutoritateReglementareMasiniEager(String nume, String website, int nrReglementari) {
        this.nume = nume;
        this.website = website;
        this.nrReglementari = nrReglementari;
    }

    public static AutoritateReglementareMasiniEager getInstance(){
        return instance;
    }

    public void reglementeazaModel(String nume){
        nrReglementari++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutoritateReglementareMasiniEager{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", website='").append(website).append('\'');
        sb.append(", nrReglementari=").append(nrReglementari);
        sb.append('}');
        return sb.toString();
    }
}
