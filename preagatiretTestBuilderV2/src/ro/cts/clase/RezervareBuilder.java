package ro.cts.clase;

public class RezervareBuilder implements AbstractBuilder{

    Rezervare rezervare;

    public RezervareBuilder(String nume){
        rezervare = new Rezervare(nume, false,false,false,false,"faraMuzica");

    }

    public RezervareBuilder setHasScauneErg(boolean val){
        rezervare.setHasScauneErg(val);
        return this;
    }

    public RezervareBuilder setHasAsezareMasa(boolean val){
        rezervare.setHasAsezareGeam(val);
        return this;
    }

    @Override
    public Rezervare build() {
        return rezervare;
    }
}
