package ro.cts.clase;

public class FactoryDesert implements AbstractFactory{

    private  String crema;

    public FactoryDesert(String crema) {
        this.crema = crema;
    }

    @Override
    public FelDeMancare creareFelDeMancare(ITipFelDeMancare tipFelDeMancare, float cantitate, float pret) {
        switch (tipFelDeMancare){
            case Deserturi.Cheesecake -> {
                CheeseCake cheeseCake = new CheeseCake(pret, cantitate, crema);
                return cheeseCake;
            }
            case Deserturi.Papanasi -> {
                Papanasi papanasi = new Papanasi(pret, cantitate, crema);
                return papanasi;
            }
            case null, default -> {
                return null;
            }
        }
    }
}
