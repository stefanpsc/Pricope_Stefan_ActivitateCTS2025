package ro.cts.clase;

public class SupDeLegume extends FelDeMancare {

    private int cantitate;

    public SupDeLegume(float pret, float calorii, int cantitate) {
        super(pret, calorii);
        this.cantitate=cantitate;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString()+ "SupDeLegume{");
        sb.append("cantitate=").append(cantitate);
        sb.append('}');
        return sb.toString();
    }
}
