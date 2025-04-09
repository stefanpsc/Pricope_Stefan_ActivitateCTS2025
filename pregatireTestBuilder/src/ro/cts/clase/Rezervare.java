package ro.cts.clase;

//B.2. Atunci când un client face o rezervare poate alege una din următoarele opțiuni: așezare la
//geam, scaune ergonomice, decorarea mesei, muzica ambientala personalizata, gen muzica. În cazul
//în care clientul nu specifică vreun element dintre acestea, este setat pe false. Să se implementeze
//modulul care permite crearea de obiecte de tip rezervare cu aceste opțiuni extra.


public class Rezervare {
    private String numeClient;
    private boolean hasAsezareGeam;
    private boolean hasScauneErg;
    private boolean hasMasaDecorata;
    private boolean hasMuzicaAmbientala;
    private String genMuzica;

    public void setHasAsezareGeam(boolean hasAsezareGeam) {
        this.hasAsezareGeam = hasAsezareGeam;
    }

    public void setHasScauneErg(boolean hasScauneErg) {
        this.hasScauneErg = hasScauneErg;
    }

    public void setHasMasaDecorata(boolean hasMasaDecorata) {
        this.hasMasaDecorata = hasMasaDecorata;
    }

    public void setHasMuzicaAmbientala(boolean hasMuzicaAmbientala) {
        this.hasMuzicaAmbientala = hasMuzicaAmbientala;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    protected Rezervare(String numeClient, boolean hasAsezareGeam, boolean hasScauneErg, boolean hasMasaDecorata, boolean hasMuzicaAmbientala, String genMuzica) {
        this.numeClient = numeClient;
        this.hasAsezareGeam = hasAsezareGeam;
        this.hasScauneErg = hasScauneErg;
        this.hasMasaDecorata = hasMasaDecorata;
        this.hasMuzicaAmbientala = hasMuzicaAmbientala;
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", hasAsezareGeam=").append(hasAsezareGeam);
        sb.append(", hasScauneErg=").append(hasScauneErg);
        sb.append(", hasMasaDecorata=").append(hasMasaDecorata);
        sb.append(", hasMuzicaAmbientala=").append(hasMuzicaAmbientala);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
