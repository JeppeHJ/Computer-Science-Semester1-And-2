package Opgaver.Opgave1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerPrimtal {
    public static void main(String[] args) {
        int[] prim = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29}; // Array med de første 10 primtal

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Hvilket nr. primtal skal vises?: ");
            int n = scan.nextInt(); // Læser et heltal fra brugeren
            System.out.println("Primtal nr. " + n + " er " + prim[n - 1] + "\n"); // Udskriver det n-te primtal ved at bruge det som indeks i arrayet
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage()); // Håndterer fejlen, hvis brugeren indtaster et tal uden for arrayets gyldige indeksområde
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage()); // Håndterer fejlen, hvis brugeren indtaster noget, der ikke kan parses til et heltal
        }
    }
}
