package Opgaver.Opgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SkrivTilFilMedTal {
    public static void main(String[] args) {
        try (PrintWriter out = new PrintWriter("Data.txt")) { // Opretter en PrintWriter til at skrive til filen
            for (int i = 0; i < 100; i++) {
                if (i % 2 != 0) { // Hvis i er ulige
                    out.println(i); // Skriver tallet til filen
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fil ikke fundet: " + e.getMessage()); // Håndterer fejlen, hvis filen ikke findes
        } catch (SecurityException e) {
            System.out.println("Du har ikke rettigheder: " + e.getMessage()); // Håndterer fejlen, hvis der ikke er tilstrækkelige rettigheder til at oprette filen
        }
    }
}
