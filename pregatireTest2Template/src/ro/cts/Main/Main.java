package ro.cts.Main;

import ro.cts.Clase.Pacient;
import ro.cts.Clase.Spital;
import ro.cts.Clase.SpitalPrivat;
import ro.cts.Clase.TemplateInternare;

public class Main {
    public static void main(String[] args){
        Pacient pacient = new Pacient("MIHAI", 6);
        TemplateInternare spital = new Spital();
        spital.internare(pacient);
        TemplateInternare spitalPrivat = new SpitalPrivat("Obregia");
        spitalPrivat.internare(pacient);
    }
}
