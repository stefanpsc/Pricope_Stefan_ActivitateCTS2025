package ro.cts.clase;

public class SupaDeVita extends Supa{
    public SupaDeVita(float pret, float cantitate, float calorii) {
        super(pret, cantitate, calorii);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(super.toString());
    }
}
