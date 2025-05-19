package ro.cts.Clase;

public class NotaDePlata implements Nota{

    private float totalNota;
    public NotaDePlata(float totalNota) {
        this.totalNota = totalNota;
    }
    @Override
    public void printare() {
        System.out.println("Totalul de plata este " + this.totalNota );
    }
}
