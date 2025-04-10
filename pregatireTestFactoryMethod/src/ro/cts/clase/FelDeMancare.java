package ro.cts.clase;

public class FelDeMancare {

    private float pret;
    private float cantitate;

    public FelDeMancare(float pret, float cantitate) {
        this.pret = pret;
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FelDeMancare{");
        sb.append("pret=").append(pret);
        sb.append(", cantitate=").append(cantitate);
        sb.append('}');
        return sb.toString();
    }
}
