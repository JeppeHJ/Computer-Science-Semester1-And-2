package Opgaver.Opg3_DropOut_Stack;

public class DoubleLinkedListDropOutStack implements StackI {
    private Node top; // Toppen af stacken
    private int cap; // Kapaciteten af stacken
    private int size; // Antallet af elementer i stacken
    private Node bottom; // Bundelementet af stacken

    public DoubleLinkedListDropOutStack(int antal) {
        top = null; // Initialiserer top til null, da der ingen elementer er i stacken endnu
        bottom = null; // Initialiserer bunden til null
        cap = antal; // Sætter kapaciteten for stacken
        size = 0; // Initialiserer størrelsen til 0, da stacken er tom
    }

    @Override
    public void push(Object element) {
        Node newNode = new Node(); // Opretter en ny knude
        newNode.data = element; // Sætter knudens data til det angivne element
        if (top == null) { // Hvis stacken er tom
            top = newNode; // Opdaterer top og bund til den nye knude
            bottom = newNode;
            newNode.prev = null; // Da der kun er en knude, er prev og next null
            newNode.next = null;
            size++; // Øger størrelsen med 1
        } else if (!(size >= cap)) { // Hvis stacken ikke er fuld
            Node oldTop = top; // Gemmer en reference til den tidligere top knude
            top = newNode; // Opdaterer top til den nye knude
            top.next = oldTop; // Peger den nye top knudes next til den tidligere top
            oldTop.prev = top; // Peger den tidligere top knudes prev til den nye top
            size++; // Øger størrelsen med 1
        } else { // Hvis stacken er fuld
            Node newBottom = bottom.prev; // Gemmer en reference til den nye bund
            bottom.next = null; // Fjerner referencen fra bundens next
            bottom = newBottom; // Opdaterer bund til den nye bund
            newBottom.next = null; // Fjerner referencen fra den nye bunds next

            Node oldTop = top; // Gemmer en reference til den tidligere top knude
            top = newNode; // Opdaterer top til den nye knude
            top.next = oldTop; // Peger den nye top knudes next til den tidligere top
            top.prev = null; // Da der er en ny knude, er prev null
            oldTop.prev = top; // Peger den tidligere top knudes prev til den nye top
        }
    }

    @Override
    public Object pop() {
        if (size == 0) { // Hvis stacken er tom
            return null; // Returnerer null
        } else if (size == 1) { // Hvis der kun er et element i stacken
            Node oldTop = top; // Gemmer en reference til den tidligere top knude
            top.next = null; // Fjerner referencen fra top knudens next
            top.prev = null; // Fjerner referencen fra top knudens prev
            top = null; // Opdaterer top og bund til null
            bottom = null;
            size--; // Formindsker størrelsen med 1
            return oldTop; // Returnerer den tidligere top knude
        } else { // Hvis der er flere end et element i stacken
            Node oldTop = top; // Gemmer en reference til den tidligere top knude
            Node newTop = top.next; // Gemmer en reference til den nye top knude

            top = newTop; // Opdaterer top til den nye top knude
            top.prev = null; // Fjerner referencen fra den nye top knudes prev
            size--; // Formindsker størrelsen med 1
            return oldTop; // Returnerer den tidligere top knude
        }
    }

    @Override
    public Object peek() {
        if (size == 0) { // Hvis stacken er tom
            return null; // Returnerer null
        } else {
            return top.data; // Returnerer dataen fra top knuden
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0; // Returnerer sand hvis stacken er tom (størrelsen er 0)
    }

    @Override
    public int size() {
        return size; // Returnerer størrelsen af stacken
    }

    private class Node {
        Node next; // Peger på næste knude
        Node prev; // Peger på forrige knude
        Object data; // Data gemt i knuden
    }
}
