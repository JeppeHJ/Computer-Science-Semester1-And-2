package Opgaver.Opgave3;

public class RekursivProdukt {
    public static void main(String[] args) {
        System.out.println(product(4, 3));
    }

    /**
     * Beregner produktet af to tal ved hjælp af rekursion.
     *
     * @param a det første tal
     * @param b det andet tal
     * @return produktet af a og b
     */
    public static int product(int a, int b) {
        // Termineringsregel: Hvis a er 0, er produktet altid 0.
        if (a == 0) {
            return 0;
        }
        // Rekurrensregel: Produktet af a og b er lig med produktet af a-1 og b, plus b.
        else {
            return product(a - 1, b) + b;
        }
    }
}
