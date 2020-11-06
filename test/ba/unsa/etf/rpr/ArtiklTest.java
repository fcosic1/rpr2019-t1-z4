package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ArtiklTest {

    @Test
    void getNaziv() {
        Artikl artikl = new Artikl("Čokolada", 5, "1234");
        assertEquals("Čokolada", artikl.getNaziv());
    }

    @Test
    void getKod() {
        Artikl artikl = new Artikl("Čokolada", 5, "1234");
        assertEquals("Čokolada", artikl.getKod());
    }

    @Test
    void getCijena() {
        Artikl artikl = new Artikl("Čokolada", 5, "1234");
        assertEquals("Čokolada", artikl.getCijena());
    }

  /*  @Test
    void setNaziv(){
        Artikl artikl = new Artikl("Čokolada", 5, "1234");
        artikl.setNaziv("Milka");
    }*/
}