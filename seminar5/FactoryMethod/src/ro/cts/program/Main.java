package ro.cts.program;

import ro.cts.clase.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FactorySupe factorySupe = new FactorySupe(500);
        FactoryDesert factoryDesert = new FactoryDesert("vanilie");
        FelDeMancare supaDeLegume = factorySupe.creareFelDeMancare(Supe.supaDeLegume, 20.5f, 450);
        FelDeMancare supaDeCiurpeci = factorySupe.creareFelDeMancare(Supe.supaDeCiuperci, 30.5f,500);
        FelDeMancare tiramisu = factoryDesert.creareFelDeMancare(Deserturi.Tiramisu,4.5f, 289);
        System.out.println(supaDeCiurpeci);
        System.out.println(supaDeLegume);
        System.out.println(tiramisu);
    }
}