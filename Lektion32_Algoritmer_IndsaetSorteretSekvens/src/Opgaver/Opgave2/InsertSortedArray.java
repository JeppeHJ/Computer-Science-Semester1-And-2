package Opgaver.Opgave2;

public class InsertSortedArray {
    public static void main(String[] args) {
        // Opret et array med plads til 5 kunder
        Customer[] tabel = new Customer[5];

        // Opret Customer-objekter
        Customer customer1 = new Customer("Smith", "John", 30);
        Customer customer2 = new Customer("Johnson", "Alice", 25);
        Customer customer3 = new Customer("Doe", "Jane", 35);
        Customer customer4 = new Customer("Smith", "Emily", 28);
        Customer customer5 = new Customer("Brown", "David", 40);

        // Indsæt Customer-objekter i arrayet ved hjælp af insert-metoden
        insert(tabel, customer1);
        insert(tabel, customer2);
        insert(tabel, customer3);
        insert(tabel, customer4);
        insert(tabel, customer5);

        // Udskriv kunderne i arrayet
        for (Customer customer : tabel) {
            if (customer != null) {
                System.out.println(customer.toString());
            }
        }
    }

    // Metode til at indsætte en kunde (e) i et sorteret array (tabel) baseret på kundens sammenligningsrækkefølge
    public static void insert(Customer[] tabel, Customer e) {
        int j = tabel.length - 1;

        // Finder den sidste ikke-tomme position i arrayet
        while (j >= 0 && tabel[j] == null) {
            j--;
        }

        // Øger j med 1 for at få den næste ledige position i arrayet
        j++;

        boolean found = false;
        while (!found && j > 0) {
            if (e.compareTo(tabel[j - 1]) < 0) {
                // Hvis den nye kunde skal indsættes før den foregående kunde i arrayet,
                // sættes found til true for at afslutte løkken
                found = true;
            } else {
                // Hvis den nye kunde skal indsættes efter den foregående kunde i arrayet,
                // rykkes den foregående kunde en position ned i arrayet
                tabel[j] = tabel[j - 1];
                j--;
            }
        }

        // Indsætter den nye kunde på den korrekte position i arrayet
        tabel[j] = e;
    }
}
