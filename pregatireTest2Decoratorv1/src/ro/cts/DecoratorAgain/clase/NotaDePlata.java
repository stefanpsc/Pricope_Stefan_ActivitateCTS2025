package ro.cts.DecoratorAgain.clase;

public class NotaDePlata implements  Nota {
    private float totalNota;

    public NotaDePlata(float totalNota) {
        this.totalNota = totalNota;
    }

    @Override
    public void printeaza() {
        System.out.println("Se printeaza nota cu totalul de " + this.totalNota);
    }
}
