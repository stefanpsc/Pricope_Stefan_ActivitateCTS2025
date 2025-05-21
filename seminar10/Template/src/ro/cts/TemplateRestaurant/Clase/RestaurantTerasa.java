package ro.cts.TemplateRestaurant.Clase;

public class RestaurantTerasa extends TemplateOcupare{
    @Override
    boolean curatareMasa(Masa masa) {
        return masa.isEsteCuratata();
    }

    @Override
    void asezareServetele() {
        System.out.println("Se aseaza servetelele");
    }

    @Override
    void asezareTacamuri() {
        System.out.println("Se aseaza tacamurile");

    }

    @Override
    void invitaPersoane(Masa masa) {
        System.out.println("Masa are doar "+ masa.getNrLocuri() + " locuri");
    }
}
