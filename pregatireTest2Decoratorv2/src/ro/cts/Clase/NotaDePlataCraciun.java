package ro.cts.Clase;

public class NotaDePlataCraciun extends PrinterFelicitare {

    public NotaDePlataCraciun(Nota notaDePlata) {
        super(notaDePlata);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("Craciun Fericit");
    }
}
