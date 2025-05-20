package MaiFacOdata.clase;

public class Masa {
    boolean esteLibera;
    int nrMasa;
    int nrPersoane;

    public Masa(boolean esteLibera, int nrMasa, int nrPersoane) {
        this.esteLibera = esteLibera;
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masa{");
        sb.append("esteLibera=").append(esteLibera);
        sb.append(", nrMasa=").append(nrMasa);
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append('}');
        return sb.toString();
    }

    public boolean isEsteLibera() {
        return esteLibera;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }
}
