package ro.cts.Clase;

public class SpitalPrivat extends TemplateInternare{
    private String denumire;

    public SpitalPrivat(String denumire) {
        this.denumire = denumire;
    }

    @Override
    int analizeazaDificultate(Pacient pacient) {
        return pacient.getGradDificultate();
    }

    @Override
    void verificaDisponibilitate() {
        System.out.println("Se verifica disponibilitate");
    }

    @Override
    void emiteFisa(Pacient pacient) {
        System.out.println("Se emite fisa pentru pacientul cu numele " + pacient.getNume());
    }
}
