package Opgaver.Opgave8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TotalFletningUdenMaxInteger {
    public static void main(String[] args) {

    }
    public static void fletAlleHeltal(String fileName1, String fileName2, String fileNameNy) {
        try (Scanner scanner1 = new Scanner(new File(fileName1));
             Scanner scanner2 = new Scanner(new File(fileName2));
             PrintWriter writer = new PrintWriter(fileNameNy)) {

            int num1, num2;
            if (scanner1.hasNextInt()) {
                num1 = scanner1.nextInt();
            } else {
                num1 = Integer.MAX_VALUE;
            }

            if (scanner2.hasNextInt()) {
                num2 = scanner2.nextInt();
            } else {
                num2 = Integer.MAX_VALUE;
            }

            // Udfør total fletning af filerne
            while (scanner1.hasNextInt() || scanner2.hasNextInt()) {
                if (num1 <= num2) {
                    writer.println(num1);
                    if (scanner1.hasNextInt()) {
                        num1 = scanner1.nextInt();
                    } else {
                        num1 = Integer.MAX_VALUE;
                    }
                } else {
                    writer.println(num2);
                    if (scanner2.hasNextInt()) {
                        num2 = scanner2.nextInt();
                    } else {
                        num2 = Integer.MAX_VALUE;
                    }
                }
            }

            // Tjek og skriv eventuelle resterende tal
            if(num1 != Integer.MAX_VALUE) writer.println(num1);
            if(num2 != Integer.MAX_VALUE) writer.println(num2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
