package Opgaver.Opgave6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FindMaxIntFil {
    public static void main(String[] args) {
        try {
            System.out.println(min("tal1.txt")); // Kalder metoden "min" og udskriver resultatet
        } catch (IOException e) {
            System.out.println("Fil ikke fundet " + e.getMessage());
        }
    }

    // Metode til at finde det største tal i en fil
    public static int max(String filename) throws IOException {
        File file = new File(filename); // Opretter et nyt File-objekt med filnavnet
        Scanner in = new Scanner(file); // Opretter en Scanner til at læse fra filen
        int max = 0; // Variabel til at gemme det største tal

        // Læser tal fra filen indtil der ikke er flere tal
        while (in.hasNextInt()) {
            int current = in.nextInt(); // Læser næste tal fra filen

            // Hvis det nuværende tal er større end det hidtil største tal, opdateres max
            if (current > max) {
                max = current;
            }
        }

        in.close(); // Lukker Scanneren
        return max; // Returnerer det største tal
    }

    // Metode til at finde det mindste tal i en fil
    public static int min(String filename) throws IOException {
        File file = new File(filename); // Opretter et nyt File-objekt med filnavnet
        Scanner in = new Scanner(file); // Opretter en Scanner til at læse fra filen
        int min = Integer.MAX_VALUE; // Variabel til at gemme det mindste tal, initialiseres med den største mulige værdi for en int

        // Læser tal fra filen indtil der ikke er flere tal
        while (in.hasNextInt()) {
            int current = in.nextInt(); // Læser næste tal fra filen

            // Hvis det nuværende tal er mindre end det hidtil mindste tal, opdateres min
            if (current < min) {
                min = current;
            }
        }

        in.close(); // Lukker Scanneren
        return min; // Returnerer det mindste tal
    }

    // Metode til at beregne gennemsnittet af tal i en fil
    public static double avg(String filename) throws IOException {
        File file = new File(filename); // Opretter et nyt File-objekt med filnavnet
        Scanner in = new Scanner(file); // Opretter en Scanner til at læse fra filen
        int sum = 0; // Variabel til at gemme summen af tal
        int count = 0; // Variabel til at tælle antallet af tal i filen

        // Læser tal fra filen indtil der ikke er flere tal
        while (in.hasNextInt()) {
            int current = in.nextInt(); // Læser næste tal fra filen
            sum += current; // Lægger det nuværende tal til summen
            count++; // Tæller antallet af tal op
        }

        in.close(); // Lukker Scanneren

        // Beregner gennemsnittet ved at dividere summen med antallet af tal
        return 1.0 * sum / count;
    }
}
