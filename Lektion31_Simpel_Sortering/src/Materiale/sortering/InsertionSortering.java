package Materiale.sortering;

public class InsertionSortering {

	public static void insertioneSort(int[] list) {
		// Implementering af indsættelsessortering
		// Sorterer en given liste af heltal i stigende rækkefølge.

		for (int i = 1; i < list.length; i++) {
			// Gå igennem hvert element i listen, starter fra det andet element (indeks 1).
			int next = list[i];
			// Gem værdien af det aktuelle element i variablen "next".
			int j = i;
			// Initialiser variablen "j" til at have samme værdi som "i".
			boolean found = false;
			// Initialiser variablen "found" til at være falsk.
			while (!found && j > 0) {
				// Gentag, indtil vi har fundet den rigtige position for det aktuelle element
				// eller når vi har sammenlignet med alle tidligere elementer.
				if (next >= list[j - 1]) {
					// Hvis værdien af "next" er større end eller lig med værdien af det forrige element,
					// er vi nået til den rigtige position for "next".
					found = true;
					// Sæt "found" til sandt for at afslutte løkken.
				} else {
					list[j] = list[j - 1];
					// Hvis værdien af "next" er mindre end værdien af det forrige element,
					// flytter vi det forrige element en plads frem i listen.
					j--;
					// Reducer "j" for at fortsætte sammenligningen med det næste forrige element.
				}
			}
			list[j] = next;
			// Sæt værdien af "next" på den rigtige position i listen.
		}
	}


}
