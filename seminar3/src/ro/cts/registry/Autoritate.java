package ro.cts.registry;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Autoritate {
    private String nume;
    private String website;
    private Map<String, Reglementare>map = new HashMap<>();
    private static Autoritate instance = null;


    private Autoritate(String nume, String website) {
        this.nume = nume;
        this.website = website;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autoritate{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", website='").append(website).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static Autoritate getInstance(String nume, String website){
        if(instance == null){
            instance = new Autoritate(nume, website);
        }
        return instance;
    }

    public Reglementare reglmenteazaModel(String model){
        if(!map.containsKey(model)){
//            return map.get(model);
            map.put(model, new Reglementare(model, map.size() +1, (new Date()).toString()));

        }
        return map.get(model);
    }
}
