package ro.cts.clase;


public class FactorySupe implements AbstractFactory{

    private int calorii;

    public FactorySupe(int calorii) {
        this.calorii = calorii;
    }

    @Override
    public FelDeMancare creareFelDeMancare(ITipFelDeMancare tipFelDeMancare, float cantitate, float pret) {
        switch (tipFelDeMancare){
            case Supe.Vita -> {
                SupaDeVita supaDeVita = new SupaDeVita(pret, cantitate,calorii);
                return supaDeVita;
            }
            case Supe.Cocos -> {
                SupaDeCocos supaDeCocos = new SupaDeCocos(pret, cantitate, calorii);
                return supaDeCocos;
            }
            case Supe.Legume -> {
                SupaDeLegume supaDeLegume = new SupaDeLegume(pret, cantitate, calorii);
                return supaDeLegume;
            }
            case null, default -> {
                return null;
            }
        }
    }
}
