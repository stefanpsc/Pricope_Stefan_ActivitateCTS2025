package ro.cts.clase;

import ro.cts.main.Main;

public class Autobuz extends MijlocDeTransport {
    public Autobuz(int nrLinie) {
        super(nrLinie);
    }

    @Override
    public void pleacaDeLaCapat() {
        trimiteMesaj("Autobuzul de la linia " + this.getNrLinie()+" pleaca de la capat");
    }

    public void schimbaTraseu(){
        trimiteMesaj("Autobuzul cu numarul " + this.getNrLinie() + " va circula astazi prin Bd. Balcescu si nu va mai opri la statia Piata Romana.");
    }
}
