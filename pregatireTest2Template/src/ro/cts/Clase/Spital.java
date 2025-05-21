package ro.cts.Clase;

public class Spital extends TemplateInternare {
    @Override
    int analizeazaDificultate(Pacient pacient) {
        return pacient.getGradDificultate();
    }

    @Override
    void verificaDisponibilitate() {
        System.out.println("Exista paturi disponibile ");
    }

    @Override
    void emiteFisa(Pacient pacient) {
        System.out.println("Se emite fisa pentru "+ pacient.getNume());
    }
}
