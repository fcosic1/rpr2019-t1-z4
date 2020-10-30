package ba.unsa.etf.rpr;

public class Korpa {
private Artikl[] artikli = new Artikl[50];
private int broj = 0;
public boolean dodajArtikl(Artikl a){
    if(broj<50){
        artikli[broj] = new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
        broj++;
        return true;
    }
    return false;
}
public Artikl[] getArtikli(){
    return artikli;
}
public int dajUkupnuCijenuArtikala(){
    int cijena = 0;
    for(int i=0; i<broj; i++){
        cijena += artikli[i].getCijena();
    }
    return cijena;
}
private void pomjeriSve(int pozicija){
    for(int i=pozicija; i<broj; i++){
        artikli[i] = artikli[i+1];
    }
    artikli[broj] = null;
    broj--;
}
public Artikl izbaciArtiklSaKodom(String kod){
    for(int i=0; i<broj; i++){
        if(artikli[i].getKod().equals(kod)){
            Artikl novi = new Artikl(artikli[i].getNaziv(), artikli[i].getCijena(), artikli[i].getKod());
            artikli[i] = null;
            pomjeriSve(i);
            return novi;
        }
    }
    return null;
}
}
