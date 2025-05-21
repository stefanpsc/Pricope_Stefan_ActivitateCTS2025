package ro.cts.TemplateRestaurant.Main;

import ro.cts.TemplateRestaurant.Clase.Masa;
import ro.cts.TemplateRestaurant.Clase.RestaurantInterior;
import ro.cts.TemplateRestaurant.Clase.RestaurantTerasa;
import ro.cts.TemplateRestaurant.Clase.TemplateOcupare;

public class Main {
    public static void main(String[] args){
        Masa masa = new Masa(4,2,true);
        Masa masa1 = new Masa(4,5,false);

        TemplateOcupare interior = new RestaurantInterior();
        interior.ocupare(masa);
        interior.ocupare(masa1);
        TemplateOcupare terasa = new RestaurantTerasa();
        terasa.ocupare(masa);
        terasa.ocupare(masa1);
    }
}
