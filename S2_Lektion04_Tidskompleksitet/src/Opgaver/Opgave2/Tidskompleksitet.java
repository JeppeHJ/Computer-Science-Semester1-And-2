package Opgaver.Opgave2;

public class Tidskompleksitet {

    //Første loop kører O(n) gange LINEÆRT
    //Andet loop kører O(log n) gange, da værdien fordobles
    // O(n^2 / 2) = O(n^2)

    // Lad os gå igennem hver iteration af den ydre løkke, når i = 0. Vi skal se på, hvad der sker med j i den indre løkke for n = 10.

    //Initialiser j = 1. Check, om j < 10. Ja, det er det. Øg result med 1.
    //Nu er j = j * 2, så j = 2. Check, om j < 10. Ja, det er det. Øg result med 1.
    //Nu er j = j * 2, så j = 4. Check, om j < 10. Ja, det er det. Øg result med 1.
    //Nu er j = j * 2, så j = 8. Check, om j < 10. Ja, det er det. Øg result med 1.
    //Nu er j = j * 2, så j = 16. Check, om j < 10. Nej, det er det ikke. Den indre løkke stopper her.

    //Så for hver iteration af den ydre løkke, kører den indre løkke 4 gange, ikke 10 gange,
    // hvilket ville være tilfældet, hvis vi gik lineært. Da denne proces gentages for hver iteration af den ydre løkke,
    // og den ydre løkke kører n gange, er det samlede antal operationer 4n i dette eksempel. Generelt vil antallet
    // af operationer være proportional med n log n. Derfor er tidskompleksiteten O(n log n).


    public int method1(int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j  < n; j = j*2) {
                 result++;
            }
        }
        return result;
    }

}
