package ro.cts.Clase;

public abstract class PrinterFelicitare implements Nota{


    Nota notadePlata;

    public PrinterFelicitare(Nota notadePlata) {
        this.notadePlata = notadePlata;
    }

    @Override
    public void printare() {
        notadePlata.printare();
        printareFelicitare();
    }

    protected abstract void printareFelicitare();
}
