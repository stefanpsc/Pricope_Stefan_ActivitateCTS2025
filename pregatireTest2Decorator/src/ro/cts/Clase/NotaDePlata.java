package ro.cts.Clase;

public class NotaDePlata implements Nota {
    public float totalPlata;

    public NotaDePlata(float totalPlata) {
        this.totalPlata = totalPlata;
    }

    public void printare(){
        System.out.println("Se printeaza nota cu totalul: "+ this.totalPlata);
    }
}
