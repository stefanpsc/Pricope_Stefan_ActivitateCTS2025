package ro.cts.clase;

public class Rezervare implements  IRezervare{
    @Override
    public void rezerva(String numeClient, int nrPersoane, int ora) {
        System.out.println("Se rezerva o masa pentru clientul " + numeClient + " la ora " + ora + " pentru " + nrPersoane + " persoane ");

    }
}
