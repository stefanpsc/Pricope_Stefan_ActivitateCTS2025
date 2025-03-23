package ro.cts.model.personal;

public class Student extends Persoana {
    private String idStudent;
    private float bursa;

    public Student(String nume, int varsta, String idStudent, float bursa) {
        super(nume, varsta);
        this.idStudent = idStudent;
        this.bursa = bursa;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public float getBursa() {
        return bursa;
    }

    public void setBursa(float bursa) {
        this.bursa = bursa;
    }

    @Override
    public float calculareVenit() {
        return this.bursa;
    }
}
