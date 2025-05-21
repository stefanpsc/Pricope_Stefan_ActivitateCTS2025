package ro.cts.ProxiSpital.main;

import ro.cts.ProxiSpital.clase.IInternare;
import ro.cts.ProxiSpital.clase.Internare;
import ro.cts.ProxiSpital.clase.ProxyInternare;

public class Main {
    public static void main(String[] args){
        IInternare internare = new Internare();
        internare.interneaza("Frone", true,20);
        IInternare proxyInternare = new ProxyInternare(internare);
        proxyInternare.interneaza("Maria", true,20);
        IInternare proxyInternare1 = new ProxyInternare(internare);
        proxyInternare1.interneaza("Stefan", false, 35);
    }
}
