package Opgaver.Opgave3;

public class RekursivProdukt2 {
    public static void main(String[] args) {

    }

    /**
     * Beregner produktet af to tal ved hjælp af rekursion og den russiske bonde-metode.
     *
     * @param a det første tal
     * @param b det andet tal
     * @return produktet af a og b
     */
    public static int produktRus(int a, int b) {
        int result = 0;

        // Termineringsregel: Hvis tallet a er 0, er produktet altid 0.
        if (a == 0) {
            return 0;
        }
        // Rekurrensregel #1: Hvis tallet a er ulige (ikke lige), reduceres det med 1, og b lægges til resultatet af et rekursivt kald.
        else if (a % 2 != 0) {
            result = produktRus(a - 1, b) + b;
        }
        // Rekurrensregel #2: Hvis tallet a er lige, halveres a, og b fordobles. Dette gentages rekursivt.
        else {
            result = produktRus(a / 2, b * 2);
        }

        return result;
    }
}
