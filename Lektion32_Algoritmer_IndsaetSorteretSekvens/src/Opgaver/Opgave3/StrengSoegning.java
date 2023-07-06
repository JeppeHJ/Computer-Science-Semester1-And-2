package Opgaver.Opgave3;

public class StrengSoegning {
    public static void main(String[] args) {
        // Eksempel på brug af metoden hasConsecutiveChars med to forskellige input
        System.out.println(hasConsecutiveChars("Jubiiii", 4)); // true
        System.out.println(hasConsecutiveChars("Jubiiii", 5)); // false
    }

    // Metode til at kontrollere, om en streng indeholder en sekvens af ens karakterer med en given længde (k)
    public static boolean hasConsecutiveChars(String s, int k) {
        char previousChar = s.charAt(0);
        int count = 1;

        // Gennemgår strengen fra andet tegn (indeks 1) og op til det sidste tegn
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == previousChar) {
                // Hvis det aktuelle tegn er ens med det foregående tegn, øges tælleren
                count++;
                if (count == k) {
                    // Hvis tælleren når den ønskede længde (k), returneres true
                    return true;
                }
            } else {
                // Hvis det aktuelle tegn er forskelligt fra det foregående tegn, nulstilles tælleren
                previousChar = s.charAt(i);
                count = 1;
            }
        }

        // Hvis der ikke findes en sekvens af ens karakterer med længde k, returneres false
        return false;
    }

    // Metode til at kontrollere, om en delstreng (m) matcher en del af en større streng (sm) på et givet indeks (i)
    private static boolean match(String sm, String m, int i) {
        boolean foundDiff = false;
        int j = 0;

        // Gennemgår hvert tegn i delstrengen (m) og sammenligner det med tilsvarende tegn i den større streng (sm)
        while (!foundDiff && j < m.length()) {
            if (sm.charAt(i + j) != m.charAt(j)) {
                // Hvis der findes en forskel mellem tegnene, sættes foundDiff til true
                foundDiff = true;
            } else {
                // Hvis tegnene er ens, øges tælleren j
                j++;
            }
        }

        // Returnerer true, hvis der ikke blev fundet nogen forskel, ellers false
        return !foundDiff;
    }

    // Metode til at finde indekset af en delstreng (m) i en større streng (sm)
    public static int find(String sm, String m) {
        int indeks = -1;
        int i = 0;

        // Gennemgår den større streng (sm) indtil slutningen minus længden af delstrengen (m)
        while (indeks == -1 && i <= sm.length() - m.length()) {
            if (match(sm, m, i)) {
                // Hvis delstrengen matcher på det aktuelle indeks (i), sættes indeks til i
                indeks = i;
            } else {
                // Hvis der ikke er et match, øges tælleren i
                i++;
            }
        }

        // Returnerer indekset, hvor delstrengen blev fundet, eller -1, hvis den ikke blev fundet
        return indeks;
    }

    // Metoden match har en stavefejl i navnet, så vi laver en kopi af den med det korrekte navn matcsh
    private static boolean matcsh(String sm, String m, int i) {
        boolean foundDiff = false;
        int j = 0;

        // Gennemgår hvert tegn i delstrengen (m) og sammenligner det med tilsvarende tegn i den større streng (sm)
        while (!foundDiff && j < m.length()) {
            if (sm.charAt(i + j) != m.charAt(j)) {
                // Hvis der findes en forskel mellem tegnene, sættes foundDiff til true
                foundDiff = true;
            } else {
                // Hvis tegnene er ens, øges tælleren j
                j++;
            }
        }

        // Returnerer true, hvis der ikke blev fundet nogen forskel, ellers false
        return !foundDiff;
    }
}
