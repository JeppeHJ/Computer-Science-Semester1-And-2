package Opgaver.Opgave5;

public class BelgiskFlag {
    /**
     * Sorterer et array af belgiske flagfarver ('S' - Sort, 'G' - Gul, 'R' - Rød)
     * ved at gruppere farverne sammen.
     *
     * @param belgisk_flag arrayet med belgiske flagfarver
     */
    public static void belgisk_flag(char[] belgisk_flag) {
        int low = 0, mid = 0;
        int high = belgisk_flag.length - 1;

        // Grupperer farverne sammen ved at justere indekser
        while (mid <= high) {
            switch (belgisk_flag[mid]) {
                case 'S' -> swap(belgisk_flag, low++, mid++); // Flytter 'S' til venstre
                case 'G' -> mid++; // Ignorerer 'G' og fortsætter
                case 'R' -> swap(belgisk_flag, mid, high--); // Flytter 'R' til højre
            }
        }
    }

    /**
     * Sorterer et array af belgiske flagfarver ('S' - Sort, 'G' - Gul, 'R' - Rød)
     * ved at tælle antallet af hver farve og derefter fylde arrayet igen med det rigtige antal.
     *
     * @param belgisk_flag arrayet med belgiske flagfarver
     */
    public static void belgisk_flag2(char[] belgisk_flag) {
        int countS = 0, countG = 0, countR = 0;

        // Tæller antallet af hver farve
        for (char c : belgisk_flag) {
            switch (c) {
                case 'S':
                    countS++;
                    break;
                case 'G':
                    countG++;
                    break;
                case 'R':
                    countR++;
                    break;
            }
        }

        // Fylder arrayet igen med det rigtige antal af hver farve
        int i = 0;
        while (countS-- > 0) {
            belgisk_flag[i++] = 'S';
        }
        while (countG-- > 0) {
            belgisk_flag[i++] = 'G';
        }
        while (countR-- > 0) {
            belgisk_flag[i++] = 'R';
        }
    }

    /**
     * Udskifter to elementer i et array.
     *
     * @param array arrayet
     * @param i     indeks for det første element
     * @param j     indeks for det andet element
     */
    private static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
