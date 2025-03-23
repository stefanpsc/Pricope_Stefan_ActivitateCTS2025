package ro.cts.main;

import ro.cts.FabricaSupe.FabricaSupe;
import ro.cts.FabricaSupe.TipSupa;
import ro.cts.clase.Supa;

import static ro.cts.FabricaSupe.TipSupa.LEGUME;

public class Main {
    public static void main(String[] args) {
        FabricaSupe fabricaSupe = new FabricaSupe(15.99f, 50.99f);
        Supa supaLegume = fabricaSupe.getSupa(LEGUME, 300);
        Supa supaVita = fabricaSupe.getSupa(TipSupa.VITA, 350);
        Supa supaCocos = fabricaSupe.getSupa(TipSupa.COCOS, 380);

        supaLegume.afiseazaDescriere();
        supaVita.afiseazaDescriere();
        supaCocos.afiseazaDescriere();
    }
}