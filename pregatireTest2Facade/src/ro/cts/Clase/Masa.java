package ro.cts.Clase;

public class Masa {
    private boolean esteMasaLibera;
    private int nrMasa;
    private int nrPersoane;

    public Masa(boolean esteMasaLibera, int nrMasa, int nrPersoane) {
        this.esteMasaLibera = esteMasaLibera;
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
    }

    public boolean isEsteMasaLibera() {
        return esteMasaLibera;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }
}
