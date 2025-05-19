package ro.cts.Main;

import ro.cts.Clase.Nota;
import ro.cts.Clase.NotaDePlata;
import ro.cts.Clase.NotaDePlataCraciun;
import ro.cts.Clase.NotaDePlataRevelion;

public class Main {
    public static void main(String[] args){
        Nota nota = new NotaDePlata(700);
        nota.printare();

        Nota nota1 = new NotaDePlataRevelion(nota);
        nota1.printare();

        Nota nota2 = new NotaDePlataCraciun(nota);
        nota2.printare();

        Nota nota3 = new NotaDePlataCraciun(nota1);
        nota3.printare();

    }
}
