package Opgaver.Opgave1;

public class RekursivFakultet {
    public static void main(String[] args) {
    }

    /**
     * Beregner fakultetet af et tal ved hjælp af rekursion.
     *
     * @param n tallet, hvis fakultet skal beregnes
     * @return fakultetet af tallet n
     */
    public static int factorial(int n) {
        int result = 0;

        // Termineringsregel: Hvis n er 0, er fakultetet 1.
        if (n == 0) {
            return 1;
        } else {
            // Rekurrensregel: Multiplikation af n med fakultetet af n-1.
            result = n * factorial(n - 1);
        }

        return result;
    }
}
