package Opgaver.Opgave4;

public class RekursivAckermann {
    public static void main(String[] args) {
        System.out.println(ackermann(1, 3));
    }

    // Denne metode beregner Ackermann-funktionen rekursivt.
    public static int ackermann(int x, int y) {
        // Termineringsregel
        if (x == 0) {
            return y + 1; // Hvis x er 0, er resultatet y + 1 ifølge Ackermanns termineringsregel.
        } else if (y == 0) {
            // Rekurrensregel #1: Hvis y er 0 og x er ikke-0, kaldes ackermann rekursivt med (x-1, 1).
            return ackermann(x - 1, 1);
        } else {
            // Rekurrensregel #2: Hvis både x og y er ikke-0, kaldes ackermann rekursivt med (x-1, ackermann(x, y-1)).
            return ackermann(x - 1, ackermann(x, y - 1));
        }
    }
}
