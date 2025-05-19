package ro.cts.Clase;

public abstract class PrinterFelicitare implements Nota{
    Nota notaDePlata;

    public PrinterFelicitare(Nota notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void printare() {
        notaDePlata.printare();
        printareFelicitare();
    }
    protected abstract void printareFelicitare();
}
