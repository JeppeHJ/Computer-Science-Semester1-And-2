package Opgaver.Opg4_Cirkulaer_LinkedList;

import java.util.Random;

// Klasse for Cirkulærliste
class CircularList implements DequeI {
    Node head;  // starten af listen
    int size;  // størrelsen på listen

    public CircularList() {
        this.head = null;  // listen starter som tom
        this.size = 0;  // størrelsen er 0 i starten
    }

    // Kontrollerer om listen er tom
    @Override
    public boolean isEmpty() {
        return size == 0;  // returnerer true, hvis størrelsen er 0, ellers false
    }

    // Tilføjer en person i starten af listen
    @Override
    public void addFirst(Object newElement) {
        Node newNode = new Node((Person)newElement);  // opretter en ny node med det nye element
        if (isEmpty()) {  // hvis listen er tom
            head = newNode;  // sætter head til at være den nye node
            head.next = head;  // head peger på sig selv, da det er den eneste node i listen
        } else {  // hvis listen ikke er tom
            Node temp = head;  // temp bruges til at iterere gennem listen
            while (temp.next != head) {  // går gennem listen, indtil den når til sidste node
                temp = temp.next;
            }
            temp.next = newNode;  // tilføjer den nye node i slutningen af listen
            newNode.next = head;  // den nye node peger på head, så listen er cirkulær
            head = newNode;  // sætter head til at være den nye node
        }
        size++;  // forøger størrelsen med 1
    }

    // Tilføjer en person i slutningen af listen
    @Override
    public void addLast(Object newElement) {
        Node newNode = new Node((Person)newElement);  // opretter en ny node med det nye element
        if (isEmpty()) {  // hvis listen er tom
            addFirst(newElement);  // bruger addFirst til at tilføje noden
        } else {  // hvis listen ikke er tom
            Node temp = head;  // temp bruges til at iterere gennem listen
            while (temp.next != head) {  // går gennem listen, indtil den når til sidste node
                temp = temp.next;
            }
            temp.next = newNode;  // tilføjer den nye node i slutningen af listen
            newNode.next = head;  // den nye node peger på head, så listen er cirkulær
            size++;  // forøger størrelsen med 1
        }
    }

    // Fjerner en person fra starten af listen
    @Override
    public Object removeFirst() {
        if (isEmpty()) {  // hvis listen er tom
            return null;  // returnerer null, da der ikke er noget at fjerne
        } else {  // hvis listen ikke er tom
            Node removedNode = head;  // gemmer head i removedNode, så vi kan returnere den senere
            Node temp = head;  // temp bruges til at iterere gennem listen
            while (temp.next != head) {  // går gennem listen, indtil den når til sidste node
                temp = temp.next;
            }
            temp.next = head.next;  // sætter sidste nodes next til at være head's next
            head = head.next;  // sætter head til at være head's next
            size--;  // reducerer størrelsen med 1
            return removedNode.data;  // returnerer den fjernede nodes data
        }
    }

    // Ikke implementeret, da det ikke er nødvendigt for opgaven
    @Override
    public Object removeLast() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // Returnerer dataen for den første node i listen
    @Override
    public Object getFirst() {
        if (isEmpty()) {  // hvis listen er tom
            return null;  // returnerer null, da der ikke er nogen nodes i listen
        } else {  // hvis listen ikke er tom
            return head.data;  // returnerer dataen for head
        }
    }

    // Ikke implementeret, da det ikke er nødvendigt for opgaven
    @Override
    public Object getLast() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // Returnerer størrelsen på listen
    @Override
    public int size() {
        return size;  // returnerer størrelsen
    }

    // Vælger en tilfældig node som start
    public void randomStart() {
        Random rand = new Random();  // opretter et Random objekt
        int start = rand.nextInt(size);  // genererer et tilfældigt tal mellem 0 og størrelsen
        for (int i = 0; i < start; i++) {  // går gennem listen for at finde den startende node
            head = head.next;
        }
    }

    // Fjerner en node fra listen, der er count pladser fra start
    public Person remove(int count) {
        for (int i = 0; i < count - 1; i++) {  // går gennem listen for at finde den node, der skal fjernes
            head = head.next;
        }
        return (Person)removeFirst();  // fjerner noden og returnerer den fjernede nodes data
    }

    class Node {
        Person data;  // dataen for noden
        Node next;  // pejer på den næste node i listen

        public Node(Person data) {
            this.data = data;  // sætter dataen for noden
        }
    }
}
