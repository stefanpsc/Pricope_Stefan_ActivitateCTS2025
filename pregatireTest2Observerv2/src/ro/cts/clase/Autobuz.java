package ro.cts.clase;

public class Autobuz extends MijlocDeTransport{
    public Autobuz(int nrLinie) {
        super(nrLinie);
    }

    @Override
    public void schimbaLinia() {
        trimiteMesaj("Autobuzul se schimba de la linia " + this.getNrLinie());
    }


    public void pleacaDeLaCapat() {
        trimiteMesaj("Autobuzul " + this.getNrLinie() + " pleaca de la capatul liniei.");
    }
}
