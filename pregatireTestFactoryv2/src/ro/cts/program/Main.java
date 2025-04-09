package ro.cts.program;

import ro.cts.FabricaSupe.FabricaSupe;
import ro.cts.clase.Supa;
import ro.cts.clase.SupaDeCocos;
import ro.cts.clase.SupaDeLegume;

import ro.cts.clase.SupaDeVita;

import static ro.cts.FabricaSupe.TipSupa.*;

public class Main {
    public static void main(String[] args){
        FabricaSupe fabricaSupe = new FabricaSupe(200,300);
        Supa supaDeLegume = fabricaSupe.getSupa(Legume, 500);
        Supa supaDeCocos = fabricaSupe.getSupa(Cocos, 450);
        Supa supaDeVita = fabricaSupe.getSupa(Vita, 550);

        supaDeLegume.afiseazaDescriere();
        supaDeCocos.afiseazaDescriere();
        supaDeVita.afiseazaDescriere();

    }
}
