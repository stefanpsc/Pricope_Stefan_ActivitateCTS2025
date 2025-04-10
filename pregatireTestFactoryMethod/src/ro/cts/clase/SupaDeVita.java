package ro.cts.clase;

public class SupaDeVita extends FelDeMancare{
    float calorii;

    public SupaDeVita(float pret, float cantitate, float calorii) {
        super(pret, cantitate);
        this.calorii = calorii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString()+"SupaDeVita{");
        sb.append("calorii=").append(calorii);
        sb.append('}');
        return sb.toString();
    }
}
