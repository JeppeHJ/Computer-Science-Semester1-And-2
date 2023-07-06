package Opgaver.Opgave3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class UdskrivOmvendtRækkefølgeArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> tal = new ArrayList<>(); // Opretter en ArrayList til at gemme talene

        File file = new File("C:\\Users\\jeppe\\IdeaProjects\\EksamenProgrammering\\Lektion33_Exceptions_Files\\src\\Materiale\\filer\\Data.txt");
        try {
            Scanner in = new Scanner(file); // Opretter en Scanner til at læse fra filen
            while (in.hasNextInt()) {
                tal.add(in.nextInt()); // Læser tal fra filen og tilføjer dem til ArrayListen
            }
        } catch (FileNotFoundException e) {
            System.out.println("Filen blev ikke fundet: " + e.getMessage()); // Håndterer fejlen, hvis filen ikke findes
        } catch (NoSuchElementException e) {
            System.out.println("Der er ikke flere tal i filen: " + e.getMessage()); // Håndterer fejlen, hvis der ikke er flere tal i filen
        } catch (Exception e) {
            System.out.println("En ukendt fejl opstod: " + e.getMessage()); // Håndterer andre ukendte fejl
        }

        // Udskriver tallene i omvendt rækkefølge ved at starte fra det sidste element i ArrayListen
        for (int i = tal.size() - 1; i >= 0; i--) {
            System.out.println(tal.get(i));
        }
    }
}
