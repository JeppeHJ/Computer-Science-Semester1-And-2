package Opgaver.Opgave1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FletningAfArrayList {
    public static void main(String[] args) {
        // Opretter en ArrayList med typen Kunde og tilføjer nogle Kunde-objekter til listen
        ArrayList<Kunde> liste1 = new ArrayList<>();
        liste1.add(new Kunde("A", "A", 30));
        liste1.add(new Kunde("C", "C", 25));
        liste1.add(new Kunde("E", "E", 40));

        // Opretter en anden ArrayList med typen Kunde og tilføjer nogle Kunde-objekter til listen
        ArrayList<Kunde> liste2 = new ArrayList<>();
        liste2.add(new Kunde("B", "B", 35));
        liste2.add(new Kunde("D", "D", 28));

        // Sorterer begge lister i stigende rækkefølge baseret på Kunde-objekternes naturlige orden
        Collections.sort(liste1);
        Collections.sort(liste2);

        // Udskriver indholdet af de to lister
        System.out.println(liste1);
        System.out.println(liste2);

        // Kalder fletAlleKunder metoden og udskriver resultatet
        System.out.println(fletAlleKunder(liste1, liste2));
    }

    /**
     * Returnerer en sorteret ArrayList der indeholder alle
     * kunder fra både l1 og l2
     * Krav: l1 og l2 er sorterede
     */
    public static ArrayList<Kunde> fletAlleKunder(ArrayList<Kunde> l1, ArrayList<Kunde> l2) {
        // Opretter en ny ArrayList til at gemme det flettede resultat
        ArrayList<Kunde> nyListe = new ArrayList<>();
        // Initialiserer indeksvariabler til begge lister
        int i1 = 0;
        int i2 = 0;
        // Kører, indtil vi har gennemgået begge lister fuldt ud
        while (i1 < l1.size() && i2 < l2.size()) {
            // Sammenligner de aktuelle Kunde-objekter fra begge lister
            if (l1.get(i1).compareTo(l2.get(i2)) < 0) {
                // Hvis Kunde-objektet i l1 kommer før Kunde-objektet i l2,
                // tilføjes Kunde-objektet i l1 til den nye liste og inkrementerer i1
                nyListe.add(l1.get(i1));
                i1++;
            } else {
                // Hvis Kunde-objektet i l2 kommer før eller er det samme som Kunde-objektet i l1,
                // tilføjes Kunde-objektet i l2 til den nye liste og inkrementerer i2
                nyListe.add(l2.get(i2));
                i2++;
            }
        }
        // Hvis der er flere elementer tilbage i l1, tilføjes de til den nye liste
        while (i1 < l1.size()) {
            nyListe.add(l1.get(i1));
            i1++;
        }

        // Hvis der er flere elementer tilbage i l2, tilføjes de til den nye liste
        while (i2 < l2.size()) {
            nyListe.add(l2.get(i2));
            i2++;
        }

        // Returnerer den flettede og sorteret liste
        return nyListe;
    }
}
