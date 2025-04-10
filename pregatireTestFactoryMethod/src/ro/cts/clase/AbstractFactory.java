package ro.cts.clase;

public interface AbstractFactory {

    public FelDeMancare creareFelDeMancare(ITipFelDeMancare tipFelDeMancare, float cantitate, float pret);
}
