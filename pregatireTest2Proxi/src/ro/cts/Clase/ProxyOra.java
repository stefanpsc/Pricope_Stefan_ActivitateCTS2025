package ro.cts.Clase;

public class ProxyOra implements IRezervare{
    IRezervare rezervare;

    public ProxyOra(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezerva(String numeClient, int nrPersoane, int ora) {
        if(ora>18){
            rezervare.rezerva(numeClient,nrPersoane,ora);
        }else{
            System.out.println("Nu se poate face rezervarea. Va rugam sa va prezentati la restaurant!");
        }
    }
}
