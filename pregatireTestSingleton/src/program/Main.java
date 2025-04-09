package program;

import clase.AutoritateReglementareMasiniEager;
import clase.AutoritateReglementareMasiniLazy;

public class Main {
    public static void main(String[] args){
        AutoritateReglementareMasiniEager autoritate = AutoritateReglementareMasiniEager.getInstance();
        System.out.println(autoritate);

        AutoritateReglementareMasiniEager autoritate1 = AutoritateReglementareMasiniEager.getInstance();
        System.out.println(autoritate1);
        autoritate1.setWebsite("www.farawebsite.ro");
        System.out.println(autoritate1);
        System.out.println(autoritate);
        autoritate1.reglementeazaModel("SKODA");
        System.out.println(autoritate1);
        System.out.println(autoritate);

        AutoritateReglementareMasiniLazy autoritate2 = AutoritateReglementareMasiniLazy.getInstance("Autoritate", "www.www.com");
        System.out.println(autoritate2);
        AutoritateReglementareMasiniLazy autoritate3 = AutoritateReglementareMasiniLazy.getInstance("Fara Autoritate", "www.yyy.com");
        System.out.println(autoritate3);
    }
}
