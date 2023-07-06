package Opgaver.Opgave6;

public class RekursivDominobrik {
    public static void main(String[] args) {
        // f(n) = f(n-1) + f(n-2) for n > 2
    }

    /**
     * Beregner antallet af måder at dække en stribe med dominobrikker ved hjælp af rekursion.
     *
     * @param n længden af strippen
     * @return antallet af måder at dække strippen på
     */
    public static int waysToCoverStrip(int n) {
        // Basistilfælde: Hvis strippen har en længde på 1, er der kun én måde at dække den på (med en enkelt dominobrik).
        if (n == 1) {
            return 1;
        }
        // Basistilfælde: Hvis strippen har en længde på 2, er der to måder at dække den på (med enten to enkeltdominobrikker eller en dobbeltdominobrik).
        else if (n == 2) {
            return 2;
        }
        // Rekurrensregel: Antallet af måder at dække en stribe på med længde n er summen af antallet af måder at dække en stribe på med længde n-1
        // og antallet af måder at dække en stribe på med længde n-2. Dette udnytter, at den sidste dominobrik kan enten være en enkelt- eller dobbeltdominobrik.
        else {
            return waysToCoverStrip(n - 1) + waysToCoverStrip(n - 2);
        }
    }
}
