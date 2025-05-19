package ro.cts.Clase;

public class Receptionist {
    public String sepoateAsezaLaMasa(Masa masa){
        Ospatar ospatar = new Ospatar();
        Picolo picolo = new Picolo();
        if(masa.isEsteMasaLibera()){
            if(picolo.esteDebarasata(masa)){
                if(ospatar.esteAranjataMasa(masa)){
                    return "Poate lua loc la masa " + masa.getNrMasa();
                }else{
                    return "Masa " + masa.getNrMasa() +" nu e debarasata";
                }
            }else{
                return " Masa "+ masa.getNrMasa() + " nu e aranjata, va rugam asteptati";
            }
        }else{
            return "Masa " + masa.getNrMasa() + " nu e disponibila. Va multumim!";
        }
    }
}
