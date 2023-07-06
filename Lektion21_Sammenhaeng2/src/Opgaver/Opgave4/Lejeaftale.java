package Opgaver.Opgave4;

import java.sql.Array;
import java.time.LocalDate;

public class Lejeaftale {
    private LocalDate fraDato;
    private LocalDate tilDato;
    private Bolig bolig;
    private Lejer[] lejere;

    Lejeaftale(LocalDate fraDato, Bolig bolig) {
        this.fraDato = fraDato;
        this.bolig = bolig;
        bolig.addLejeaftale(this);
        this.tilDato = null;
        this.lejere = new Lejer[2];
    }

    public void addLejere(Lejer lejer1, Lejer lejer2) {
        this.lejere[0] = lejer1;
        this.lejere[1] = lejer2;
    }

    public LocalDate getFraDato() {
        return fraDato;
    }

    public void setFraDato(LocalDate fraDato) {
        this.fraDato = fraDato;
    }

    public LocalDate getTilDato() {
        return tilDato;
    }

    public void setTilDato(LocalDate tilDato) {
        this.tilDato = tilDato;
    }
}
