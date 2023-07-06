package Opgaver.Opgave2;

public class RekursivPalindrom {
    public static void main(String[] args) {
        String s = "radar";
        System.out.println(palindrom(s));
    }

    // Denne metode tjekker, om en given tekst er et palindrom ved at bruge rekursion.
    public static boolean palindrom(String tekst) {
        return palindrom(tekst, 0, tekst.length() - 1);
    }

    // Denne private hjælpemetode udfører den rekursive palindromtjekning for en given del af teksten.
    private static boolean palindrom(String tekst, int startIndex, int endIndex) {
        // Termineringsregel: Hvis startIndex er større end eller lig med endIndex, er hele teksten gennemgået uden uligheder og er derfor et palindrom.
        if (startIndex >= endIndex) {
            return true;
        } else {
            String first = String.valueOf(tekst.charAt(startIndex)); // Hent karakteren på startIndex-positionen
            String last = String.valueOf(tekst.charAt(endIndex)); // Hent karakteren på endIndex-positionen

            if (first.equals(last)) {
                // Rekurrensregel: Hvis første og sidste karakter er ens, fortsættes palindromtjekningen med at flytte startIndex én position fremad og endIndex én position bagud.
                return palindrom(tekst, startIndex + 1, endIndex - 1);
            }
            return false; // Hvis første og sidste karakter ikke er ens, er teksten ikke et palindrom.
        }
    }
}
