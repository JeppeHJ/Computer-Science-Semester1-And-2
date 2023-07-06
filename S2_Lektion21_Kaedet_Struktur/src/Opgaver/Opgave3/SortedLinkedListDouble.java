package Opgaver.Opgave3;

public class SortedLinkedListDouble {

	private Node first;
	private Node last;
	private int size;

	public SortedLinkedListDouble() {
		first = new Node();
		last = new Node();
		first.next = last;
		last.prev = first;
		size = 0;
	}

	/**
	 * Tilføjer e til listen, så listen fortsat er sorteret i henhold til den
	 * naturlige ordning på elementerne
	 */
	public void addElement(String e) {
		Node newNode = new Node();
		newNode.data = e;
		if (first.data == null) {
			newNode.next = null;
			newNode.prev = null;
			first = newNode;
			last = first;
		} else if (first.data.compareTo(newNode.data) >= 0) {
			newNode.next = first;
			newNode.prev = null;
			first.prev = newNode; // Tilføj denne linje
			first = newNode;
		} else {
			Node current = first;
			// Looper indtil listen enten er tom eller der findes en streng, der er større
			while (current.next != last && current.next.data.compareTo(newNode.data) < 0) {
				current = current.next;
			}
			// Enden af listen, derfor skal noden indsættes til sidst
			// -> current -> newNode |
			if (current == null) {
				current = newNode;
				newNode.prev = current;
				newNode.next = null;
			} else {
				// Nu betyder det, at elementet skal indsættes MELLEM 'current' og 'current.next'
				// -> [current] -> [newNode] -> [current.next] ->
				// Gemmer en reference til det element der kommer efter current
				Node nextNode = current.next;
				// Sætter newNode til at være det næste element efter current.
				current.next = newNode;
				// Sætter newNode.next til at være det oprindelige næste element efter current
				newNode.next = nextNode;
				// Sætter newNode.prev til at være current, da newNode nu er indsat efter current
				newNode.prev = current;
				// Opdaterer nextNode.prev til at pege på newNode, da newNode nu er det element der kommer før nextNode
				nextNode.prev = newNode;
			}
			}
		size++;
		}

	public boolean removeElement(String e) {
		boolean removed = false;

		if (first.data == null) {
			// Listen er tom, derfor kan intet fjernes
			return removed;
		} else if (first.data.equals(e)) {
			// Hvis elementet er det første i listen
			first = first.next;
			if (first != null) {
				first.prev = null;
			}
			removed = true;
		} else {
			Node current = first;
			// Så længe listen enten ikke er tom, eller vi ikke har fundet elementet
			while (current != null && !current.data.equals(e)) {
				current = current.next;
			}
			// Elementet blev ikke fundet
			if (current == null) {
				return removed;
			} else {
				// Vi har fundet elementet, og current skal slettes
				// Altså skal vi rette referencer på Noden før og Noden efter
				Node nextNode = current.next;
				Node prevNode = current.prev;
				if (nextNode != null) {
					nextNode.prev = prevNode;
				}
				if (prevNode != null) {
					prevNode.next = nextNode;
				}
				removed = true;
			}
		}
		if (removed) {
			size--;
		}
		return removed;
	}


	/**
	 * Udskriver elementerne fra listen i sorteret rækkefølge 
	 */
	public void udskrivElements() {
		if (first != null) {
			Node current = first;
			while (current != last) {
				System.out.println(current.data);
				current = current.next;
			}
		}
	}

	/**
	 * Udskriver elementerne fra listen i sorteret rækkefølge bagfra
	 */
	public void udskrivBagfra() {
		if (first != null) {
			Node current = last;
			while (current != null) {
				System.out.println(current.data);
				current = current.prev;
			}
		}
	}

	/**
	 * Returnerer antallet af elementer i listen
	 */
	public int countElements() {
		return size;
	}

	// Privat indre klasse der modellerer en node i en dobbeltkædet liste
	class Node {
		public String data;
		public Node next;
		public Node prev;
	}
}
