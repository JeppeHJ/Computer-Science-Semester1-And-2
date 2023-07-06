package Opgaver.Opgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import java.io.*;
import java.util.*;

public class LæsFilMap {
    public static void main(String[] args) throws IOException {
        // Map til at gemme filmnavnene og deres ratings
        Map<String, List<Integer>> movieRatings = new HashMap<>();

        // Læs filen
        File file = new File("filnavn.txt"); // Opretter en ny File-objekt med filnavnet "filnavn.txt"
        BufferedReader br = new BufferedReader(new FileReader(file)); // Opretter en BufferedReader til at læse filen

        // Spring over den første linje
        br.readLine(); // Læser den første linje og springer over den (forventes at være en overskrift eller lignende)

        String movieName;
        while ((movieName = br.readLine()) != null) {
            // Læs rating linjen
            String ratingStr = br.readLine(); // Læser linjen med vurderingen som en tekststreng
            int rating = Integer.parseInt(ratingStr); // Konverterer tekststrengen til en integer

            // Tilføj ratingen til den rigtige film i mappet
            List<Integer> ratings = movieRatings.getOrDefault(movieName, new ArrayList<>()); // Henter den eksisterende liste af ratings for filmen fra mappet eller opretter en ny liste, hvis den ikke findes
            ratings.add(rating); // Tilføjer den nye rating til listen
            movieRatings.put(movieName, ratings); // Opdaterer mappet med den opdaterede liste af ratings for filmen
        }

        // Gennemgå hvert filmnavn og beregn gennemsnitsrating
        for (Map.Entry<String, List<Integer>> entry : movieRatings.entrySet()) {
            double averageRating = entry.getValue().stream().mapToInt(val -> val).average().orElse(0.0); // Beregner gennemsnitsratingen ved at konvertere listen af ratings til en stream, beregne gennemsnittet og returnere det eller 0.0, hvis listen er tom
            System.out.println(entry.getKey() + ": " + entry.getValue().size() + " karakterer, gennemsnit " + String.format("%.1f", averageRating)); // Udskriver filmnavnet, antallet af ratings og gennemsnittet med en enkelt decimal
        }
    }
}
