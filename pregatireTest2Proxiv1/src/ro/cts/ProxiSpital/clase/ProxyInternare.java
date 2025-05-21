package ro.cts.ProxiSpital.clase;

public class ProxyInternare implements IInternare{
    IInternare internare;

    public ProxyInternare(IInternare internare) {
        this.internare = internare;
    }

    @Override
    public void interneaza(String nume, boolean aiAsigurare, int varsta) {
        if(aiAsigurare ==true){
            internare.interneaza(nume,aiAsigurare,varsta);
        }else{
            System.out.println("NU poate fi internat pentru ca nu are asigurare");
        }
    }
}
