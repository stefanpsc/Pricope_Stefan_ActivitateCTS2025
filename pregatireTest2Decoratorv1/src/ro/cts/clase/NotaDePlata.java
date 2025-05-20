package ro.cts.clase;

public class NotaDePlata implements Nota{
    public float totalPlata;

    public NotaDePlata(float totalPlata) {
        this.totalPlata = totalPlata;
    }


    @Override
    public void printeaza() {
        System.out.println("Se printeaza nota cu totalul "+ this.totalPlata );
    }
}
