package ro.cts.main;

import ro.cts.registry.Autoritate;
import ro.cts.registry.Reglementare;

public class MainRegistry {
    public static void main(String[] args){
        Autoritate autoritate = Autoritate.getInstance("Autoritate", "www.autoritate.ro");
        Reglementare reglementare1= autoritate.reglmenteazaModel("Dacia Logan");
        Reglementare reglementare2 = autoritate.reglmenteazaModel("Tesla");
        System.out.println(reglementare1);
        System.out.println(reglementare2);
        Reglementare reglementare3 = autoritate.reglmenteazaModel("Dacia Logan");
        System.out.println(reglementare3);
    }
}

