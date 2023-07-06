package Opgaver.Opgave5;


public class Main {
    public static void main(String[] args) {
        SortedLinkedList list = new SortedLinkedList();
        SortedLinkedList list2 = new SortedLinkedList();
        // Tilføj elementer til listen
        list.addElement("b");
        list.addElement("a");
        list.addElement("g");
        list.addElement("o");

        list2.addElement("e");
        list2.addElement("d");
        list2.addElement("f");
        list2.addElement("o");

        list.addAll(list2);
        // Udskriv elementerne i listen
        System.out.println("Elementer i listen:");
        list.udskrivElements();
    }
}
