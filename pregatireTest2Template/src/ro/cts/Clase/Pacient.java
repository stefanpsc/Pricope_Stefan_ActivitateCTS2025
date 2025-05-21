package ro.cts.Clase;

public class Pacient {
    private String nume;
    private int gradDificultate;

    public Pacient(String nume, int gradDificultate) {
        this.nume = nume;
        this.gradDificultate = gradDificultate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", gradDificultate=").append(gradDificultate);
        sb.append('}');
        return sb.toString();
    }

    public String getNume() {
        return nume;
    }

    public int getGradDificultate() {
        return gradDificultate;
    }
}
