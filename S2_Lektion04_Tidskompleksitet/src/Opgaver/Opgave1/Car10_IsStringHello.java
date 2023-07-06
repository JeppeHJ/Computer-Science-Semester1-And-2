package Opgaver.Opgave1;

public class Car10_IsStringHello {
    public static void main(String[] args) {
        // Tidskompleksiteten i praksis er O(1), fordi den maksimale mængde af operationer er 5, da "Hello" har 5 chars
        // "equals" virker ved at sammenligne char for char
        // Men generelt for streng sammenligning, så vil det være O(n) pga variation i størrelser
    }
    boolean IsStringHello (String string) {
        if (string.equals("Hello")) {
            return true;
        }
        return false;
    }
}
