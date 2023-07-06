package Opgaver.Opgave2;


import org.w3c.dom.Node;

public class Main {
    public static void main(String[] args) {
        SortedLinkedList list = new SortedLinkedList();

        // Tilføj elementer til listen
        list.addElement("banana");
        list.addElement("apple");
        list.addElement("grape");
        list.addElement("orange");

        // Udskriv elementerne i listen
        System.out.println("Elementer i listen:");
        list.udskrivElements();

        // Antallet af elementer i listen
        int count = list.countElements();
        System.out.println("Antal elementer i listen: " + count);

        // Fjern det sidste element
        boolean removedLast = list.removeLast();
        System.out.println("Sidste element fjernet: " + removedLast);

        // Fjern et element
        boolean removedElement = list.removeElement("apple");
        System.out.println("Elementet 'apple' fjernet: " + removedElement);

        // Udskriv elementerne i listen efter fjernelse
        System.out.println("Elementer i listen efter fjernelse:");
        list.udskrivElements();
    }
}
