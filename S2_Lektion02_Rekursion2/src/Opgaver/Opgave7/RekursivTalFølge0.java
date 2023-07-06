package Opgaver.Opgave7;

public class RekursivTalFølge0 {
    public static void main(String[] args) {
        System.out.println(talN(3));
    }

    // Denne metode beregner værdien af talN i en talrække baseret på det givne n ved brug af rekursion.
    public static int talN(int n) {
        if (n == 0) {
            return 2;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 5;
        } else if (n > 2 && n % 2 == 0) {
            // Hvis n er større end 2 og et lige tal, kaldes talN rekursivt med n-1 og n-2, og resultatet beregnes ved at anvende formel 2 * talN(n - 1) - talN(n - 2)
            return 2 * talN(n - 1) - talN(n - 2);
        } else if (n > 2 && n % 2 != 0) {
            // Hvis n er større end 2 og et ulige tal, kaldes talN rekursivt med n-1, n-2 og n-3, og resultatet beregnes ved at anvende formel talN(n - 1) + talN(n - 2) + 3 * talN(n - 3)
            return talN(n - 1) + talN(n - 2) + 3 * talN(n - 3);
        } else {
            // Hvis n er mindre end 0 eller hverken et lige eller ulige tal, kastes en IllegalArgumentException
            throw new IllegalArgumentException("Ugyldigt input for n: " + n);
        }
    }
}
