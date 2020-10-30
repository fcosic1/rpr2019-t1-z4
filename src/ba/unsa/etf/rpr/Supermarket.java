package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli = new Artikl[1000];
    private int broj = 0;
    public boolean dodajArtikl(Artikl a){
        if(broj< 50) {
            artikli[broj] = new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
            broj++;
            return true;
        }
        return false;
    }
    public Artikl[] getArtikli(){
        return  artikli;
    }
    public Artikl izbaciArtiklSaKodom(String kod){

    }

    public void pomjeriSve(int pozicija){
        for(int i=pozicija; i<broj; i++){
            artikli[i] = artikli[i+1];
        }
        artikli[broj] = null;
        broj--;
    }


}
