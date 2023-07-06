package Opgaver.Opgave3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Spliterator;

public class FletningArrayListOgArray {
    public static void main(String[] args) {
        // Opretter en ArrayList med Customer-objekter
        ArrayList<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Smith", "John", 30));
        customerList.add(new Customer("Johnson", "Alice", 25));
        customerList.add(new Customer("Brown", "David", 40));
        customerList.add(new Customer("Wilson", "Emma", 35));

        // Sorterer listen med Collections.sort
        Collections.sort(customerList);

        // Opretter et Customer-array
        Customer[] badCustomers = {
                new Customer("Smith", "John", 30),
                new Customer("Lee", "Michael", 28)
        };

        // Kalder goodCustomers-metoden med den sorterede ArrayList og Customer-arrayet og udskriver resultatet
        System.out.println(goodCustomers(customerList, badCustomers));
    }

    /**
     * Returnerer en sorteret ArrayList der indeholder alle
     * customers fra l1 der ikke er i l2
     * Krav: l1 og l2 er sorterede, indeholder ikke dubletter og
     * indeholder ikke tomme pladser
     */
    public static ArrayList<Customer> goodCustomers(ArrayList<Customer> l1, Customer[] l2) {
        // Opretter en ny ArrayList til at gemme de gode kunder (kunder, der er i l1, men ikke i l2)
        ArrayList<Customer> goodCustomers = new ArrayList<>();
        // Initialiserer indeksvariabler til begge lister
        int i1 = 0;
        int i2 = 0;

        // Kører, indtil vi har gennemgået begge lister fuldt ud
        while (i1 < l1.size() && i2 < l2.length) {
            // Sammenligner de aktuelle Customer-objekter fra begge lister ved hjælp af compareTo-metoden
            if (l1.get(i1).compareTo(l2[i2]) == 0) {
                // Hvis Customer-objektet i l1 er det samme som Customer-objektet i l2, inkrementerer vi i1
                i1++;
            } else if (l1.get(i1).compareTo(l2[i2]) > 0) {
                // Hvis Customer-objektet i l1 kommer efter Customer-objektet i l2, inkrementerer vi i2
                i2++;
            } else {
                // Hvis Customer-objektet i l1 kommer før Customer-objektet i l2, tilføjer vi det til den nye liste
                goodCustomers.add(l1.get(i1));
                i1++;
            }
        }

        // Hvis der er flere elementer tilbage i l1, tilføjes de til den nye liste
        while (i1 < l1.size()) {
            goodCustomers.add(l1.get(i1));
            i1++;
        }

        // Returnerer den sorteret ArrayList med gode kunder
        return goodCustomers;
    }

}
