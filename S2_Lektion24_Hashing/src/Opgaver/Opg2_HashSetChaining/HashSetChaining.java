package Opgaver.Opg2_HashSetChaining;

public class HashSetChaining {
	private Node[] buckets;  // arrayet af noder (buckets)
	private int currentSize;  // den nuværende størrelse på hash sættet

	/**
	 * Konstruerer en hash tabel.
	 *
	 * @param bucketsLength
	 *            længden på arrayet buckets
	 */
	public HashSetChaining(int bucketsLength) {
		buckets = new Node[bucketsLength];  // initialiserer arrayet buckets
		currentSize = 0;  // i begyndelsen er hash sættet tomt
	}

	/**
	 * Beregner hash værdien for et objekt.
	 *
	 * @param x
	 *            et objekt
	 * @return hash værdien
	 */
	private int hashValue(Object x) {
		int h = x.hashCode();  // henter hash koden for objektet
		if (h < 0) {
			h = -h;  // hvis negativ, konverteres den til positiv
		}
		h = h % buckets.length;  // komprimerer hash koden for at passe ind i arrayet buckets
		return h;
	}

	/**
	 * Tester for sæt-medlemskab.
	 *
	 * @param x
	 *            et objekt
	 * @return sandt hvis x er et element i dette sæt
	 */
	public boolean contains(Object x) {
		int h = hashValue(x);  // beregner hash værdien
		Node current = buckets[h];  // får noden på den pågældende plads
		while (current != null) {
			if (current.data.equals(x)) {
				return true;  // fandt elementet
			}
			current = current.next;  // går videre til den næste node i listen
		}
		return false;  // elementet blev ikke fundet
	}

	/**
	 * Tilføjer et element til dette sæt.
	 *
	 * @param x
	 *            et objekt
	 * @return sandt hvis x er et nyt objekt, falsk hvis x allerede var i sættet
	 */
	public boolean add(Object x) {
		if (loadFactor() > 0.75) {
			rehash();  // hvis belastningsfaktoren er for høj, foretages der en rehash
		}
		int h = hashValue(x);  // beregner hash værdien
		Node current = buckets[h];  // får noden på den pågældende plads
		while (current != null) {
			if (current.data.equals(x)) {
				return false;  // elementet er allerede i sættet
			}
			current = current.next;  // går videre til den næste node i listen
		}

		// tilføjer det nye element i starten af listen
		Node newNode = new Node();
		newNode.data = x;
		newNode.next = buckets[h];
		buckets[h] = newNode;
		currentSize++;  // øger størrelsen på sættet
		return true;  // tilføjede elementet med succes
	}

	/**
	 * Beregner belastningsfaktoren for hash tabellen.
	 *
	 * @return belastningsfaktoren
	 */
	private float loadFactor() {
		return (float) currentSize / buckets.length;
	}

	/**
	 * Genhasher hash tabellen, når belastningsfaktoren bliver for høj.
	 */
	private void rehash() {
		// Laver et nyt array af nodes med dobbelt så mange pladser som det gamle array.
		Node[] newBuckets = new Node[buckets.length * 2];

		// Går igennem hvert element i det gamle array.
		for (Node oldBucket : buckets) {
			Node current = oldBucket;
			while (current != null) {
				// Beregner den nye hash værdi for hvert objekt.
				int h = hashValue(current.data) % newBuckets.length;
				// Kopierer noden over i det nye array på den nye hash plads.
				Node newNode = new Node();
				newNode.data = current.data;
				newNode.next = newBuckets[h];
				newBuckets[h] = newNode;

				// Går videre til næste node i den gamle liste.
				current = current.next;
			}
		}

		// Erstatter det gamle array med det nye.
		buckets = newBuckets;
	}


	/**
	 * Fjerner et objekt fra dette sæt.
	 *
	 * @param x
	 *            et objekt
	 * @return sandt hvis x blev fjernet fra dette sæt, falsk hvis x ikke var et element af dette sæt
	 */
	public boolean remove(Object x) {
		// Beregner hash værdien for objektet.
		int h = hashValue(x);

		// Finder det første element i listen på den givne hash plads.
		Node current = buckets[h];

		// Særlig håndtering for det første element i listen.
		if (current != null && current.data.equals(x)) {
			buckets[h] = current.next;  // Fjerner det første element ved at hoppe over det.
			currentSize--;  // Opdaterer størrelsen.
			return true;  // Returnerer sandt, fordi objektet blev fundet og fjernet.
		}

		// Søger igennem resten af listen.
		while (current != null && current.next != null) {
			if (current.next.data.equals(x)) {
				// Hopper over det næste element i listen for at fjerne det.
				current.next = current.next.next;
				currentSize--;  // Opdaterer størrelsen.
				return true;  // Returnerer sandt, fordi objektet blev fundet og fjernet.
			}
			// Går videre til næste element i listen.
			current = current.next;
		}

		// Hvis vi når her, var objektet ikke i sættet, så vi returnerer falsk.
		return false;
	}


	/**
	 * Får antallet af elementer i dette sæt.
	 *
	 * @return antallet af elementer
	 */
	public int size() {
		return currentSize;
	}
class Node {
		public Object data;
		public Node next;
	}

}
