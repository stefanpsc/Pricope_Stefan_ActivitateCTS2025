package ro.cts.clase;

public class NotaDePlataCraciun extends PrinterFelicitare{
    public NotaDePlataCraciun(Nota notadePlata) {
        super(notadePlata);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("La multi ani de Craciun!");
    }
}
