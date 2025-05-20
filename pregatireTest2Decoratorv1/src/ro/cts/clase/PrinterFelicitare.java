package ro.cts.clase;

public abstract class PrinterFelicitare implements Nota{
    Nota notadePlata;

    public PrinterFelicitare(Nota notadePlata) {
        this.notadePlata = notadePlata;
    }

    public void printeaza(){
        notadePlata.printeaza();
        printareFelicitare();
    }

    protected abstract void printareFelicitare();
}
