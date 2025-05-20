package ro.cts.clase;

public class Spitalizare {
    private int nrPat;
    private int nrSalon;
    private int nrZileSpitalizare;

    public Spitalizare(int nrPat, int nrSalon, int nrZileSpitalizare) {
        this.nrPat = nrPat;
        this.nrSalon = nrSalon;
        this.nrZileSpitalizare = nrZileSpitalizare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Spitalizare{");
        sb.append("nrPat=").append(nrPat);
        sb.append(", nrSalon=").append(nrSalon);
        sb.append(", nrZileSpitalizare=").append(nrZileSpitalizare);
        sb.append('}');
        return sb.toString();
    }
}
