package Opgaver.Opgave2;

import java.util.ArrayList;

public class SelectionSort {
    public static void main(String[] args) {
        // Main-metode er tom, da dette er et eksempel og ikke udfører nogen handlinger direkte.
    }

    /**
     * Sorterer en given array af strenge ved hjælp af selection sort-algoritmen.
     *
     * @param list Array af strenge, der skal sorteres.
     */
    public void selectionSortArray(String[] list) {
        for (int i = 0; i < list.length; i++) {
            int minPos = i; // Indeks for det mindste element i den ubearbejdede del af listen
            for (int j = i + 1; j < list.length; j++) {
                // Sammenligner hvert element med det aktuelle mindste element
                if (list[j].compareTo(list[minPos]) < 0) {
                    minPos = j; // Opdaterer indekset for det mindste element
                }
            }
            swap(list, i, minPos); // Bytter det mindste element med det første element i den ubearbejdede del af listen
        }
    }

    /**
     * Swapper to elementer i en array af strenge.
     *
     * @param list Array, hvor elementerne skal swappes.
     * @param i    Indeks for det første element.
     * @param j    Indeks for det andet element.
     */
    private static void swap(String[] list, int i, int j) {
        String temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    /**
     * Sorterer en given ArrayList af Customer-objekter ved hjælp af selection sort-algoritmen.
     *
     * @param list ArrayList af Customer-objekter, der skal sorteres.
     */
    public void selectionSortArrayList(ArrayList<Customer> list) {
        for (int i = 0; i < list.size(); i++) {
            int minPos = i; // Indeks for det mindste element i den ubearbejdede del af listen
            for (int j = i + 1; j < list.size(); j++) {
                // Sammenligner hvert objekt med det aktuelle mindste element
                if (list.get(j).compareTo(list.get(minPos)) < 0) {
                    minPos = j; // Opdaterer indekset for det mindste element
                }
            }
            swap(list, i, minPos); // Bytter det mindste element med det første element i den ubearbejdede del af listen
        }
    }

    /**
     * Swapper to elementer i en ArrayList af Customer-objekter.
     *
     * @param list ArrayList, hvor elementerne skal swappes.
     * @param i    Indeks for det første element.
     * @param j    Indeks for det andet element.
     */
    private static void swap(ArrayList<Customer> list, int i, int j) {
        Customer temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
