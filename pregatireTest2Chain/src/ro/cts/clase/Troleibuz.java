package ro.cts.clase;

public class Troleibuz extends InfoMijloc{
    @Override
    public void recomandaMijloc(int distanta) {
        if(distanta<3){
            System.out.println("Calatorul ia Troleibuz");
        }else{
            this.getUrmMijloc().recomandaMijloc(distanta);
        }
    }
}
