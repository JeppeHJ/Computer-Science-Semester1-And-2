package Opgaver.Opgave4;

public class Nedboer {
    public static void main(String[] args) {
        Nedboer lol = new Nedboer();
        System.out.println(lol.bedsteTreFerieUger());
        System.out.println(lol.bedsteFerieUgerStart(3));
    }

    private int[] nedboerPrUge = {20, 10, 12, 12, 13, 14, 15, 10, 8, 7, 13,
            15, 10, 9, 6, 8, 12, 22, 14, 16, 16, 18, 23, 12, 0, 2, 0, 0, 78, 0,
            0, 0, 34, 12, 34, 23, 23, 12, 44, 23, 12, 34, 22, 22, 22, 22, 18,
            19, 21, 32, 24, 13};

    /**
     * Returnerer ugenummeret for den uge i året, hvor man skal starte ferien,
     * hvis man ønsker den minimale nedbørsmængde i de tre uger
     *
     * @return ugenummeret for starten af ferien
     */
    // Tidskompleksitet på O(n) (LINEÆRT)
    // Teknisk set er det O(uger_i_et_aar - 2)
    public int bedsteTreFerieUger() {
        int bedsteTreUger = Integer.MAX_VALUE; // Holder styr på den laveste nedbørsmængde for tre uger
        int startUge = 0; // Holder styr på ugenummeret, hvor ferien skal starte for at opnå laveste nedbør
        for (int i = 1; i <= nedboerPrUge.length - 3; i++) {
            int nedboer = (nedboerPrUge[i] + nedboerPrUge[i + 1] + nedboerPrUge[i + 2]); // Beregner nedbør for tre på hinanden følgende uger
            if (nedboer < bedsteTreUger) { // Hvis den aktuelle nedbør er lavere end den hidtil laveste
                startUge = i; // Opdaterer ugenummeret for feriens start
                bedsteTreUger = nedboer; // Opdaterer den laveste nedbørsmængde
            }
        }
        return startUge;
    }

    /**
     * Returnerer ugenummeret for den uge i året, hvor man skal starte ferien,
     * hvis man ønsker den minimale nedbørsmængde i det "antal" uger, der er
     * angivet i parameteren
     *
     * @param antal antallet af uger, hvor man ønsker at finde den minimale nedbør
     * @return ugenummeret for starten af ferien
     */
    // Tidskompleksitet på O(n) (LINEÆRT)
    public int bedsteFerieUgerStart(int antal) {
        int minNedboer = Integer.MAX_VALUE; // Holder styr på den laveste nedbørsmængde
        int currentPeriodeNedboer = 0; // Holder styr på nedbøren for den aktuelle periode med længde 'antal'
        int startUge = 0; // Holder styr på ugenummeret, hvor ferien skal starte for at opnå laveste nedbør
        // Beregner nedbøren for de første 'antal' uger
        for (int i = 0; i < antal; i++) {
            currentPeriodeNedboer += nedboerPrUge[i];
        }
        // Tjekker, om de første 'antal' uger har mindre nedbør end minNedboer
        if (currentPeriodeNedboer < minNedboer) {
            minNedboer = currentPeriodeNedboer;
            startUge = 0; // startUge sættes til 0, da de første 'antal' uger har mindre nedbør
        }
        // Finder den 'antal' ugers periode med den mindste nedbør
        for (int i = antal; i < nedboerPrUge.length; i++) {
            // Beregner rullende sum ved at tilføje denne uges nedbør og trække den første uges nedbør fra 'antal' uger siden
            currentPeriodeNedboer = currentPeriodeNedboer + nedboerPrUge[i] - nedboerPrUge[i - antal];
            // Hvis den aktuelle periodes nedbør er mindre end minNedboer, opdateres minNedboer og startUge
            if (currentPeriodeNedboer < minNedboer) {
                minNedboer = currentPeriodeNedboer;
                startUge = i - antal + 1; // +1 for at justere for 0-baseret indeksering
            }
        }
        return startUge;
    }

    /**
     * Returnerer ugenummeret på den første uge, hvor nedbøren har været præcis
     * den samme flest uger i træk
     *
     * @return ugenummeret for starten af den længste sekvens med samme nedbør
     */
    // Tidskompleksitet på O(n) (LINEÆRT)
    public int ensNedboer() {
        int longestStreakCount = 0; // Holder styr på længden af den længste sekvens
        int longestStreakStart = -1; // Indeks for starten af den længste sekvens
        int currentStreakCount = 1; // Holder styr på længden af den aktuelle sekvens
        int currentStreakStart = 0; // Indeks for starten af den aktuelle sekvens
        // Gennemløber arrayet fra den anden uge til den sidste
        for (int i = 1; i < nedboerPrUge.length; i++) {
            if (nedboerPrUge[i] == nedboerPrUge[i - 1]) {
                // Hvis den aktuelle uge har samme nedbør som den forrige, fortsætter vi den aktuelle sekvens
                currentStreakCount++;
            } else {
                // Ellers sammenligner vi den aktuelle sekvens med den længste
                if (currentStreakCount > longestStreakCount) {
                    longestStreakCount = currentStreakCount;
                    longestStreakStart = currentStreakStart;
                }
                // Og starter en ny sekvens fra denne uge
                currentStreakCount = 1;
                currentStreakStart = i;
            }
        }
        // Efter loopet sammenligner vi den aktuelle sekvens med den længste en sidste gang
        // i tilfælde af at den længste sekvens er den sidste i arrayet
        if (currentStreakCount > longestStreakCount) {
            longestStreakStart = currentStreakStart;
        }
        return longestStreakStart;
    }
}
