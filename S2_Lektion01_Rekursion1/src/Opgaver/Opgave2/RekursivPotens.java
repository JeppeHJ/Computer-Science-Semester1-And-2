package Opgaver.Opgave2;

public class RekursivPotens {
    public static void main(String[] args) {

    }

    /**
     * Beregner potensen af et tal ved hjælp af rekursion.
     *
     * @param n grundtallet
     * @param p eksponenten
     * @return resultatet af n ophøjet i p
     */
    public static int potens(int n, int p) {
        int result = 0;

        // Termineringsregel: Hvis eksponenten p er 0, er resultatet altid 1.
        if (p == 0) {
            return 1;
        } else {
            // Rekurrensregel: Multiplikation af n med potensen af n med eksponenten p-1.
            result = potens(n, p - 1) * n;
        }

        return result;
    }
}
