package Materiale.maximum;

import java.util.ArrayList;

public class RekursivList {

	// TODO: Tidskompleksitet: O(log n), hvor n er antallet af elementer i delområdet (h - l + 1).
	// Algoritmen benytter sig af rekursion, hvor delområdet halveres i hver iteration.
	// Antallet af iterationer vil være logaritmisk i forhold til n.
	// I hver iteration sammenlignes to maksimale elementer, hvilket tager konstant tid.
	// Derfor vil tidskompleksiteten være O(log n).
	/**
	 * Finder det maksimale element i en liste.
	 *
	 * @param list listen, der skal findes det maksimale element i
	 * @return det maksimale element
	 */
	public int max(ArrayList<Integer> list) {
		return maximum(list, 0, list.size() - 1);
	}

	/**
	 * Rekursivt finder det maksimale element i en del af listen.
	 *
	 * @param list listen, der skal findes det maksimale element i
	 * @param l    startindeks for delområdet
	 * @param h    slutindeks for delområdet
	 * @return det maksimale element i delområdet
	 */
	private int maximum(ArrayList<Integer> list, int l, int h) {
		if (l == h) {
			return list.get(l); // Termineringsregel: Der er kun ét element i delområdet
		} else {
			int m = (l + h) / 2;
			int max1 = maximum(list, l, m); // Rekursivt kald på venstre delområde
			int max2 = maximum(list, m + 1, h); // Rekursivt kald på højre delområde
			if (max1 > max2) {
				return max1; // Rekurrensregel: Sammenligning og returnering af det største element mellem de to delområder
			} else {
				return max2;
			}
		}

	}
}
