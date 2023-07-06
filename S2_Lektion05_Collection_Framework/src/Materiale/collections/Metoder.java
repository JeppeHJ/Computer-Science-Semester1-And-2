package Materiale.collections;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Metoder {
    // Returnerer indeks hvis tekst findes som del string et sted i list
    public static int found(List<String> list, String tekst) {
        int result = -1; // Initialiserer en variabel 'result' til -1, som indikerer, at teksten ikke blev fundet
        int i = 0; // Initialiserer en tæller 'i' til 0

        // Kører en løkke for hvert element i listen 'list' for at finde teksten
        // Loopet stopper enten når teksten er fundet eller når vi har gennemgået hele listen
        while (result == -1 && i < list.size()) {
            if (list.get(i).indexOf(tekst) > -1) {
                // Hvis teksten er fundet, opdateres 'result' til at være den aktuelle indeksværdi
                result = i;
            } else {
                // Hvis teksten ikke er fundet, fortsætter vi til næste element i listen ved at øge tælleren 'i'
                i++;
            }
        }
        return result; // Returnerer resultatet (indekset) hvor teksten blev fundet, eller -1 hvis den ikke blev fundet
    }

    // Finder antal elementer i s der har længden len
    public static int count2(List<String> s, int len) {
        int antal = 0; // Initialiserer en variabel 'antal' til 0, der holder styr på antallet af elementer med længden 'len'
        for (String tekst : s) {
            // Kører en løkke for hvert element i listen 's' og tjekker længden af ​​hver tekst
            // Hvis længden er lig med 'len', øges 'antal' med 1
            if (tekst.length() == len) {
                antal++;
            }
        }
        return antal; // Returnerer det totale antal elementer med længden 'len' i listen 's'
    }

    // Finder antal elementer i s der har længden len
    public static int count(Collection<String> s, int len) {
        int antal = 0; // Initialiserer en variabel 'antal' til 0, der holder styr på antallet af elementer med længden 'len'
        for (String tekst : s) {
            // Kører en løkke for hvert element i samlingen 's' og tjekker længden af ​​hver tekst
            // Hvis længden er lig med 'len', øges 'antal' med 1
            if (tekst.length() == len) {
                antal++;
            }
        }
        return antal; // Returnerer det totale antal elementer med længden 'len' i samlingen 's'
    }

    public static int count2(Set<String> s, int len) {
        int antal = 0; // Initialiserer en variabel 'antal' til 0, der holder styr på antallet af elementer med længden 'len'
        for (String tekst : s) {
            // Kører en løkke for hvert element i sættet 's' og tjekker længden af ​​hver tekst
            // Hvis længden er lig med 'len', øges 'antal' med 1
            if (tekst.length() == len) {
                antal++;
            }
        }
        return antal; // Returnerer det totale antal elementer med længden 'len' i sættet 's'
    }
}
