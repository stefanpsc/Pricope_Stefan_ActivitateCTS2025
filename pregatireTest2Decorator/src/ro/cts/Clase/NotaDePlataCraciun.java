package ro.cts.Clase;

public class NotaDePlataCraciun extends PrinterFelicitare{
    public NotaDePlataCraciun(Nota notadePlata) {
        super(notadePlata);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("Craciun Fericit");
    }
}
