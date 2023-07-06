package Opgaver.Opgave3;

import java.util.Arrays;

public class prefixAverage {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 5, 6, 4, 9, 8};
        System.out.println(Arrays.toString(prefixAverage(numbers)));
    }

    // Tidskompleksitet O(n), lineært
    public static double[] prefixAverage(int[] inputTal) {
        double[] list = new double[inputTal.length]; // Opretter et nyt array til at gemme prefix-gennemsnittene
        double sum = 0; // Variabel til at beregne den akkumulerede sum af tal
        int count = 0; // Variabel til at tælle antallet af tal
        for (int i = 0; i < inputTal.length; i++) { // Loop gennem hvert tal i inputTal-arrayet
            sum += inputTal[i]; // Tilføj det aktuelle tal til summen
            count++; // Tæl det aktuelle tal
            list[i] = sum / count; // Beregn gennemsnittet ved at dividere summen med antallet og gem det i listen
        }
        return list; // Returner det resulterende array med prefix-gennemsnit
    }

}
