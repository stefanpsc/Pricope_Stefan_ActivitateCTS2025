package ro.cts.clase;

public class Receptionist {

    public String sePoateAsezaClientul(Masa masa){
        Ospatar ospatar = new Ospatar();
        Picolo picolo = new Picolo();
        if(ospatar.esteAranjataMasa(masa)){
            if(picolo.suntLuateServetelele(masa)){
                return "Se poate aseza clientul";
            }else {
                return "Nu sunt luate servetelele";
            }
        }else {
            return "NU Se poate aseza";
        }
    }
}
