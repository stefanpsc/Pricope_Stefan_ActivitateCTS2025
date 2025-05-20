package ro.cts.clase;

public class Masa {
    private boolean esteMasaLibera;
    private int nrMasa;
    private int nrPersoane;

    public Masa(boolean esteMasaLibera, int nrMasa, int nrPersoane) {
        this.esteMasaLibera = esteMasaLibera;
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masa{");
        sb.append("esteMasaLibera=").append(esteMasaLibera);
        sb.append(", nrMasa=").append(nrMasa);
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append('}');
        return sb.toString();
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
