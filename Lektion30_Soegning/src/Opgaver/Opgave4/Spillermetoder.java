package Opgaver.Opgave4;

import java.util.ArrayList;

public class Spillermetoder {
    /**
     * Opgave 4.1: Finder en spiller med en bestemt målscore ved at løkke lineært.
     *
     * @param spillere en liste af Spiller-objekter
     * @param score    en målscore
     * @return den første Spiller i listen med den angivne målscore, eller null hvis ingen spiller matcher
     */
    public Spiller findScoreLinear(ArrayList<Spiller> spillere, int score) {
        Spiller spillerMedScore = null;
        int i = 0;
        while (spillerMedScore == null && i < spillere.size()) {
            Spiller k = spillere.get(i);
            if (k.getMaal() == score) {
                spillerMedScore = k; // Gemmer spilleren, hvis maal-værdien matcher
            } else {
                i++;
            }
        }
        return spillerMedScore;
    }

    /**
     * Opgave 4.1: Finder en spiller med en bestemt målscore ved binær søgning.
     *
     * @param spillere en liste af Spiller-objekter, sorteret efter målscore
     * @param score    en målscore
     * @return den første Spiller i listen med den angivne målscore, eller null hvis ingen spiller matcher
     */
    public Spiller findScoreBinary(ArrayList<Spiller> spillere, int score) {
        Spiller spillerMedScore = null;
        int left = 0; // Venstre grænse for det aktuelle område
        int right = spillere.size() - 1; // Højre grænse for det aktuelle område
        int middle = -1; // Midten af det aktuelle område
        while (spillerMedScore == null && left <= right) {
            middle = (left + right) / 2; // Beregner midten af det aktuelle område
            Spiller k = spillere.get(middle);
            if (k.getMaal() == score) {
                spillerMedScore = k; // Gemmer spilleren, hvis maal-værdien matcher
            } else if (k.getMaal() < score) {
                right = middle - 1; // Opdaterer højre grænse til at være venstre for midten
            } else {
                left = middle + 1; // Opdaterer venstre grænse til at være højre for midten
            }
        }
        return spillerMedScore;
    }

    /**
     * Opgave 4.1: Finder navnet på en god spiller med en høj målscore og lav højde.
     *
     * @param spillere en liste af Spiller-objekter
     * @return navnet på den første Spiller i listen med en målscore over 50 og en højde under 170, eller en tom streng hvis ingen spiller matcher
     */
    public String godSpiller(ArrayList<Spiller> spillere) {
        String navnPaaSpiller = "";
        int i = 0;
        while (navnPaaSpiller.equals("") && i < spillere.size()) {
            Spiller k = spillere.get(i);
            if (k.getMaal() > 50 && k.getHoejde() < 170) {
                navnPaaSpiller = k.getNavn();
            } else {
                i++;
            }
        }
        return navnPaaSpiller;
    }

    // Opgave 4.2 og 4.3 kan implementeres her

    public static void main(String[] args) {
        Spillermetoder metoder = new Spillermetoder();

        // Her afprøves opgave 4.1
        ArrayList<Spiller> spillerListe = new ArrayList<>();
        spillerListe.add(new Spiller("Hans", 196, 99, 45));
        spillerListe.add(new Spiller("Bo", 203, 89, 60));
        spillerListe.add(new Spiller("Jens", 188, 109, 32));
        spillerListe.add(new Spiller("Finn", 194, 102, 12));
        spillerListe.add(new Spiller("Lars", 192, 86, 35));
        spillerListe.add(new Spiller("Mads", 200, 103, 37));

        System.out.println("Spiller der har scoret 35 mål: " + metoder.findScoreLinear(spillerListe, 35));
        System.out.println("Spiller der har scoret 30 mål: " + metoder.findScoreLinear(spillerListe, 30));

        // Tilføj kode der afprøver opgaver 4.2 og 4.3
    }
}
