package ro.cts.ProxiSpital.clase;

public class Internare implements IInternare {


    @Override
    public void interneaza(String nume, boolean aiAsigurare, int varsta) {
        System.out.println("Se interneaza " + nume + "Cu varsta de " + varsta);
    }
}
