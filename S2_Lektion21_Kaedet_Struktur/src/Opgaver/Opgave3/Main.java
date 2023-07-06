package Opgaver.Opgave3;

public class Main {
    public static void main(String[] args) {
        SortedLinkedListDouble list = new SortedLinkedListDouble();

        // Tilføj elementer til listen
        list.addElement("banana");
        list.addElement("apple");
        list.addElement("orange");
        list.addElement("grape");
        list.addElement("kiwi");
        list.addElement("kiwi2");
        list.addElement("kiwi3");
        list.addElement("kiwi4");
        list.addElement("kiwi5");
        list.addElement("kiwi6");
        list.addElement("kiwi7");

        // Udskriv elementerne i sorteret rækkefølge
        System.out.println("Elementer i sorteret rækkefølge:");
        list.udskrivElements();


        // Udskriv elementerne bagfra
        System.out.println("Elementer bagfra:");
        list.udskrivBagfra();

        // Antallet af elementer i listen
        int count = list.countElements();
        System.out.println("Antal elementer: " + count);
    }
}
