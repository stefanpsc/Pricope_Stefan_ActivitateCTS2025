package ro.cts.model.platforma;

import ro.cts.model.personal.Persoana;
import ro.cts.model.personal.Student;
import ro.cts.model.personal.iPredabil;

import java.util.List;

public class Curs {
    private String numeCurs;
    private int credite;
    private iPredabil profesor;
    private List<Student> studenti;

    public Curs(int credite, String numeCurs, iPredabil profesor, List<Student> studenti) {
        this.credite = credite;
        this.numeCurs = numeCurs;
        this.profesor = profesor;
        this.studenti = studenti;
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    public void setNumeCurs(String numeCurs) {
        this.numeCurs = numeCurs;
    }

    public int getCredite() {
        return credite;
    }

    public void setCredite(int credite) {
        this.credite = credite;
    }

    public iPredabil getProfesor() {
        return profesor;
    }

    public void setProfesor(iPredabil profesor) {
        this.profesor = profesor;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }

    public void sustineExamen(String data){
        StringBuilder builder = new StringBuilder();
        builder.append("Profesorul ").append(((Persoana)this.profesor).getNume()).append(" are examen la materia ").append(this.numeCurs)
                .append("urmatorii studenti: ");
        System.out.println(builder.toString());
        for (Student student: studenti){
            System.out.println(student.getNume());
        }
        System.out.println("La data de: " +data);
    }
}
