package ro.cts.clase;

public class AutoritateReglementareMasiniEager {

    private String nume;
    private String website;
    private int nrReglementari;
    private static AutoritateReglementareMasiniEager instance=new AutoritateReglementareMasiniEager("AutoritateAuto", 200,"www.autoritate.ro");

    private AutoritateReglementareMasiniEager(String nume, int nrReglementari, String website) {
        this.nume = nume;
        this.nrReglementari = nrReglementari;
        this.website = website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getWebsite() {
        return website;
    }

    public void reglementeazModel(String nume){
        nrReglementari++;
    }

    public static AutoritateReglementareMasiniEager getInstance(){
        return instance;
    }

    @Override
    public String toString() {
        return "AutoritateReglementareMasiniEager{" +
                "nume='" + nume + '\'' +
                ", website='" + website + '\'' +
                ", nrReglementari=" + nrReglementari +
                '}';
    }
}
