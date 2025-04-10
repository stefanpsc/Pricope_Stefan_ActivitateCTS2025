package ro.cts.program;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args){
        FactorySupe factorySupe = new FactorySupe(300);
        FactoryDesert factoryDesert = new FactoryDesert("ciocolata");
        FelDeMancare supaDeCocos = factorySupe.creareFelDeMancare(Supe.Cocos, 300, 24);
        FelDeMancare supaDeVita = factorySupe.creareFelDeMancare(Supe.Vita,400, 29);
        FelDeMancare supadeLegume = factorySupe.creareFelDeMancare(Supe.Legume,123,41);
        FelDeMancare cheesecake = factoryDesert.creareFelDeMancare(Deserturi.Cheesecake,111,40);
        FelDeMancare papanasi = factoryDesert.creareFelDeMancare(Deserturi.Papanasi,400,90);

        System.out.println(supadeLegume);
        System.out.println(papanasi);
        System.out.println(supaDeVita);
        System.out.println(cheesecake);
    }
}
