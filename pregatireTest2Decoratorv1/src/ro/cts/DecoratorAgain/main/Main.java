package ro.cts.DecoratorAgain.main;

import ro.cts.DecoratorAgain.clase.Nota;
import ro.cts.DecoratorAgain.clase.NotaDePlata;
import ro.cts.DecoratorAgain.clase.NotaDePlataRevelion;

public class Main {
    public static void main(String[] args){
        Nota nota = new NotaDePlata(100);
        nota.printeaza();
        Nota nota1 = new NotaDePlataRevelion(nota);
        nota1.printeaza();
    }
}
