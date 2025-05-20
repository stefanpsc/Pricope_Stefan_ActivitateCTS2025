package ro.cts.DecoratorAgain.clase;

public class NotaDePlataRevelion extends PrinterFelicitare{
    public NotaDePlataRevelion(Nota notadePlata) {
        super(notadePlata);
    }

    @Override
    protected void printeazaFelicitare() {
        System.out.println("revelionMA");
    }
}
