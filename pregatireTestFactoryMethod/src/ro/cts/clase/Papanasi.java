package ro.cts.clase;

public class Papanasi extends FelDeMancare{

    private String crema;

    public Papanasi(float pret, float cantitate, String crema) {
        super(pret, cantitate);
        this.crema = crema;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString()+"Papanasi{");
        sb.append("crema='").append(crema).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
