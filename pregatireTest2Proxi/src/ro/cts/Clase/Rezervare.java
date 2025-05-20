package ro.cts.Clase;

public class Rezervare implements IRezervare{
    @Override
    public void rezerva(String numeClient, int nrPersoane, int ora) {
        System.out.println("S a facut o rezervare pentru clientul " + numeClient + ", numar de persoane: " + nrPersoane+ " la ora " +ora);

    }
}
