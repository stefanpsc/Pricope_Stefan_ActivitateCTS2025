package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocTransport implements Subiect {
    private int numarLinie;
    private List<Observer> calatori;

    public MijlocTransport(int numarLinie) {
        this.numarLinie = numarLinie;
        this.calatori = new ArrayList<Observer>();
    }

    public int getNumarLinie() {
        return numarLinie;
    }

    public List<Observer> getCalatori() {
        return calatori;
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
        for(Observer observer: calatori){
            observer.primesteMesaj(mesaj);
        }
    }

    public abstract void pleacaDeLaCapat();
}
