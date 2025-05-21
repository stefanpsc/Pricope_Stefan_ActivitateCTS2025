package ro.cts.TemplateRestaurant.Clase;

public class Masa {
    private int nrLocuri;
    private int nrMasa;

    private boolean esteCuratata;

    public Masa(int nrLocuri, int nrMasa, boolean esteCuratata) {
        this.nrLocuri = nrLocuri;
        this.nrMasa = nrMasa;
        this.esteCuratata = esteCuratata;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masa{");
        sb.append("nrLocuri=").append(nrLocuri);
        sb.append(", nrMasa=").append(nrMasa);
        sb.append(", esteCuratata=").append(esteCuratata);
        sb.append('}');
        return sb.toString();
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public boolean isEsteCuratata() {
        return esteCuratata;
    }
}
