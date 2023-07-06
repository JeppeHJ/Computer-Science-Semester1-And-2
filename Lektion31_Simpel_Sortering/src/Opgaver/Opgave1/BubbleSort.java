package Opgaver.Opgave1;

public class BubbleSort {
    public static void main(String[] args) {
        // Main-metode er tom, da dette er et eksempel og ikke udfører nogen handlinger direkte.
    }

    /**
     * Sorterer en given array af strenge ved hjælp af bubble sort-algoritmen.
     *
     * @param names Array af strenge, der skal sorteres.
     */
    public void bubbleSort(String[] names) {
        for (int i = names.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                // Sammenligner hvert element med dets næste element
                if (names[j].compareTo(names[j + 1]) < 0) {
                    swap(names, j, j + 1); // Bytter positionen for de to elementer
                }
            }
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
}
