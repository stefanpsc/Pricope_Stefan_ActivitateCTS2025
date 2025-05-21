package ro.cts.clase;

public class Calator {
    private String numeCalator;

    IMetodaPlata metodaPlata;

    public Calator(String numeCalator) {
        this.numeCalator = numeCalator;
        metodaPlata = new CardBancar(100);
    }

    public Calator(String numeCalator, IMetodaPlata metodaPlata) {
        this.numeCalator = numeCalator;
        this.metodaPlata = metodaPlata;
    }

    public void setMetodaPlata(IMetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void platesteBilet(float pretBilet){
        metodaPlata.realizeazaPlata(pretBilet);
    }
}
