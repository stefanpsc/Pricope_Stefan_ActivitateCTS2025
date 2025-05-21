package ro.cts.TemplateRestaurant.Clase;

public abstract class TemplateOcupare {
    public final void ocupare(Masa masa){
        if(curatareMasa(masa) ==false){
            System.out.println("NU te poti aseza la masa. Nu e curat.");
        }else{
            asezareServetele();
            asezareTacamuri();
            invitaPersoane(masa);
        }
    }

    abstract boolean curatareMasa(Masa masa);
    abstract void asezareServetele();
    abstract void asezareTacamuri();
    abstract void invitaPersoane(Masa masa);
}
