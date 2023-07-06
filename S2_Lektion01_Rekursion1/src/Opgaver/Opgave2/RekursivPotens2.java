package Opgaver.Opgave2;

public class RekursivPotens2 {
    public static void main(String[] args) {

    }

    /**
     * Beregner potensen af et tal ved hjælp af rekursion.
     *
     * @param n grundtallet
     * @param p eksponenten
     * @return resultatet af n ophøjet i p
     */
    public static int power2(int n, int p) {
        int result = 0;

        // Termineringsregel: Hvis eksponenten p er 0, er resultatet altid 1.
        if (p == 0) {
            return 1;
        }
        // Rekurrensregel #1: Hvis eksponenten p er ulige (ikke lige), reduceres den med 1, og n ganges med resultatet af et rekursivt kald.
        else if (p % 2 != 0) {
            result = power2(n, p - 1) * n;
        }
        // Rekurrensregel #2: Hvis eksponenten p er lige, reduceres n til n*n (n ganges med sig selv), og eksponenten divideres med 2. Dette gentages rekursivt.
        else {
            result = power2(n * n, p / 2);
        }

        return result;
    }
}
