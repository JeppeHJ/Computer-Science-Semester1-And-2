package Opgaver.Opgave7;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class RowAverages {
    public static void main(String[] args) {
        // Opretter en Scanner til at tage brugerinput
        Scanner input = new Scanner(System.in);

        // Spørger brugeren om navnet på filen
        System.out.print("Indtast navnet på filen: ");
        String fileName = input.nextLine();

        // Læser filen
        try {
            // Opretter en ny Scanner til at læse filen
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);

            // Initialiserer en tæller for linjenummer
            int lineNumber = 1;

            // Læser hver linje i filen
            while (fileReader.hasNextLine()) {
                // Læser næste linje og splitter den i tal
                String line = fileReader.nextLine().trim();  // trim fjerner leading/trailing whitespaces
                String[] numbers = line.split("\\s+");

                // Tjekker om linjen er tom
                if (numbers.length == 1 && numbers[0].equals("")) {
                    System.out.println("Linje " + lineNumber + " er tom, gennemsnit er 0");
                } else {
                    // Beregner og printer gennemsnittet for linjen
                    double sum = 0;
                    for (String num : numbers) {
                        sum += Double.parseDouble(num);
                    }
                    double average = sum / numbers.length;
                    System.out.printf("Gennemsnit af linje %d: %.2f\n", lineNumber, average);
                }

                // Incrementerer linjenummeret
                lineNumber++;
            }

            // Lukker fil-læseren
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Filen blev ikke fundet: " + e.getMessage());
        }

        // Lukker input-scanneren
        input.close();
    }
}
