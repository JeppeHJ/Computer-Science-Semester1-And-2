package Opgaver.Opgave2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LæsFilPrintDobbelt {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\jeppe\\IdeaProjects\\EksamenProgrammering\\Lektion33_Exceptions_Files\\src\\Materiale\\filer\\Data.txt");
        try {
            Scanner in = new Scanner(file); // Opretter en Scanner til at læse fra filen
            while (in.hasNextInt()) {
                System.out.println(in.nextInt() * 2); // Læser et tal fra filen og udskriver det dobbelte af tallet
            }
        } catch (FileNotFoundException e) {
            System.out.println("Filen blev ikke fundet: " + e.getMessage()); // Håndterer fejlen, hvis filen ikke findes
        } catch (NoSuchElementException e) {
            System.out.println("Der er ikke flere tal i filen: " + e.getMessage()); // Håndterer fejlen, hvis der ikke er flere tal i filen
        } catch (Exception e) {
            System.out.println("En ukendt fejl opstod: " + e.getMessage()); // Håndterer andre ukendte fejl
        }
    }
}
