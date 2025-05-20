package ro.cts.main;

import ro.cts.clase.Nota;
import ro.cts.clase.NotaDePlata;
import ro.cts.clase.NotaDePlataCraciun;

public class Main {
    public static void main(String[] args){
        Nota nota = new NotaDePlata(200);
        nota.printeaza();
        Nota nota1 = new NotaDePlataCraciun(nota);
        nota1.printeaza();
    }
}
