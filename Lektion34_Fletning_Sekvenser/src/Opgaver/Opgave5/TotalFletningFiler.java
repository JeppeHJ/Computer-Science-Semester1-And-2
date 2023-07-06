package Opgaver.Opgave5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TotalFletningFiler {
    public static void main(String[] args) {
        fletAlleHeltal("tal1.txt", "tal2.txt", "talfil1.txt");
    }

    /**
     * Laver en sorteret fil i fileNameNy der indeholder alle
     * heltal fra fileName1 og fileName2 (MAX_VALUE skal ikke i
     * resultatet)
     * Krav: filename1 og filename2 er navne på to sorterede filer.
     */
    public static void fletAlleHeltal(String fileName1, String fileName2, String fileNameNy) {
        try (Scanner scanner1 = new Scanner(new File(fileName1));
             Scanner scanner2 = new Scanner(new File(fileName2));
             PrintWriter writer = new PrintWriter(fileNameNy)) {

            // Læs det første heltal fra hver fil
            int num1 = scanner1.nextInt();
            int num2 = scanner2.nextInt();

            // Udfør total fletning af filerne
            while (num1 != Integer.MAX_VALUE && num2 != Integer.MAX_VALUE) {
                // Sammenlign heltallene og skriv det mindste til outputfilen
                if (num1 <= num2) {
                    writer.println(num1);
                    if (scanner1.hasNextInt()) {
                        num1 = scanner1.nextInt();
                    } else {
                        // Hvis der ikke er flere heltal i den første fil, sæt num1 til MAX_VALUE
                        // for at afslutte while-loopet
                        num1 = Integer.MAX_VALUE;
                    }
                } else {
                    writer.println(num2);
                    if (scanner2.hasNextInt()) {
                        num2 = scanner2.nextInt();
                    } else {
                        // Hvis der ikke er flere heltal i den anden fil, sæt num2 til MAX_VALUE
                        // for at afslutte while-loopet
                        num2 = Integer.MAX_VALUE;
                    }
                }
            }

            // Hvis der er flere heltal i den første fil, skriv dem til outputfilen
            while (num1 != Integer.MAX_VALUE) {
                writer.println(num1);
                if (scanner1.hasNextInt()) {
                    num1 = scanner1.nextInt();
                } else {
                    // Hvis der ikke er flere heltal i den første fil, sæt num1 til MAX_VALUE
                    // for at afslutte while-loopet
                    num1 = Integer.MAX_VALUE;
                }
            }

            // Hvis der er flere heltal i den anden fil, skriv dem til outputfilen
            while (num2 != Integer.MAX_VALUE) {
                writer.println(num2);
                if (scanner2.hasNextInt()) {
                    num2 = scanner2.nextInt();
                } else {
                    // Hvis der ikke er flere heltal i den anden fil, sæt num2 til MAX_VALUE
                    // for at afslutte while-loopet
                    num2 = Integer.MAX_VALUE;
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
