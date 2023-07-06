package Opgaver.Opgave6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GenerelFletningFiler {
    public static void main(String[] args) {
        generelFletHeltal("tal1.txt","tal2.txt","talfil1.txt");

    }

    public static void generelFletHeltal(String fileName1, String fileName2, String fileNameNy) {
        try (Scanner scanner1 = new Scanner(new File(fileName1));
             Scanner scanner2 = new Scanner(new File(fileName2));
             PrintWriter writer = new PrintWriter(fileNameNy)) {

            // Læs det første heltal fra hver fil
            int num1 = scanner1.nextInt();
            int num2 = scanner2.nextInt();

            // Udfør total fletning af filerne
            while (num1 != Integer.MAX_VALUE && num2 != Integer.MAX_VALUE) {
                // Sammenlign heltallene, hvis de er ens, skriv til filen
                if (num1 == num2) {
                    writer.println(num1);
                    // Hvis der er tal tilbage i begge, da flyt til næste tal for begge
                    if (scanner1.hasNextInt() && scanner2.hasNextInt()) {
                        num1 = scanner1.nextInt();
                        num2 = scanner2.nextInt();
                    }
                    // Hvis tal1 er mindre, gå da videre til næste tal i den fil
                } else if (num1 < num2){
                    num1 = scanner1.nextInt();
                    // Hvis tal2 er mindre, gå da videre til næste tal i den fil
                } else {
                    num2 = scanner2.nextInt();
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
