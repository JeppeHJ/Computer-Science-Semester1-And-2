package Opgaver.Opgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SøgIFilForHelTal {
    public static void main(String[] args) {
        try {
            // Kalder linFileSearch-metoden og søger efter tallet 2199 i filen "talfil.txt"
            System.out.println(linFileSearch("talfil.txt", 2199));
        } catch (FileNotFoundException e) {
            // Håndterer undtagelsen, hvis filen ikke findes
            System.out.println("Fil ikke fundet: " + e.getMessage());
        }
    }

    public static boolean linFileSearch(String fileName, int target) throws FileNotFoundException {
        // Initialiserer en boolean-variabel til at gemme, om tallet er fundet
        boolean found = false;
        // Opretter en File-objekt med filnavnet
        File file = new File(fileName);

        // Bruger en try-with-resources-blok for at sikre, at Scanner-objektet lukkes automatisk efter brug
        try (Scanner in = new Scanner(file)) {
            // Læser filen linje for linje og undersøger, om den indeholder hel-tallet target
            while (in.hasNextInt() && !found) {
                if (in.nextInt() == target) {
                    found = true;
                }
            }
        }

        // Returnerer true, hvis tallet blev fundet i filen, ellers false
        return found;
    }
}
