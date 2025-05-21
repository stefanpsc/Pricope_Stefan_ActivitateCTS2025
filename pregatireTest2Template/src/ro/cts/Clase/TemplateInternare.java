package ro.cts.Clase;

public abstract class TemplateInternare {

    public final void internare(Pacient pacient){
        if (analizeazaDificultate(pacient)<3){
            System.out.println("Nu necesita internare");
        }else{
            verificaDisponibilitate();
            emiteFisa(pacient);
        }
    }

    abstract int analizeazaDificultate(Pacient pacient);

    abstract void verificaDisponibilitate();
    abstract void emiteFisa(Pacient pacient);

}
