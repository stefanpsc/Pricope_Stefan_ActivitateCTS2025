package clase;

public class SupadeVita extends  Supa{
    public SupadeVita(float pret, float cantitate, float calorii) {
        super(pret, cantitate, calorii);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(super.toString());;
    }

}
