package ro.cts.clase;

public class NotaDePlataRevelion extends PrinterFelicitare{
    public NotaDePlataRevelion(Nota notadePlata) {
        super(notadePlata);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("SA TRAITIII");
    }
}
