package Opgaver.Opgave2;

import java.util.ArrayList;

public class RekursivCounter {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(0);
        list1.add(1);
        list1.add(0);
        list1.add(1);

        list1.add(1);
        list1.add(0);
        list1.add(1);
        list1.add(0);
        list1.add(1);

        System.out.println(countAntalletAfZero(list1));
    }

    /**
     * Tæller antallet af nul'er i en liste.
     *
     * @param list listen med tal
     * @return antallet af nul'er i listen
     */
    public static int countAntalletAfZero(ArrayList<Integer> list) {
        return countAntalletAfZero(list, 0, list.size() - 1);
    }

    /**
     * Hjælpefunktion til rekursiv tælling af antallet af nul'er i et delområde af listen.
     *
     * @param list listen med tal
     * @param lav  startindeks for delområdet
     * @param høj  slutindeks for delområdet
     * @return antallet af nul'er i delområdet
     */
    public static int countAntalletAfZero(ArrayList<Integer> list, int lav, int høj) {
        // Termineringsregel
        if (lav == høj) {
            if (list.get(lav) == 0) {
                return 1; // Der er et nul i delområdet
            }
            return 0; // Der er ingen nul i delområdet
        } else {
            int m = (lav + høj) / 2;
            int count1 = countAntalletAfZero(list, lav, m); // Rekursivt kald på venstre halvdel
            int count2 = countAntalletAfZero(list, m + 1, høj); // Rekursivt kald på højre halvdel
            return count1 + count2; // Sammenfletning af resultatet fra de to rekursive kald
        }
        // Tidskompleksitet: TODO: O(n), hvor n er længden af delområdet (h - l + 1). Rekursionen halverer delområdet i hver iteration,
        // indtil der kun er ét element tilbage, hvilket kræver logaritmisk antal iterationer. I hver iteration udføres en konstant mængde arbejde,
        // da der kun er to rekursive kald og en addition. Derfor vil tidskompleksiteten være O(n * log n).
    }
}
