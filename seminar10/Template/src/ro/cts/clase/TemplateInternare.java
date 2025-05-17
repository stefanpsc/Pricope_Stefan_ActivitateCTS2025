package ro.cts.clase;

public abstract class TemplateInternare {
   public final void internare(Pacient pacient){
        if(analizareDificultate(pacient)<3) {
            System.out.println("nu necesita internare");
        } else {
            verificareDisponibilitate();
            emitereFisa(pacient);
        }

    }

    abstract int analizareDificultate(Pacient pacient);
    abstract void verificareDisponibilitate();
    abstract void emitereFisa(Pacient pacient);
}
