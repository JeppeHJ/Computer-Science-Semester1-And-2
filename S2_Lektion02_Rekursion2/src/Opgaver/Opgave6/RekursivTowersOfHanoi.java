package Opgaver.Opgave6;

public class RekursivTowersOfHanoi {
    private static int moveCount = 0; // Variabel til at tælle antallet af træk

    public static void main(String[] args) {
        flyt(4, 1, 3);
    }

    // Denne metode udfører Towers of Hanoi-algoritmen rekursivt.
    // Den flytter n skiver fra stangen "fra" til stangen "til", mens den bruger en midlertidig stang.
    public static void flyt(int n, int fra, int til) {
        if (n == 1) {
            System.out.println("Flyt fra " + fra + " til " + til);
            moveCount++; // Tæl trækket med hver gang en skive flyttes
        } else {
            int temp = 6 - fra - til; // Beregn nummeret på den midlertidige stang (6 er summen af stangnumrene 1, 2 og 3)
            flyt(n - 1, fra, temp); // Flyt de første n-1 skiver fra "fra" til den midlertidige stang
            System.out.println("Flyt fra " + fra + " til " + til);
            moveCount++; // Tæl trækket med hver gang en skive flyttes
            flyt(n - 1, temp, til); // Flyt de n-1 skiver fra den midlertidige stang til "til"
        }
    }
}
