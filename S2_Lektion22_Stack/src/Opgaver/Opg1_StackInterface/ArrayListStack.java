package Opgaver.Opg1_StackInterface;

import java.util.NoSuchElementException;

public class ArrayListStack implements StackI {
    private Object[] stack; // Array til at gemme elementerne i stacken
    private int top; // Indeks for det øverste element i stacken

    public ArrayListStack(int antal) {
        this.stack = new Object[antal]; // Opretter et nyt array med den angivne kapacitet
        this.top = -1; // Initialiserer top til -1, da der ingen elementer er i stacken endnu
    }

    @Override
    public void push(Object element) {
        growIfNeccassary(); // Udvider arrayet, hvis det er nødvendigt
        top++; // Øger top med 1 for at placere det nye element på den nye top-position
        stack[top] = element; // Tilføjer det nye element til stacken
    }

    private void growIfNeccassary() {
        if (top + 1 == stack.length) { // Tjekker om stacken er fyldt, og der er behov for at udvide den
            Object[] newElements = new Object[stack.length * 2]; // Opretter et nyt array med dobbelt kapacitet
            for (int i = 0; i < stack.length; i++) {
                newElements[i] = stack[i]; // Kopierer elementerne fra det gamle array til det nye array
            }
            stack = newElements; // Erstatter det gamle array med det nye array
        }
    }

    @Override
    public Object pop() {
        if (top < 0) { // Tjekker om stacken er tom, og der ikke er noget element at fjerne
            throw new NoSuchElementException(); // Kaster en NoSuchElementException, da stacken er tom
        }
        Object object = stack[top]; // Gemmer det øverste element i en variabel
        stack[top] = null; // Fjerner referencen til det øverste element i stacken
        top--; // Formindsker top med 1 for at pege på det næstøverste element
        return object; // Returnerer det fjernede element
    }

    @Override
    public Object peek() {
        if (top < 0) { // Tjekker om stacken er tom, og der ikke er noget element at kigge på
            throw new NoSuchElementException(); // Kaster en NoSuchElementException, da stacken er tom
        }
        return stack[top]; // Returnerer det øverste element uden at fjerne det
    }

    @Override
    public boolean isEmpty() {
        return top < 0; // Returnerer sand hvis stacken er tom (top er mindre end 0)
    }

    @Override
    public int size() {
        return top + 1; // Returnerer antallet af elementer i stacken (top + 1)
    }
}
