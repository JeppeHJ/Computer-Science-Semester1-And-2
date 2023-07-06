package Opgaver.Opgave3;

import java.util.ArrayList;

public class RekursivBinærSøgning {
    public static void main(String[] args) {

    }

    // Denne metode tjekker, om et target-tal findes i en sorteret liste af tal vha. rekursiv binærsøgning.
    public static boolean checkTal(ArrayList<Integer> sortedListeAfTal, int target) {
        return checkTal(sortedListeAfTal, target, 0, sortedListeAfTal.size() - 1);
    }

    // Denne private hjælpemetode udfører den rekursive binærsøgning for at tjekke, om et target-tal findes i en given del af listen.
    private static boolean checkTal(ArrayList<Integer> sortedListeAfTal, int target, int left, int right) {
        // Termineringsregel: Hvis venstre grænse er større end højre grænse, er target-tallet ikke fundet i den givne del af listen.
        if (left > right) {
            return false;
        } else {
            int middle = (left + right) / 2; // Find midten af den aktuelle del af listen
            int k = sortedListeAfTal.get(middle); // Hent tallet på midtpositionen

            if (k == target) {
                return true; // Hvis midt-tallet er lig med target-tallet, er target-tallet fundet i listen.
            } else if (k < target) {
                // Rekurrensregel: Hvis midt-tallet er mindre end target-tallet, fortsættes søgningen i den venstre del af listen.
                return checkTal(sortedListeAfTal, target, left, middle - 1);
            } else {
                // Rekurrensregel: Hvis midt-tallet er større end target-tallet, fortsættes søgningen i den højre del af listen.
                return checkTal(sortedListeAfTal, target, middle + 1, right);
            }
        }
    }
}
