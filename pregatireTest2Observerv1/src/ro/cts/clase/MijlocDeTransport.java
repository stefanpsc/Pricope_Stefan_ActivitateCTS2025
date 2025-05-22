package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocDeTransport  implements Subiect{
    private int nrLinie;
    private List<Observer> calatori;

    public int getNrLinie() {
        return nrLinie;
    }

    public MijlocDeTransport(int nrLinie) {
        this.nrLinie = nrLinie;
        this.calatori = new ArrayList<Observer>();
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
    public abstract void pleacaDeLaCapat();
}
