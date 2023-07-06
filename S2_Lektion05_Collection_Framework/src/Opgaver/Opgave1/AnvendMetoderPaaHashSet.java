package Opgaver.Opgave1;

import java.util.HashSet;

public class AnvendMetoderPaaHashSet {
    public static void main(String[] args) {
        // Konstruer et hashSet og tilføj værdierne 34,12,23,45,67,34,98
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(34);
        hashSet.add(12);
        hashSet.add(23);
        hashSet.add(45);
        hashSet.add(67);
        hashSet.add(34);
        hashSet.add(98);

        // Udskriv indholdet af mængden
        System.out.println(hashSet);

        // Indsæt 23 i mængden
        hashSet.add(23);

        // Udskriv indholdet
        System.out.println(hashSet);

        // Fjern 67
        hashSet.remove(67);

        // Udskriv indholdet
        System.out.println(hashSet);

        // Undersøg om settet indeholder elementet 23
        // Det gør det...?

        // Udskriv mængden af elementer i settet
        System.out.println(hashSet.size());

    }


}
