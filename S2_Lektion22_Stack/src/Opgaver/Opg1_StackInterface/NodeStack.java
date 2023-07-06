package Opgaver.Opg1_StackInterface;

import java.util.NoSuchElementException;

/**
 * En implementering af en stack som en sekvens af knuder (noder).
 */
public class NodeStack implements StackI {
	private Node top; // Toppen af stacken

	/**
	 * Konstruerer en tom stack.
	 */
	public NodeStack() {
		top = null; // Sætter top til null, da der ingen elementer er i stacken endnu
	}

	/**
	 * Tilføjer et element øverst på stacken.
	 *
	 * @param element elementet der skal tilføjes
	 */
	@Override
	public void push(Object element) {
		Node newNode = new Node(); // Opretter en ny knude
		newNode.data = element; // Sætter knudens data til det angivne element
		newNode.next = top; // Indsætter knuden som den nye top ved at sætte dens "next" til den nuværende top
		top = newNode; // Opdaterer top til den nye knude
	}

	/**
	 * Fjerner elementet øverst på stacken.
	 *
	 * @return det fjernede element
	 */
	@Override
	public Object pop() {
		if (top == null) { // Tjekker om stacken er tom, og der ikke er noget element at fjerne
			throw new NoSuchElementException(); // Kaster en NoSuchElementException, da stacken er tom
		}
		Object element = top.data; // Gemmer det øverste elements data i en variabel
		top = top.next; // Opdaterer top til den næste knude i stacken (fjerner det øverste element)
		return element; // Returnerer det fjernede element
	}

	/**
	 * Returnerer elementet øverst på stacken uden at fjerne det. Stacken forbliver uændret.
	 *
	 * @return elementet øverst på stacken
	 */
	@Override
	public Object peek() {
		if (top == null) { // Tjekker om stacken er tom, og der ikke er noget element at kigge på
			throw new NoSuchElementException(); // Kaster en NoSuchElementException, da stacken er tom
		}
		return top.data; // Returnerer det øverste elements data uden at fjerne det
	}

	/**
	 * Antallet af elementer på stacken.
	 *
	 * @return antallet af elementer på stacken
	 */
	@Override
	public int size() {
		int count = 0; // Tæller til at holde styr på antallet af elementer
		Node temp = top; // Midlertidig reference til knuderne i stacken
		while (temp != null) { // Gennemløber alle knuder i stacken
			count++; // Øger tælleren for hvert element
			temp = temp.next; // Går til næste knude
		}
		return count; // Returnerer antallet af elementer i stacken
	}

	/**
	 * Tjekker om stacken er tom.
	 *
	 * @return true hvis stacken er tom
	 */
	@Override
	public boolean isEmpty() {
		return top == null; // Returnerer sand hvis stacken er tom (top er null)
	}

	/**
	 * En indre klasse til at repræsentere en knude (node) i stacken.
	 */
	class Node {
		public Object data; // Data gemt i knuden
		public Node next; // Reference til den næste knude
	}
}
