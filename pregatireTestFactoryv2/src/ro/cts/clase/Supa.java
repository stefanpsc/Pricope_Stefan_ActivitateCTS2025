package ro.cts.clase;

public abstract class Supa {
    private float pret;
    private float cantitate;
    private float calorii;

    public Supa(float pret, float cantitate, float calorii) {
        this.pret = pret;
        this.cantitate = cantitate;
        this.calorii = calorii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Supa{");
        sb.append("pret=").append(pret);
        sb.append(", cantitate=").append(cantitate);
        sb.append(", calorii=").append(calorii);
        sb.append('}');
        return sb.toString();
    }

    public abstract void afiseazaDescriere();
}
