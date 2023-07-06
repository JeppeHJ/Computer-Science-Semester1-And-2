package Opgaver.Opgave7;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class LineNumbering {
    public static void main(String[] args) {
        // Opretter en Scanner til at tage brugerinput
        Scanner input = new Scanner(System.in);

        // Spørger brugeren om navnet på inputfilen
        System.out.print("Indtast navnet på inputfilen: ");
        String inputFileName = input.nextLine();

        // Spørger brugeren om navnet på outputfilen
        System.out.print("Indtast navnet på outputfilen: ");
        String outputFileName = input.nextLine();

        // Læser inputfilen
        try {
            // Opretter en ny Scanner til at læse inputfilen
            File inputFile = new File(inputFileName);
            Scanner fileReader = new Scanner(inputFile);

            // Opretter en PrintWriter til at skrive til outputfilen
            PrintWriter outputFile = new PrintWriter(outputFileName);

            // Læser hver linje i inputfilen
            int lineNumber = 1;  // Initialiserer linjenummeret
            while (fileReader.hasNextLine()) {
                // Læser næste linje og skriver den til outputfilen med linjenummeret
                String line = fileReader.nextLine();
                outputFile.println("/* " + lineNumber + " */ " + line);

                // Incrementerer linjenummeret
                lineNumber++;
            }

            // Lukker Scannere og PrintWriter
            fileReader.close();
            outputFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Filen blev ikke fundet: " + e.getMessage());
        }

        input.close();
    }
}