package Materiale.collections;

import java.util.*;

public class TestMetoder {

    public static void main(String[] args) {

        Set<String> s = new HashSet<>(); // Opretter et HashSet-objekt af typen String med navnet 's'
        // Set<String> s = new TreeSet<>(); // Hvis du vil bruge TreeSet i stedet for HashSet, skal denne linje bruges i stedet
        s.add("Jan"); // Tilføjer "Jan" til sættet 's'
        s.add("Jens"); // Tilføjer "Jens" til sættet 's'
        s.add("Keld"); // Tilføjer "Keld" til sættet 's'
        s.add("Børge"); // Tilføjer "Børge" til sættet 's'
        s.add("Henry"); // Tilføjer "Henry" til sættet 's'
        s.add("Frank"); // Tilføjer "Frank" til sættet 's'
        System.out.println(s); // Udskriver sættet 's' (alle elementerne)
        System.out.println(s.size()); // Udskriver størrelsen af sættet 's' (antal elementer)
        s.add("Keld"); // Tilføjer "Keld" igen til sættet 's' (dette vil ikke have nogen effekt, da sættet ikke tillader duplikater)
        System.out.println(s.size()); // Udskriver størrelsen af sættet 's' igen
        System.out.println(s.contains("Jauns")); // Tjekker om sættet 's' indeholder "Jauns" og udskriver resultatet (false)
        System.out.println(s.contains("Jan")); // Tjekker om sættet 's' indeholder "Jan" og udskriver resultatet (true)
        s.remove("Jan"); // Fjerner "Jan" fra sættet 's'
        System.out.println(Metoder.count(s, 5)); // Kalder Metoder.count-metoden og udskriver antallet af elementer i sættet 's' med længden 5 (0)
        System.out.println(Metoder.count2(s, 5)); // Kalder Metoder.count2-metoden og udskriver antallet af elementer i sættet 's' med længden 5 (0)


        // List<String> l = new ArrayList<String>(); // Opretter en ArrayList af typen String med navnet 'l'
        List<String> l = new LinkedList<String>(); // Hvis du vil bruge LinkedList i stedet for ArrayList, skal denne linje bruges i stedet
        l.add("Jan"); // Tilføjer "Jan" til listen 'l'
        l.add("Jensen"); // Tilføjer "Jensen" til listen 'l'
        l.add("Keld"); // Tilføjer "Keld" til listen 'l'
        l.add(1, "Børge"); // Tilføjer "Børge" på indeks 1 i listen 'l' (flytter elementer efterfølgende)
        l.add("Baerge"); // Tilføjer "Baerge" til listen 'l'
        l.add("Henry"); // Tilføjer "Henry" til listen 'l'
        l.set(0, "Frank"); // Erstatter elementet på indeks 0 med "Frank" i listen 'l'
        // System.out.println(l); // Udskriver listen 'l'
        // System.out.println();
        // System.out.println(Metoder.found(l, "Jens")); // Kalder Metoder.found-metoden og udskriver indekset, hvor "Jens" er fundet i listen 'l' (2)
        // System.out.println(Metoder.found(l, "Janus")); // Kalder Metoder.found-metoden og udskriver indekset, hvor "Janus" er fundet i listen 'l' (-1)


        Map<Character, Integer> m = new TreeMap<Character, Integer>(); // Opretter et TreeMap-objekt med typen Character som nøgle og Integer som værdi med navnet 'm'
        // Map<Character, Integer> m = new HashMap<>(); // Hvis du vil bruge HashMap i stedet for TreeMap, skal denne linje bruges i stedet

        String tekst = "margrethe mosbaek dybdahl"; // Opretter en tekststreng med værdien "margrethe mosbaek dybdahl"
        for (int i = 0; i < tekst.length(); i++) {
            char key = tekst.charAt(i); // Henter karakteren på position 'i' i teksten og gemmer den i variablen 'key'
            int value = 0; // Initialiserer en variabel 'value' til 0

            if (m.containsKey(key)) {
                value = m.get(key); // Hvis nøglen 'key' allerede findes i mappet 'm', hentes værdien og gemmes i 'value'
            }

            value++; // Øger værdien af 'value' med 1
            m.put(key, value); // Tilføjer eller opdaterer nøglen 'key' med den nye værdi 'value' i mappet 'm'
        }

        // System.out.println(m); // Udskriver mappet 'm'
    }
}
