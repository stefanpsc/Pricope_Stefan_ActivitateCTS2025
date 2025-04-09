package program;

import FabricaSupe.FabricaSupe;
import clase.Supa;

import static FabricaSupe.TipSupa.*;

public class Main {
    public static void main(String[] args){
        FabricaSupe fabricaSupe = new FabricaSupe(15,99);
        Supa supaLegume = fabricaSupe.getSupa(Legume,400 );
        Supa supaVita = fabricaSupe.getSupa(Vita,450);
        Supa supaCocos = fabricaSupe.getSupa(Cocos, 500);

        supaCocos.afiseazaDescriere();
        supaLegume.afiseazaDescriere();
        supaVita.afiseazaDescriere();

    }
}
