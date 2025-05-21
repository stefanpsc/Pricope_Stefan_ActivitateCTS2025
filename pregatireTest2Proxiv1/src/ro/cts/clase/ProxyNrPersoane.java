package ro.cts.clase;

public class ProxyNrPersoane implements IRezervare {
    IRezervare rezervare;

    public ProxyNrPersoane(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezerva(String numeClient, int nrPersoane, int ora) {
        if(nrPersoane>=4){
           rezervare.rezerva(numeClient, nrPersoane,ora);
        }else{
            System.out.println("Nu se poate face rezervarea");
        }
    }
}
