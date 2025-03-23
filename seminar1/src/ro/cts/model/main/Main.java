package ro.cts.model.main;

import ro.cts.model.personal.*;
import ro.cts.model.platforma.Curs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mihai", 20, "1", 900));
        students.add(new Student("Ana", 21, "2", 1000));

        Curs curs = new Curs(4, "CTS", new Profesor("Adrian", 35, "22",4500,0.35f),students);
        curs.sustineExamen("12/02/2025");

        curs.getProfesor().preda();

        System.out.println("venitul profesorului: " + ((Persoana)curs.getProfesor()).calculareVenit());

        curs.setProfesor(new Asistent("Marinica",20,23, 5000));
        curs.sustineExamen("10/05/2021");

        Lector lector = new Lector("Gigel", 40);
        lector.preda();
        curs.setProfesor(lector);
        curs.sustineExamen("12/10/2025");
    }
}