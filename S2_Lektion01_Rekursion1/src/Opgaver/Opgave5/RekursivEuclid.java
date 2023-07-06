package Opgaver.Opgave5;

public class RekursivEuclid {
    public static void main(String[] args) {

    }

    /**
     * Beregner største fælles divisor (GCD) af to tal ved hjælp af rekursion og Euclids algoritme.
     *
     * @param a det første tal
     * @param b det andet tal
     * @return GCD af a og b
     */
    public static int gcd(int a, int b) {
        // Termineringsregel: Hvis b er mindre end eller lig med a, og a er deleligt med b, returneres b.
        if (b <= a && a % b == 0) {
            return b;
        }
        // Rekurrensregel #1: Hvis a er mindre end b, byttes a og b om, og metoden kaldes rekursivt med de ombyttede værdier.
        else if (a < b) {
            return gcd(b, a);
        }
        // Rekurrensregel #2: Hvis a er større end b, beregnes resten af a divideret med b, og metoden kaldes rekursivt med b og resten som argumenter.
        else {
            return gcd(b, a % b);
        }
    }
}
