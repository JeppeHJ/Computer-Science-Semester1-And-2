package Opgaver.Opgave3;

import java.util.ArrayList;

public class InsertionSort {
    public static void main(String[] args) {

    }

    public static void insertioneSort(String[] list) {
        // Sorterer en given liste af strenge i stigende alfabetisk rækkefølge.
        for (int i = 1; i < list.length; i++) {
            // Gå igennem hvert element i listen, starter fra det andet element (indeks 1).
            String next = list[i];
            // Gem værdien af det aktuelle element i variablen "next".
            int j = i;
            // Initialiser variablen "j" til at have samme værdi som "i".
            boolean found = false;
            // Initialiser variablen "found" til at være falsk.
            while (!found && j > 0) {
                // Gentag, indtil vi har fundet den rigtige position for det aktuelle element
                // eller når vi har sammenlignet med alle tidligere elementer.
                if (next.compareTo(list[j - 1]) < 0) {
                    // Hvis "next" strengen er mindre end værdien af det forrige element i alfabetisk rækkefølge,
                    // er vi nået til den rigtige position for "next".
                    found = true;
                    // Sæt "found" til sandt for at afslutte løkken.
                } else {
                    list[j] = list[j - 1];
                    // Hvis "next" strengen er større eller lig med værdien af det forrige element,
                    // flytter vi det forrige element en plads frem i listen.
                    j--;
                    // Reducer "j" for at fortsætte sammenligningen med det næste forrige element.
                }
            }
            list[j] = next;
            // Sæt værdien af "next" på den rigtige position i listen.
        }
    }

    public static void insertionSortArrayList(ArrayList<Customer> list) {
        for (int i = 1; i < list.size(); i++) {
            Customer next = list.get(i);
            int j = i;
            boolean found = false;
            while (!found && j > 0) {
                if (next.compareTo(list.get(j - 1)) < 0) {
                    found = true;
                } else {
                    list.set(j, list.get(j - 1));
                    j--;
                }
            }
            list.set(j, next);
        }
    }




}
