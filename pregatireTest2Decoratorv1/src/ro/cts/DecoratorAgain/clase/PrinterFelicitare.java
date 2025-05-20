package ro.cts.DecoratorAgain.clase;

public abstract class PrinterFelicitare implements Nota{
    Nota notadePlata;

    public PrinterFelicitare(Nota notadePlata) {
        this.notadePlata = notadePlata;
    }

    @Override
    public void printeaza() {
        notadePlata.printeaza();
        printeazaFelicitare();
    }

    protected abstract void printeazaFelicitare();
}
