package Opgaver.Opg3_DropOut_Stack;

public class LinkedListDropOutStack implements StackI {
    private Node top; // Toppen af stacken
    private int cap; // Kapaciteten af stacken
    private int count; // Antallet af elementer i stacken

    public LinkedListDropOutStack(int antal) {
        this.top = null; // Initialiserer top til null, da der ingen elementer er i stacken endnu
        this.cap = antal; // Sætter kapaciteten for stacken
        this.count = 0; // Initialiserer antallet af elementer til 0
    }

    @Override
    public void push(Object element) {
        Node newNode = new Node(); // Opretter en ny knude
        newNode.data = element; // Sætter knudens data til det angivne element
        newNode.next = top; // Peger knudens next til den nuværende top
        top = newNode; // Opdaterer top til den nye knude

        if (count < cap) { // Hvis antallet af elementer er mindre end kapaciteten
            count++; // Øger antallet af elementer med 1
        } else { // Hvis antallet af elementer er lig med kapaciteten
            Node current = top; // Starter fra top
            while (current.next.next != null) { // Finder næstsidste knude
                current = current.next;
            }
            current.next = null; // Fjerner den sidste knude
        }
    }

    @Override
    public Object pop() {
        if (top == null) { // Hvis stacken er tom
            return null; // Returnerer null
        }
        Node popNode = top; // Gemmer en reference til den tidligere top knude
        top = top.next; // Opdaterer top til den næste knude
        count--; // Formindsker antallet af elementer med 1
        return popNode; // Returnerer den tidligere top knude
    }

    @Override
    public Object peek() {
        if (top == null) { // Hvis stacken er tom
            return null; // Returnerer null
        }
        return top; // Returnerer top knuden
    }

    @Override
    public boolean isEmpty() {
        return count == 0; // Returnerer sand hvis stacken er tom (antallet af elementer er 0)
    }

    @Override
    public int size() {
        return count; // Returnerer antallet af elementer i stacken
    }

    private class Node {
        Node next; // Peger på næste knude
        Object data; // Data gemt i knuden
    }
}
