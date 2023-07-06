package Opgaver.Opgave4;

public class SortedLinkedList {

	private Node first;

	public SortedLinkedList() {
		this.first = null;
	}

	/**
	 * Tilføjer e til listen, så listen fortsat er sorteret i henhold til den
	 * naturlige ordning på elementerne
	 */
	public void addElement(String e) {
		// Opretter en ny node til det nye element
		Node newNode = new Node();
		newNode.data = e;
		// Hvis listen er tom (first er null), indsættes det nye element som det første
		if (first == null) {
			newNode.next = null;
			first = newNode;
		// Hvis det nye element er mindre end det første element i listen, indsæt det før det første element
		} else if (first.data.compareTo(newNode.data) >= 0) {
			newNode.next = first;
			first = newNode;
		} else {
			Node current = first;
			// Itererer gennem listen for at finde det rette sted at indsætte det nye element
			while (current.next != null && current.next.data.compareTo(e) < 0) {
				current = current.next;
			}
			if (current.next == null) {
				current.next = newNode;
				newNode.next = null;
			} else {
				newNode.next = current.next;
				current.next = newNode;

			}
		}
	}


	/**
	 * Udskriver elementerne fra listen i sorteret rækkefølge
	 */
	public void udskrivElements() {
		if (first != null) {
			Node temp = first;
			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}
	
	/**
	 * Returnerer antallet af elementer i listen
	 */
	public int countElements() {
		if (first == null) {
			return 0;
		}
		Node temp = first;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	/**
	 * Fjerner det sidste (altså det største) element i listen. Listen skal fortsat være
	 * sorteret i henhold til den naturlige ordning på elementerne.
	 *
	 * @return true hvis der blev fjernet fra listen ellers returneres false.
	 */
	public boolean removeLast() {
		boolean removed = false; // Variabel til at holde styr på om der blev fjernet en node
		if (first == null) {
			return removed; // Hvis listen er tom, returneres false
		}
		Node temp = first;
		while (temp != null) {
			if (temp.next == null) {
				// Hvis den aktuelle node er den sidste node i listen
				temp = null; // Fjern referencen til den sidste node (fjern den fra listen)
				removed = true; // Indikér at en node blev fjernet
			} else {
				temp = temp.next; // Gå videre til næste node i listen
			}
		}
		return removed; // Returnér om der blev fjernet en node eller ej
	}

	
	/**
	 * Fjerner den første forekomst af e i listen. Listen skal fortsat være
	 * sorteret i henhold til den naturlige ordning på elementerne.
	 *
	 * @return true hvis e blev fjernet fra listen ellers returneres false.
	 */
	public boolean removeElement(String e) {
		boolean removed = false;
		if (first == null) {
			return removed;
		} else if (first.data.equals(e)) {
			first = first.next;
			removed = true;
		} else {
			Node temp = first;
			while (temp.next != null) {
				if (temp.next.data.equals(e)) {
					Node removedNode = temp.next;
					temp.next = temp.next.next;
					removedNode.next = null;
					removed = true;
				} else {
					temp = temp.next;
				}
			}
		}
		return removed;
	}

	public void addAll(SortedLinkedList list) {
		if (list.first != null) {
			Node current = list.first;
			while (current != null) {
				this.addElement(current.data);
				current = current.next;
			}
		}
	}
	// Privat indre klasse der modellerer en node i listen
	private class Node {
		public String data;
		public Node next;
	}
}
