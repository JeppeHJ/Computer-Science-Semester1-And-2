package Opgaver.Opgave1;

import java.util.ArrayList;

public class RekursivLigeTalHjælper {
    public static void main(String[] args) {
        ArrayList<Integer> tal = new ArrayList<>();
        tal.add(7);
        tal.add(5);
        tal.add(2);
        tal.add(3);
        tal.add(7);
        tal.add(8);
        tal.add(12);
        tal.add(13);
        System.out.println(ligeTal(tal));
    }

    // Denne metode tæller antallet af lige tal i en liste ved hjælp af rekursion.
    public static int ligeTal(ArrayList<Integer> list) {
        return ligeTal(list, 0);
    }

    // Denne private hjælpemetode udfører den rekursive tælling af lige tal i en given del af listen.
    private static int ligeTal(ArrayList<Integer> list, int index) {
        if (list.size() == 0) {
            return 0; // Hvis listen er tom, er antallet af lige tal 0.
        } else {
            int result = list.get(index); // Hent tallet på den aktuelle indeksposition
            list.remove(0); // Fjern det første element fra listen

            if (result % 2 == 0) {
                // Hvis tallet er lige, tæl det med og fortsæt den rekursive tælling med den resterende del af listen.
                return 1 + ligeTal(list);
            } else {
                // Hvis tallet er ulige, fortsæt den rekursive tælling med den resterende del af listen uden at tælle det.
                return ligeTal(list);
            }
        }
    }
}
