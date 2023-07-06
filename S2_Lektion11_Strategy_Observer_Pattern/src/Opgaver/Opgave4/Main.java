package Opgaver.Opgave4;

public class Main {
    public static void main(String[] args) {
        Kunde kunde1 = new Kunde("Peter", 3);
        Kunde kunde2 = new Kunde("Anna", 1);
        Kunde kunde3 = new Kunde("Michael", 2);

        // Afprøv sammenligning baseret på navn
        kunde1.setComparator(new NavnComparator());
        kunde2.setComparator(new NavnComparator());
        System.out.println("Sammenligning baseret på navn:");
        System.out.println("Kunde1 vs Kunde2: " + kunde1.compareTo(kunde2));  // Should print a positive number
        System.out.println("Kunde2 vs Kunde3: " + kunde2.compareTo(kunde3));  // Should print a negative number

        // Afprøv sammenligning baseret på nummer
        kunde1.setComparator(new NummerComparator());
        kunde2.setComparator(new NummerComparator());
        System.out.println("\nSammenligning baseret på nummer:");
        System.out.println("Kunde1 vs Kunde2: " + kunde1.compareTo(kunde2));  // Should print a positive number
        System.out.println("Kunde2 vs Kunde3: " + kunde2.compareTo(kunde3));  // Should print a negative number
    }
}
