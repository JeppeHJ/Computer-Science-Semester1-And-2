package Opgaver.Opgave2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BødeBeregner {

    private int bøde;

    public BødeBeregner() {

    }

    public int getBøde() {
        return bøde;
    }

    public void setBøde(int bøde) {
        this.bøde = bøde;
    }

    /*
     * Returnerer størrelsen af bøden beregnet i henhold til skemaet
     * ovenfor
     * krav: beregnetDato og faktiskDato indeholder lovlige datoer og
     * beregnetDato < faktiskDato
     * (beregnetDato er forventet afleveringsdato og
     * faktiskDato er den dag bogen blev afleveret; voksen er
     * sand, hvis det er en voksen og falsk ellers)
     */
    public int beregnBøde(LocalDate beregnetDato,
                          LocalDate faktiskDato, boolean voksen) {
        int insaneBøde = bøde;
        if (ChronoUnit.DAYS.between(beregnetDato, faktiskDato) < 8) {
            if (voksen) {
                insaneBøde = bøde + 20;
            } else {
                insaneBøde = bøde + 10;
            }

        } else if (ChronoUnit.DAYS.between(beregnetDato, faktiskDato) < 15) {
            if (voksen) {
                insaneBøde = bøde + 60;
            } else {
                insaneBøde = bøde + 30;
            }
        } else {
            if (voksen) {
                insaneBøde = bøde + 90;
            } else {
                insaneBøde = bøde + 45;
            }

        }
        return insaneBøde;
    }
}
