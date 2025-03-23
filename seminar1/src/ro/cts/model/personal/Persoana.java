package ro.cts.model.personal;

public abstract class Persoana implements iPersoana {
    protected String nume;

    protected int varsta;


    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public int getVarsta() {
        return this.varsta;
    }

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public abstract float calculareVenit();
}
