package ro.cts.clase;

public class AutoritateReglementareMasiniLazy {

    private String nume;
    private String website;
    private int nrReglementari;
    private static AutoritateReglementareMasiniLazy instance=null;

    private AutoritateReglementareMasiniLazy(String nume, int nrReglementari, String website) {
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

    public static  synchronized AutoritateReglementareMasiniLazy getInstance(String nume, String website){
        if(instance ==null){
            instance = new AutoritateReglementareMasiniLazy(nume, 0,website);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "AutoritateReglementareMasiniLazy{" +
                "nume='" + nume + '\'' +
                ", website='" + website + '\'' +
                ", nrReglementari=" + nrReglementari +
                '}';
    }
}

