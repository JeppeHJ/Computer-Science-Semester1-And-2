package Opgaver.Opgave5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputSkrivTilFil {
    public static void main(String[] args) {
        // Opretter et File-objekt til den ønskede fil
        File file = new File("C:\\Users\\jeppe\\IdeaProjects\\EksamenProgrammering\\Lektion33_Exceptions_Files\\src\\Opgaver\\Opgave5\\Data.txt");
        boolean gameOn = true; // Variabel til at styre om spillet kører eller er slut

        try (PrintWriter out = new PrintWriter(file)) { // Opretter en PrintWriter til at skrive til filen
            Scanner input = new Scanner(System.in); // Opretter en Scanner til at læse brugerinput

            while (gameOn) {
                // Læser et heltal fra brugeren
                int inputText = Integer.parseInt(input.nextLine());

                if (inputText < 0) {
                    gameOn = false; // Hvis det indtastede tal er negativt, stoppes spillet
                } else {
                    System.out.println("Skrev " + inputText + " til filen");
                    out.println(inputText); // Skriver det indtastede tal til filen
                    out.flush(); // Tømmer bufferen og sikrer, at dataene skrives til filen
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fil ikke fundet: " + e.getMessage()); // Håndterer fejlen, hvis filen ikke findes
        } catch (InputMismatchException e) {
            System.out.println("Forkert input: " + e.getMessage()); // Håndterer fejlen, hvis inputtet ikke er et heltal
            System.out.println("Prøv igen");
        } catch (NumberFormatException e) {
            System.out.println("Forkert input: " + e.getMessage()); // Håndterer fejlen, hvis inputtet ikke kan parses til et heltal
        }
    }
}
