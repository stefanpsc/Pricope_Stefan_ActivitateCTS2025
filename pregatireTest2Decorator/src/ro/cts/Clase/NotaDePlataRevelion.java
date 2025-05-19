package ro.cts.Clase;

public class NotaDePlataRevelion extends PrinterFelicitare{


    public NotaDePlataRevelion(Nota notadePlata) {
        super(notadePlata);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("La multi Ani!!");
    }
}
