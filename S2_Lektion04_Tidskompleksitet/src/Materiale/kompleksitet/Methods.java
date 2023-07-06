package Materiale.kompleksitet;

public class Methods {

    /**
     * Beregner summen af talene fra 0 til n.
     *
     * @param n et positivt heltal
     * @return summen af talene fra 0 til n
     */
    public int sum(int n) {
        int resultat = 0;
        for (int i = 0; i <= n; i++) {
            resultat = resultat + i;
        }
        return resultat;
        // Tidskompleksitet: O(n), hvor n er værdien af n. For-løkken udføres n+1 gange, hvilket giver lineær tidskompleksitet.
    }

    /**
     * Finder det mindste tal mellem a og b.
     *
     * @param a et heltal
     * @param b et heltal
     * @return det mindste tal mellem a og b
     */
    public int findMin(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
        // Tidskompleksitet: O(1), da der kun udføres en enkelt sammenligning og en betinget returværdi.
    }

    /**
     * Udskriver en n x n matrice med tal.
     *
     * @param n størrelsen af matricen
     */
    public void udskriv1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i * 10 + j + " ");
            }
            System.out.println();
        }
        // Tidskompleksitet: O(n^2), da der bruges to for-løkker, der begge kører n gange.
    }

    /**
     * Udskriver en sekvens af tal, hvor hvert tal er halvdelen af det foregående tal, indtil tallet når 1.
     *
     * @param n startværdien for sekvensen
     */
    public void udskriv2(int n) {
        int i = n;
        while (i >= 1) {
            System.out.println(i);
            i = i / 2;
        }
        // Tidskompleksitet: O(log n), hvor n er værdien af n. While-løkken kører antallet af gange, der svarer til logaritmen af n (grundlag 2).
    }

    /**
     * En kombination af sum-metoden og udskriv1-metoden.
     *
     * @param n et positivt heltal
     * @return summen af talene fra 0 til n
     */
    public int method3(int n) {
        int resultat = 0;
        for (int i = 0; i <= n; i++) {
            resultat = resultat + i;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i * 10 + j + " ");
            }
            System.out.println();
        }
        return resultat;
        // Tidskompleksitet: O(n^2), da der er en for-løkke, der kører n+1 gange og en nested for-løkke, der kører n^2 gange.
    }

    /**
     * En kombination af udskriv2-metoden og sum-metoden.
     *
     * @param n et positivt heltal
     * @return summen af talene fra 0 til n
     */
    public int method4(int n) {
        for (int i = n; i >= 1; i = i / 2) {
            System.out.println(i);
        }
        int resultat = 0;
        for (int i = 0; i <= n; i++) {
            resultat = resultat + i;
        }
        return resultat;
        // Tidskompleksitet: O(log n + n), hvor n er værdien af n. While-løkken kører logaritmisk antal gange af n, og den efterfølgende for-løkke kører n+1 gange.
    }

    /**
     * En kombination af udskriv1-metoden og sum-metoden.
     *
     * @param n et positivt heltal
     * @return summen af talene fra 0 til n
     */
    public int method5(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        int resultat = 0;
        for (int i = 0; i <= n; i++) {
            resultat = resultat + i;
        }
        return resultat;
        // Tidskompleksitet: O(n + n), hvor n er værdien af n. Den første for-løkke kører n gange, og den anden for-løkke kører n+1 gange.
    }

    /**
     * En kombination af udskriv2-metoden, sum-metoden og udskriv1-metoden.
     *
     * @param n et positivt heltal
     * @return summen af talene fra 0 til n
     */
    public int method6(int n) {
        int resultat = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j = j / 2) {
                System.out.println(j);
                resultat = resultat + j;
            }
            System.out.println(i);
        }
        return resultat;
        // Tidskompleksitet: O(n * log n + n^2), hvor n er værdien af n. Den ydre for-løkke kører n gange, den indre for-løkke kører logaritmisk antal gange af n, og udskriv1-metoden kører n^2 gange.
    }

    /**
     * En nested for-løkke, der kører n^3 gange.
     *
     * @param n et positivt heltal
     * @return summen af talene fra 0 til n
     */
    public int method7(int n) {
        int resultat = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    System.out.println(k);
                    resultat = resultat + k;
                }
            }
        }
        return resultat;
        // Tidskompleksitet: O(n^3), hvor n er værdien af n. Der er tre nestede for-løkker, der alle kører n gange.
    }
}
