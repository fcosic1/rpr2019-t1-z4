package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() throws IllegalAccessException {
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("Bicklo", 1000, "4"));
        korpa.dodajArtikl(new Artikl("Čokolada", 5, "12"));
        korpa.dodajArtikl(new Artikl("Kolica", 1000, "8"));
        assertEquals(3, korpa);
    }

    @Test
    void getArtikli() {

    }

    @Test
    void dajUkupnuCijenuArtikala() {
    }

    @Test
    void izbaciArtiklSaKodom() {
    }
}