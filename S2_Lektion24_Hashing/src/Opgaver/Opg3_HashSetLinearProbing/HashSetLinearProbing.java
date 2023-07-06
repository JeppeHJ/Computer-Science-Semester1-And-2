package Opgaver.Opg3_HashSetLinearProbing;

public class HashSetLinearProbing {
	private Object[] buckets;  // arrayet af objekter
	private int currentSize;  // den nuværende størrelse på hash sættet
	private static final Object DELETED = "DELETED";  // markøren for slettede elementer

	/**
	 * Konstruerer en hash tabel.
	 *
	 * @param bucketsLength
	 *            længden på arrayet buckets
	 */
	public HashSetLinearProbing(int bucketsLength) {
		buckets = new Object[bucketsLength];  // initialiserer arrayet buckets
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
		// lineær probing
		while (buckets[h] != null) {
			if (buckets[h].equals(x)) {
				return true;  // fandt elementet
			}
			h = (h + 1) % buckets.length;  // gå til den næste spand
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
		int h = hashValue(x);  // beregner hash værdien
		// lineær probing
		while (buckets[h] != null && !buckets[h].equals(DELETED)) {
			if (buckets[h].equals(x)) {
				return false;  // elementet er allerede i sættet
			}
			h = (h + 1) % buckets.length;  // gå til den næste spand
		}
		buckets[h] = x;  // indsætter elementet i spanden
		currentSize++;  // øger størrelsen på sættet
		return true;  // tilføjede elementet med succes
	}

	/**
	 * Fjerner et objekt fra dette sæt.
	 *
	 * @param x
	 *            et objekt
	 * @return sandt hvis x blev fjernet fra dette sæt, falsk hvis x ikke var et element i dette sæt
	 */
	public boolean remove(Object x) {
		int h = hashValue(x);  // beregner hash værdien
		// lineær probing
		while (buckets[h] != null) {
			if (buckets[h].equals(x)) {
				buckets[h] = DELETED;  // markerer spanden som slettet
				currentSize--;  // reducerer størrelsen på sættet
				return true;  // fjernede elementet med succes
			}
			h = (h + 1) % buckets.length;  // gå til den næste spand
		}
		return false;  // kunne ikke fjerne elementet
	}
}
