package Opgaver.Opgave7;

public class IterativTalFølge1 {
    public static void main(String[] args) {
    }

    // Denne metode beregner værdien af talN i en talrække baseret på det givne n.
    public static int talN(int n) {
        if (n == 0) {
            return 2;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 5;
        } else {
            // Initialisering af variabler til at holde tidligere talværdier
            int talNMinus3 = 2;
            int talNMinus2 = 1;
            int talNMinus1 = 5;
            int talN = 0;

            // Iterativ løkke til at beregne talN baseret på tidligere talværdier
            for (int i = 3; i <= n; i++) {
                if (i % 2 == 0) {
                    // Hvis i er et lige tal, beregnes talN ved at anvende formel 2 * talNMinus1 - talNMinus2
                    talN = 2 * talNMinus1 - talNMinus2;
                } else {
                    // Hvis i er et ulige tal, beregnes talN ved at anvende formel talNMinus1 + talNMinus2 + 3 * talNMinus3
                    talN = talNMinus1 + talNMinus2 + 3 * talNMinus3;
                }

                // Opdatering af tidligere talværdier til næste iteration
                talNMinus3 = talNMinus2;
                talNMinus2 = talNMinus1;
                talNMinus1 = talN;
            }

            return talN;
        }
    }
}
