package ro.cts.main;

import ro.cts.clase.AutoritateReglementareMasiniEager;
import ro.cts.clase.AutoritateReglementareMasiniLazy;

public class Main {
    public static void main(String[] args) {
        AutoritateReglementareMasiniEager autoritate = AutoritateReglementareMasiniEager.getInstance();
        System.out.println(autoritate);

        AutoritateReglementareMasiniEager autoritate2 = AutoritateReglementareMasiniEager.getInstance();
        autoritate2.setWebsite("www.siteNou");
        System.out.println(autoritate2);
        System.out.println(autoritate);
        autoritate2.reglementeazModel("DaciaLogan");
        System.out.println(autoritate2);

        AutoritateReglementareMasiniLazy autol = AutoritateReglementareMasiniLazy.getInstance("autoritate3", "www.autoritate3.com");
        System.out.println(autol);
        AutoritateReglementareMasiniLazy autol1 = AutoritateReglementareMasiniLazy.getInstance("autoritate4", "www.autoritate4.com");
        System.out.println(autol1);



    }
}