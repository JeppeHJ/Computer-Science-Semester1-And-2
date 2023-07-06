package Opgaver.Opgave1;

import java.util.ArrayList;

public class RekursivListSummering {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);

        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);

        System.out.println(RekursivSummering(list1));

    }

    // TODO: Tidskompleksitet: O(n), hvor n er længden af delområdet (h - l + 1). Rekursionen halverer delområdet i hver iteration,
    // indtil der kun er ét element tilbage, hvilket kræver logaritmisk antal iterationer. I hver iteration udføres en konstant mængde arbejde,
    // da der kun er to rekursive kald og en addition. Derfor vil tidskompleksiteten være O(n * log n).

    /**
     * Rekursivt summerer alle tal i en liste.
     *
     * @param list listen med tal
     * @return summen af tallene i listen
     */
    public static int RekursivSummering(ArrayList<Integer> list) {
        return RekursivSummering(list, 0, list.size() - 1);
    }

    /**
     * Hjælpefunktion til rekursiv summering af et delområde i listen.
     *
     * @param list listen med tal
     * @param l    startindeks for delområdet
     * @param h    slutindeks for delområdet
     * @return summen af tallene i delområdet
     */
    public static int RekursivSummering(ArrayList<Integer> list, int l, int h) {
        // Termineringsregel
        if (l == h) {
            return list.get(l);
        } else {
            int m = (l + h) / 2;
            int sum1 = RekursivSummering(list, l, m); // Rekursivt kald på venstre halvdel
            int sum2 = RekursivSummering(list, m + 1, h); // Rekursivt kald på højre halvdel
            return (sum1 + sum2);
        }

    }
}
