package ro.cts.clase;

public class Calator implements Observer {
    String numeCalator;

    public Calator(String numeCalator) {
        this.numeCalator = numeCalator;
    }


    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println(this.numeCalator + " primeste mesajul: " + mesaj);
    }
}
