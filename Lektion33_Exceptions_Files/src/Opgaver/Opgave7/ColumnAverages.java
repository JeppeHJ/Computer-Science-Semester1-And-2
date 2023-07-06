package Opgaver.Opgave7;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ColumnAverages {
    public static void main(String[] args) {
        // Opretter en Scanner til at tage brugerinput
        Scanner input = new Scanner(System.in);

        // Spørger brugeren om navnet på filen
        System.out.print("Indtast navnet på filen: ");
        String fileName = input.nextLine();

        // Initialiserer variable til at holde sum og antal for hver kolonne
        double sum1 = 0, sum2 = 0;
        int count1 = 0, count2 = 0;

        // Læser filen
        try {
            // Opretter en ny Scanner til at læse filen
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);

            // Læser hver linje i filen
            while (fileReader.hasNextLine()) {
                // Læser næste linje og splitter den i to tal
                // TODO \s = whitespace (mellemrum, tabs, linjeskift
                // TODO Dette tegn betyder, at det foregående udtryk (i dette tilfælde \s) skal matche en eller flere gange. Så \s+ vil matche et eller flere mellemrum.
                // TODO Så split("\\s+") deler strengen op i dele ved ethvert sted, hvor et eller flere mellemrum optræder.
                String[] numbers = fileReader.nextLine().split("\\s+");

                // Lægger de to tal til deres respektive summe og incrementerer tælleren
                sum1 += Double.parseDouble(numbers[0]);
                count1++;

                sum2 += Double.parseDouble(numbers[1]);
                count2++;
            }

            // Beregner og printer gennemsnittet for hver kolonne
            System.out.printf("Gennemsnit af kolonne 1: %.2f\n", sum1 / count1);
            System.out.printf("Gennemsnit af kolonne 2: %.2f\n", sum2 / count2);

            // Lukker fil-læseren
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Filen blev ikke fundet: " + e.getMessage());
        }

        // Lukker input-scanneren
        input.close();
    }
}
