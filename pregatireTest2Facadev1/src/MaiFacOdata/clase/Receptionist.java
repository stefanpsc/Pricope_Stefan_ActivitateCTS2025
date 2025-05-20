package MaiFacOdata.clase;

public class Receptionist {
    public String sePoateAseza(Masa masa) {
        Ospatar ospatar = new Ospatar();
        Picolo picolo = new Picolo();

        if(masa.esteLibera){
            if(ospatar.esteDebarasataMasa(masa)){
                if(picolo.suntLuateServetelele(masa)){
                    return "Va puteti aseza";
                }else{
                    return "Nu sunt luate servetelele";
                }
            }else{
                return "Vezi ca nu e debarasata";
            }
        }else{
            return "Masa nu e libera";
        }
    }
}
