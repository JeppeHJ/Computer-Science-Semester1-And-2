package Opgaver.Opgave2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FletningArray {
    public static void main(String[] args) {
        // Opretter to arrays af heltal
        int[] l1 = {1, 2, 3, 4, 5, 7, 9};
        int[] l2 = {2, 3, 4, 4, 5, 8, 10};

        // Kalder fællesTal metoden med de to arrays og får et resultat-array
        int[] result = fællesTal(l1, l2);

        // Udskriver resultatet
        System.out.println("Fælles tal:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] fællesTal(int[] l1, int[] l2) {
        // Opretter en liste til at gemme de fælles tal
        List<Integer> nyListe = new ArrayList<>();
        // Initialiserer indeksvariabler til begge arrays
        int i1 = 0;
        int i2 = 0;

        // Kører, indtil vi har gennemgået begge arrays fuldt ud
        while (i1 < l1.length && i2 < l2.length) {
            // Sammenligner de aktuelle elementer fra begge arrays
            if (l1[i1] < l2[i2]) {
                // Hvis elementet i l1 er mindre end elementet i l2, inkrementerer vi i1
                i1++;
            } else if (l1[i1] > l2[i2]) {
                // Hvis elementet i l1 er større end elementet i l2, inkrementerer vi i2
                i2++;
            } else {
                // Hvis elementerne er ens, tilføjer vi det til den nye liste og inkrementerer både i1 og i2
                nyListe.add(l1[i1]);
                i1++;
                i2++;
            }
        }

        // Konverterer nyListe til et almindeligt array
        int[] nyArray = new int[nyListe.size()];
        for (int i = 0; i < nyListe.size(); i++) {
            nyArray[i] = nyListe.get(i);
        }

        // Returnerer det fælles tal array
        return nyArray;
    }
}
