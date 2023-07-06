package Opgaver.Opgave1;

public class Car14_RekursivMetode {

    // Første loop kører n - 1 gange LINEÆRT
    // Andet loop kører n - 1 gange LINEÆRT
    // O(n^2)


    public static void method1(int [] array, int n) {
        for (int index = 0; index < n - 1; index++) {
            int mark = privateMethod1(array, index, n- 1);
            int temp = array[index];
            array[index] = array[mark];
            array[mark] = temp;
        }
    }
    public static int privateMethod1(int[] array, int first, int last) {
        int min = array[first];
        int indexOfMin = first;
        for (int index = first + 1; index <= last; index++) {
            if (array[index] < min) {
                min = array[index];
                indexOfMin = index;
            }
        }
        return indexOfMin;
    }
}
