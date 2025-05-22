package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocDeTransport  implements Subiect{
    int nrLinie;
    private List<Observer> calatori;

    public MijlocDeTransport(int nrLinie) {
        this.nrLinie = nrLinie;
        this.calatori = new ArrayList<Observer>();
    }

    public int getNrLinie() {
        return nrLinie;
    }


    @Override
    public void adaugaObserver(Observer observer) {
        this.calatori.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        this.calatori.remove(observer);
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for(Observer observer:calatori){
            observer.primesteMesaj(mesaj);
        }
    }

    public abstract void schimbaLinia();

}
