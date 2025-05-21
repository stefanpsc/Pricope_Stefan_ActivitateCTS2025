package ro.cts.clase;

public class PlataSMS implements IMetodaPlata{

    public PlataSMS() {
    }

    @Override
    public void realizeazaPlata(float pretBilet) {
        System.out.println("S a platit prin SMS");
    }
}
