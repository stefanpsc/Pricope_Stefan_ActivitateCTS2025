package FabricaSupe;

import clase.Supa;
import clase.SupaCocos;
import clase.SupaDeLegume;
import clase.SupadeVita;

public class FabricaSupe {

    private float pret;
    private float calorii;

    public FabricaSupe(float pret, float calorii) {
        this.pret = pret;
        this.calorii = calorii;
    }

    public Supa getSupa(TipSupa tipSupa, float cantitate){
        switch (tipSupa){
            case Legume ->{
                SupaDeLegume supaDeLegume = new SupaDeLegume(pret,cantitate,calorii);
                return supaDeLegume;

            }
            case Cocos -> {
                SupaCocos supaCocos = new SupaCocos(pret, cantitate, calorii);
                return supaCocos;
            }
            case Vita -> {
                SupadeVita supadeVita = new SupadeVita(pret, cantitate, calorii);
                return supadeVita;
            }
            case null, default->{
                return null;
            }
        }
    }
}
