package Opgaver.Opgave8;

import java.io.File;

public class RekursivMappeTraversal {
    public static void main(String[] args) {
        // TODO a) Den første metode ScanDir er en rekursiv metode, der gennemløber en mappestruktur.
        // Den tager en sti som input og udskriver alle undermapper rekursivt ved at kalde sig selv for hver undermappe.
        // Den bruger File-klassen til at oprette et File-objekt for den aktuelle mappe og derefter få en liste over filer
        // og mapper i den pågældende mappe ved hjælp af list()-metoden. Derefter itererer den over listen og kontrollerer,
        // om hvert element er en mappe ved at bruge isDirectory()-metoden fra File-objektet. Hvis et element er en mappe,
        // kaldes ScanDir-metoden rekursivt med den pågældende undermappe som input.
    }

    // Denne metode tæller antallet af mapper i en given sti, inklusive undermapper.
    public static int ScanDirCount(String path) {
        File file = new File(path);
        String[] names = file.list();
        int count = 0;

        for (String name : names) {
            File file2 = new File(path + "/" + name);
            if (file2.isDirectory()) {
                count++; // Tæl den aktuelle mappe
                count += ScanDirCount(path + "/" + name); // Tæl antallet af undermapper rekursivt
            }
        }

        return count;
    }

    // Denne metode gennemløber mappestrukturen og udskriver mapperne på hver niveau.
    public static void ScanDir(String path, int level) {
        StringBuilder sb = new StringBuilder();

        // Tilføj indrykning baseret på rekursionsniveauet
        for (int i = 0; i < level; i++) {
            sb.append("  ");
        }

        sb.append(level).append(": ");
        sb.append("[DIR] ").append(path);
        System.out.println(sb.toString());

        File file = new File(path);
        String[] names = file.list();

        for (String name : names) {
            File file2 = new File(path + "/" + name);
            if (file2.isDirectory()) {
                // Rekursivt kald for at gennemløbe undermappen på næste niveau
                ScanDir(path + "/" + name, level + 1);
            }
        }
    }
}
