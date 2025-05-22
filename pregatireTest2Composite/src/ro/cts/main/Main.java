package ro.cts.main;

import ro.cts.clase.Departament;
import ro.cts.clase.Sectie;
import ro.cts.clase.Structura;

public class Main {
    public static void main(String[] args){
        Structura departament1 = new Departament("1",20);
        Structura departament2 = new Departament("2",10);
        Structura departamentGeneral = new Departament("general",20);

        Structura sectie1 = new Sectie("1");
        Structura sectie2 = new Sectie("2");

        try{
            departamentGeneral.adaugaStructura(departament1);
            departamentGeneral.adaugaStructura(departament2);

            departament1.adaugaStructura(sectie1);
            departament2.adaugaStructura(sectie2);

            departamentGeneral.afiseazaDescriere();

        }catch (RuntimeException e){
            System.out.println(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
