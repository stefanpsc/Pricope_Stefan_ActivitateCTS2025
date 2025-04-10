package ro.cts.clase;

public class CheeseCake extends FelDeMancare{

    private String crema;

    public CheeseCake(float pret, float cantitate, String crema) {
        super(pret, cantitate);
        this.crema = crema;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString()+"CheeseCake{");
        sb.append("crema='").append(crema).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
