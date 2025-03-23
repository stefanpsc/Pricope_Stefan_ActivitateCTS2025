package ro.cts.model.personal;

public class Profesor extends Persoana implements iPredabil {
    private String id;
    private float salariu;
    private float sporVechime;

    public Profesor(String nume, int varsta, String idAngajat, float salariu, float sporVechime) {
        super(nume, varsta);
        this.id = id;
        this.salariu = salariu;
        this.sporVechime = sporVechime;
    }



    @Override
    public float calculareVenit() {
        return salariu +(salariu * sporVechime);
    }

    @Override
    public void preda() {
        StringBuilder builder = new StringBuilder();
        builder.append("Profesorul ").append(this.nume).append(" preda la curs");
        System.out.println(builder.toString());
    }
}
