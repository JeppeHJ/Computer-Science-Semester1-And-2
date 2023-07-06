package Opgaver.Opgave1;

import java.util.ArrayList;
import java.util.Collections;

public class InsertSortedArrayList {
    public static void main(String[] args) {
        // Opret en ArrayList til at gemme kunder
        ArrayList<Customer> kunder = new ArrayList<>();

        // Opret Customer-objekter
        Customer customer1 = new Customer("Smith", "John", 30);
        Customer customer2 = new Customer("Johnson", "Alice", 25);
        Customer customer3 = new Customer("Doe", "Jane", 35);
        Customer customer4 = new Customer("Smith", "Emily", 28);

        // Tilføj Customer-objekter til ArrayList
        kunder.add(customer1);
        kunder.add(customer2);
        kunder.add(customer3);
        kunder.add(customer4);

        // Sorter ArrayList ved hjælp af compareTo-metoden
        Collections.sort(kunder);

        // Udskriv kunderne
        for (Customer customer : kunder) {
            System.out.println(customer.toString());
        }
    }

    /**
     * Indsætter kunde i kunder. Listen kunder er sorteret
     * Krav: kunder er sorteret
     */
    public static void indsætKunde(ArrayList<Customer> kunder, Customer kunde) {
        boolean found = false;
        int i = 0;

        // Find det korrekte indeks til at indsætte kunden ved at sammenligne med eksisterende kunder i listen
        while (!found && i < kunder.size()) {
            if (kunder.get(i).compareTo(kunde) < 0) {
                found = true;
            } else {
                i++;
            }
        }

        // Indsæt kunden på det fundne indeks
        kunder.add(i, kunde);
    }

    // Metode til at indsætte et element (e) i en sorteret ArrayList (list)
    public static void insert(ArrayList<Integer> list, int e) {
        boolean found = false;
        int i = 0;

        // Find det korrekte indeks til at indsætte elementet ved at sammenligne med eksisterende elementer i listen
        while (!found && i < list.size()) {
            if (list.get(i) > e) {
                found = true;
            } else {
                i++;
            }
        }

        // Indsæt elementet på det fundne indeks
        list.add(i, e);
    }
}
