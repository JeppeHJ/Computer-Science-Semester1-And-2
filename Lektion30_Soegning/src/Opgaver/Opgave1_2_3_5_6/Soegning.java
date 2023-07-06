package Opgaver.Opgave1_2_3_5_6;

import java.util.ArrayList;

public class Soegning {
    /**
     * Opgave 1: Finder om der findes ulige tal i en tabel.
     *
     * @param tabel en array af heltal
     * @return true, hvis der findes mindst et ulige tal i tabellen, ellers false
     */
    public boolean findUlige(int[] tabel) {
        boolean found = false;
        int i = 0;
        while (!found && i < tabel.length) {
            int k = tabel[i];
            if (k % 2 != 0) { // Tjekker om tallet er ulige
                found = true; // Sætter found til true, hvis ulige tal findes
            } else {
                i++; // Går videre til næste element i listen
            }
        }
        return found;
    }

    /**
     * Opgave 2: Finder det første tal i intervallet 10-15 i en tabel.
     *
     * @param tabel en array af heltal
     * @return det første tal i intervallet 10-15 i tabellen, hvis det findes, ellers -1
     */
    public int findInterval(int[] tabel) {
        int number = -1;
        int i = 0;
        while (number == -1 && i < tabel.length) {
            int k = tabel[i];
            if (k >= 10 && k <= 15) { // Tjekker om tallet er inden for intervallet 10-15
                number = k; // Sætter number til det første tal inden for intervallet
            } else {
                i++; // Går videre til næste element i listen
            }
        }
        return number;
    }

    /**
     * Opgave 3: Finder om der findes to på hinanden følgende tal i en tabel, der er ens.
     *
     * @param tabel en array af heltal
     * @return true, hvis der findes mindst to ens tal i tabellen, ellers false
     */
    public boolean findEqualNumbers(int[] tabel) {
        boolean found = false;
        int i = 0;
        while (!found && i < tabel.length - 1) {
            int k = tabel[i];
            if (k == tabel[i + 1]) { // Tjekker om to på hinanden følgende tal er ens
                found = true; // Sætter found til true, hvis ens tal findes
            } else {
                i++; // Går videre til næste element i listen
            }
        }
        return found;
    }

    /**
     * Opgave 5.1: Finder kvadratroden af et tal ved at løkke lineært.
     *
     * @param n et heltal
     * @return kvadratroden af tallet
     */
    public int findSquareRootLinear(int n) {
        // Initialiserer kandidat kvadratrod til 0
        int r = 0;

        // Løkker igennem, indtil vi finder et tal, hvor kvadratet er større end n
        while (r * r <= n) {
            // Øger kandidat kvadratrod med 1 for hvert trin
            r++;
        }

        // Returnerer det forrige tal, da vi overskrider n i det sidste trin af løkken
        return r - 1;
    }

    /**
     * Opgave 5.2: Finder kvadratroden af et tal ved binær søgning.
     *
     * @param n et heltal
     * @return kvadratroden af tallet
     */
    public int findSquareRootBinary(int n) {
        int left = 0; // Venstre grænse af søgeområdet
        int right = n; // Højre grænse af søgeområdet
        int result = -1; // Variabel til at gemme det største heltal, der opfylder betingelsen

        while (left <= right) { // Søgningen fortsætter, så længe venstre grænse er mindre end eller lig med højre grænse
            int middle = left + (right - left) / 2; // Beregning af midtpunktet mellem venstre og højre grænse
            if (middle * middle <= n) { // Hvis midtpunktet opfylder betingelsen
                result = middle; // Opdaterer resultatet til midtpunktet
                left = middle + 1; // Opdaterer venstre grænse til at være efter midtpunktet
            } else {
                right = middle - 1; // Opdaterer højre grænse til at være før midtpunktet
            }
        }

        return result; // Returnerer det største heltal, der opfylder betingelsen
    }

    /**
     * Opgave 6: Finder et tal i en liste og bytter det med det forrige element, hvis det ikke allerede er på den første position.
     *
     * @param list en liste af heltal
     * @param n    et heltal, der skal findes i listen
     * @return den nye position for det fundne tal efter bytning, hvis det findes, ellers -1
     */
    public int find(ArrayList<Integer> list, int n) {
        // Gennemgår listen
        for (int i = 0; i < list.size(); i++) {
            // Hvis det aktuelle element er det, vi leder efter
            if (list.get(i) == n) {
                // Hvis det ikke allerede er på den første position
                if (i != 0) {
                    // Bytter det med det forrige element
                    Integer temp = list.get(i - 1);
                    list.set(i - 1, list.get(i));
                    list.set(i, temp);
                }
                // Returnerer den nye position
                return i == 0 ? i : i - 1;
            }
        }
        // Hvis tallet ikke blev fundet i listen
        return -1;
    }
}
