package Materiale.measure;

public class SortMethods {

    // Bubble sort metode til at sortere et array af strenge
    public static void bubbleSort(String[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                // Sammenlign to på hinanden følgende strenge og byt dem, hvis de er i forkert rækkefølge
                if (array[j].compareTo(array[j + 1]) < 0) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    // Hjælpemetode til at bytte to elementer i et array
    private static void swap(String[] list, int i, int j) {
        String temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    // Insertion sort metode til at sortere et array af strenge
    public static void insertionSort(String[] array) {
        for (int i = 1; i < array.length; i++) {
            String next = array[i];
            int j = i;
            boolean found = false;
            while (!found && j > 0) {
                // Find det rigtige sted at indsætte den næste streng ved at sammenligne med tidligere strenge
                if (next.compareTo(array[j - 1]) < 0) {
                    found = true;
                } else {
                    array[j] = array[j - 1];
                    j--;
                }
            }
            array[j] = next;
        }
    }

    // Selection sort metode til at sortere et array af strenge
    public static void selectionSort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < array.length; j++) {
                // Find den mindste streng i det uordnede område af arrayet
                if (array[j].compareTo(array[minPos]) > 0) {
                    minPos = j;
                }
            }

            // Byt den mindste streng med den aktuelle position
            swap(array, i, minPos);
        }
    }
}