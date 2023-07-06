package Opgaver.Opgave4;

import java.util.Comparator;

public class Kunde implements Comparable<Kunde> {
    private String navn; // Variabel til at gemme kundens navn
    private int nummer; // Variabel til at gemme kundens nummer
    private Comparator<Kunde> comparator; // Variabel til at håndtere sammenligning af Kunde-objekter

    public Kunde(String navn, int nummer) {
        this.navn = navn; // Initialiserer navn med den modtagne værdi
        this.nummer = nummer; // Initialiserer nummer med den modtagne værdi
    }

    public String getNavn() {
        return navn; // Returnerer kundens navn
    }

    public void setNavn(String navn) {
        this.navn = navn; // Opdaterer kundens navn med den modtagne værdi
    }

    public int getNummer() {
        return nummer; // Returnerer kundens nummer
    }

    public void setNummer(int nummer) {
        this.nummer = nummer; // Opdaterer kundens nummer med den modtagne værdi
    }

    public void setComparator(Comparator<Kunde> comparator) {
        this.comparator = comparator; // Opdaterer sammenligningskomparatoren med den modtagne værdi
    }

    @Override
    public int compareTo(Kunde o) {
        return comparator.compare(this, o); // Sammenligner dette Kunde-objekt med et andet Kunde-objekt ved hjælp af komparatoren
    }
}
