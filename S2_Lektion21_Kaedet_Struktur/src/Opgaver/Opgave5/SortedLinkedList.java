// Vi deklarerer en klasse, SortedLinkedList, som håndterer linked lists af type String sorteret i naturlig ordning.
package Opgaver.Opgave5;

public class SortedLinkedList {
	// "first" er en reference til den første node i vores linked list. Den starter som null, fordi vores liste er tom ved initialisering.
	private Node first;

	// Dette er konstruktøren til vores SortedLinkedList klasse. Den sætter vores "first" node til null, hvilket indikerer, at vores liste er tom.
	public SortedLinkedList() {
		this.first = null;
	}

	// Denne metode tillader os at tilføje et element til vores linked list.
	public void addElement(String e) {
		// Vi opretter en ny node til det element, vi vil tilføje.
		Node newNode = new Node();
		newNode.data = e;
		// Hvis vores liste er tom (dvs., "first" er null), gør vi vores nye node til den første node i listen.
		if (first == null) {
			newNode.next = null; // Den nye node er det sidste element i listen, så dens "next" attribut er null.
			first = newNode; // Vi gør den nye node til det første element i vores linked list.
			// Hvis det nye element er mindre end det første element i listen, indsætter vi det nye element før det første.
		} else if (first.data.compareTo(newNode.data) >= 0) {
			newNode.next = first; // Vi sætter det næste element for den nye node til at være det tidligere første element.
			first = newNode; // Vi gør den nye node til det første element i vores linked list.
		} else {
			// Hvis ingen af de ovenstående betingelser er opfyldt, betyder det, at vores nye node skal indsættes et sted efter det første element.
			// Vi begynder ved det første element og itererer gennem listen for at finde det korrekte indsætningspunkt.
			Node current = first;
			// Vi fortsætter med at iterere, så længe det næste element ikke er null, og det næste element er mindre end vores nye element.
			while (current.next != null && current.next.data.compareTo(e) < 0) {
				current = current.next; // Vi skifter til det næste element i listen.
			}
			// Hvis vi er nået til enden af listen, sætter vi vores nye node til at være det sidste element.
			if (current.next == null) {
				current.next = newNode; // Vi sætter det næste element for det aktuelle element til at være vores nye node.
				newNode.next = null; // Vi sætter det næste element for vores nye node til at være null, fordi det er det sidste element i listen.
				// Hvis vi ikke er ved enden af listen, skal vi indsætte vores nye node et sted i midten af listen.
			} else {
				newNode.next = current.next; // Vi sætter det næste element for vores nye node til at være det element, der oprindeligt var efter det aktuelle element.
				current.next = newNode; // Vi sætter det næste element for det aktuelle element til at være vores nye node, hvilket effektivt indsætter vores nye node på den korrekte position i listen.
			}
		}
	}

	// Denne metode udskriver elementerne i vores linked list i rækkefølge.
	public void udskrivElements() {
		// Hvis vores liste ikke er tom...
		if (first != null) {
			// Vi starter ved det første element.
			Node temp = first;
			// Vi itererer gennem listen og udskriver hvert element.
			while (temp != null) {
				System.out.println(temp.data); // Vi udskriver dataen for det aktuelle element.
				temp = temp.next; // Vi går videre til det næste element i listen.
			}
		}
	}

	// Denne metode tæller det antal elementer i vores linked list ved hjælp af rekursion.
	public int countElements() {
		// Vi starter ved det første element og kalder vores hjælpefunktion, countElementsRecursive().
		return countElementsRecursive(first);
	}

	// Dette er vores hjælpefunktion til at tælle elementerne i vores linked list rekursivt.
	private int countElementsRecursive(Node node) {
		// Hvis vi er nået til enden af vores linked list, returnerer vi 0.
		if (node == null) {
			return 0;
			// Hvis vi ikke er ved enden af vores linked list, tæller vi det aktuelle element og kalder vores funktion igen med det næste element.
		} else {
			return 1 + countElementsRecursive(node.next);
		}
	}
	// Denne metode forsøger at fjerne det sidste element i vores linked list.
	public boolean removeLast() {
		// Vi antager først, at vi ikke kan fjerne noget.
		boolean removed = false;
		// Hvis vores liste er tom, kan vi ikke fjerne noget, så vi returnerer false.
		if (first == null) {
			return removed;
		}
		// Vi starter ved det første element.
		Node temp = first;
		// Vi itererer gennem vores liste...
		while (temp != null) {
			// Hvis vi er ved det sidste element...
			if (temp.next == null) {
				// Vi fjerner referencen til det sidste element, hvilket effektivt fjerner det fra vores linked list.
				temp = null;
				// Vi indikerer, at vi har fjernet et element.
				removed = true;
			} else {
				// Hvis vi ikke er ved det sidste element, går vi videre til det næste element.
				temp = temp.next;
			}
		}
		// Vi returnerer, om vi har fjernet et element eller ej.
		return removed;
	}

	// Denne metode forsøger at fjerne det første forekomst af en given string fra vores linked list.
	public boolean removeElement(String e) {
		// Vi antager først, at vi ikke kan fjerne noget.
		boolean removed = false;
		// Hvis vores liste er tom, kan vi ikke fjerne noget, så vi returnerer false.
		if (first == null) {
			return removed;
			// Hvis det første element i vores liste er det element, vi leder efter...
		} else if (first.data.equals(e)) {
			// Vi fjerner det første element ved at sætte det første element til at være det næste element.
			first = first.next;
			// Vi indikerer, at vi har fjernet et element.
			removed = true;
		} else {
			// Hvis det første element ikke er det element, vi leder efter, skal vi iterere gennem vores liste for at finde det.
			Node temp = first;
			while (temp.next != null) {
				// Hvis det næste element er det element, vi leder efter...
				if (temp.next.data.equals(e)) {
					Node removedNode = temp.next; // Vi gemmer en reference til den node, vi vil fjerne.
					temp.next = temp.next.next; // Vi opdaterer referencen i den aktuelle node til at pege på noden efter den node, vi vil fjerne.
					removedNode.next = null; // Vi fjerner referencen i den fjernede node.
					removed = true; // Vi indikerer, at vi har fjernet et element.
				} else {
					// Hvis det næste element ikke er det element, vi leder efter, går vi videre til det næste element.
					temp = temp.next;
				}
			}
		}
		// Vi returnerer, om vi har fjernet et element eller ej.
		return removed;
	}

	// Denne metode tager en anden SortedLinkedList og tilføjer alle dens elementer til vores nuværende linked list.
	public void addAll(SortedLinkedList list) {
		// Hvis den anden liste ikke er tom...
		if (list.first != null) {
			Node current = list.first; // Vi starter ved det første element i den anden liste.
			while (current != null) {
				this.addElement(current.data); // Vi tilføjer hvert element fra den anden liste til vores liste.
				current = current.next; // Vi går videre til det næste element i den anden liste.
			}
		}
	}

	// Denne indre klasse repræsenterer en node i vores linked list.
	private class Node {
		public String data; // Dette er dataen, som vores node holder.
		public Node next; // Dette er en reference til det næste element i vores linked list.
	}
}

