package Opgaver.Opgave5;

public class RekursivBinomialKoefficient {
    public static void main(String[] args) {

    }

    // Denne metode beregner binomialkoefficienten (n over m) rekursivt.
    public static int binomial(int n, int m) {
        int result = 0;

        if (m == 0) {
            return 1; // Hvis m er 0, er resultatet 1, da der kun er én måde at vælge 0 elementer ud af n.
        } else if (m == n) {
            return 1; // Hvis m er lig med n, er resultatet 1, da der kun er én måde at vælge alle n elementer ud af n.
        } else {
            // Den generelle rekursive formel er binomial(n, m) = binomial(n-1, m) + binomial(n-1, m-1).
            // Dette repræsenterer at vælge m elementer ud af n ved enten at inkludere det sidste element eller ej.
            // De to rekursive kald beregner værdien af binomialkoefficienten for henholdsvis n-1 og m-1 og n-1 og m.
            return binomial(n-1, m) + binomial(n-1, m-1);
        }
    }
}
