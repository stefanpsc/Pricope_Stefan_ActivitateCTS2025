package ro.cts.DecoratorAgain.clase;

public class NotaDePlataCraciun extends PrinterFelicitare{
    public NotaDePlataCraciun(Nota notadePlata) {
        super(notadePlata);
    }

    @Override
    protected void printeazaFelicitare() {
        System.out.println("HAILAMULTIANIMA");
    }
}
