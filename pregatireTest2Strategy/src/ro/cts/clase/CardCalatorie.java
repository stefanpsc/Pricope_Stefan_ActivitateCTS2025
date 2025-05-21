package ro.cts.clase;

public class CardCalatorie implements IMetodaPlata {
    private int nrCalatoriiRamase;

    public CardCalatorie(int nrCalatoriiRamase) {
        this.nrCalatoriiRamase = nrCalatoriiRamase;
    }


    @Override
    public void realizeazaPlata(float pretBilet) {
        if(nrCalatoriiRamase>0){
            System.out.println("S a efectuat plata prin card de calatorie");
            nrCalatoriiRamase -=1;
        }else{
            System.out.println("Nu mai aveti calatorii ramase");
        }
    }
}
