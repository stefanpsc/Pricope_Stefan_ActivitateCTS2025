package ro.cts.FabricaSupe;

import ro.cts.clase.Supa;
import ro.cts.clase.SupaDeCocos;
import ro.cts.clase.SupaDeLegume;
import ro.cts.clase.SupaDeVita;

public class FabricaSupe {

    private float pret;

    private float calorii;

    public FabricaSupe(float pret, float calorii) {
        this.pret = pret;
        this.calorii = calorii;
    }

    public Supa getSupa(TipSupa tip, float cantitate){
        switch (tip){
            case Legume -> {
                SupaDeLegume supaDeLegume = new SupaDeLegume(pret,cantitate,calorii);
                return supaDeLegume;
            }
            case Vita -> {
                SupaDeVita supaDeVita = new SupaDeVita(pret,cantitate,calorii);
                return supaDeVita;
            }
            case Cocos -> {
                SupaDeCocos supaDeCocos = new SupaDeCocos(pret, cantitate, calorii);
                return supaDeCocos;
            }
            case null, default -> {
                return null;
            }
        }
    }

}
