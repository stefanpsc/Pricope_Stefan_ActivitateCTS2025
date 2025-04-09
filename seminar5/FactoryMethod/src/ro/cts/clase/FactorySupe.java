package ro.cts.clase;

public class FactorySupe implements AbstractFactory {

    private int cantitate;

    public FactorySupe(int cantitate) {
        this.cantitate = cantitate;
    }



    @Override
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tipFelDeMancare, float pret, int calorii) {
        switch (tipFelDeMancare){
            case Supe.supaDeCiuperci -> {
                return new SupaDeCiuperci(pret, calorii, cantitate);
            }
            case Supe.supaDeLegume -> {
                return new SupDeLegume(pret, calorii,cantitate);
            }
            case null, default -> {
                return null;
            }
        }
    }
}
