package ro.cts.clase;

public class SupaDeLegume extends FelDeMancare{

    float calorii;

    public SupaDeLegume(float pret, float cantitate, float calorii) {
        super(pret, cantitate);
        this.calorii = calorii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString()+ "SupaDeLegume{");
        sb.append("calorii=").append(calorii);
        sb.append('}');
        return sb.toString();
    }
}
