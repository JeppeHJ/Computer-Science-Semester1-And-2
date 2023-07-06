package Opgaver.Opgave3;

import java.util.ArrayList;

public class FletteSorteringHul {

	/**
	 * Starter flettesorteringen af en liste.
	 *
	 * @param list listen, der skal flettesorteres
	 */
	public void fletteSort(ArrayList<Integer> list) {
		mergesort(list, 0, list.size() - 1);
	}

	/**
	 * Den rekursive metode, der implementerer del-løs og kombiner skabelonen.
	 *
	 * @param list listen, der skal flettesorteres
	 * @param l    startindeks for delområdet
	 * @param h    slutindeks for delområdet
	 */
	private void mergesort(ArrayList<Integer> list, int l, int h) {
		if (l < h) {
			int m = (l + h) / 2;
			mergesort(list, l, m); // Rekursivt kald på venstre delområde
			mergesort(list, m + 1, h); // Rekursivt kald på højre delområde
			merge(list, l, m, h); // Kombinerer de to delområder
		}
		// TODO: Tidskompleksitet: O(n * log n), hvor n er længden af delområdet (h - l + 1). Algoritmen benytter sig af rekursion,
		// hvor delområdet halveres i hver iteration, og i hver iteration sammenflettes de to delområder. Antallet af iterationer vil være logaritmisk i forhold til n.
		// I hver iteration sammenflettes alle elementer i delområdet, hvilket tager lineær tid O(n). Derfor vil tidskompleksiteten være O(n * log n).
	}

	/**
	 * Kombinerer to delområder ved hjælp af fletteskabelonen.
	 *
	 * @param list    listen, der skal flettesorteres
	 * @param low     startindeks for venstre delområde
	 * @param middle  slutindeks for venstre delområde og startindeks for højre delområde
	 * @param high    slutindeks for højre delområde
	 */
	private void merge(ArrayList<Integer> list, int low, int middle, int high) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		int i1 = low; // Startindeks for venstre delområde
		int i2 = middle + 1; // Startindeks for højre delområde

		// Sammenfletning af de to delområder
		while (i1 <= middle && i2 <= high) {
			if (list.get(i1) < list.get(i2)) {
				temp.add(list.get(i1));
				i1++;
			} else if (list.get(i1) > list.get(i2)) {
				temp.add(list.get(i2));
				i2++;
			} else {
				temp.add(list.get(i1));
				temp.add(list.get(i2));
				i1++;
				i2++;
			}
		}

		// Håndtering af eventuelle resterende elementer i venstre delområde
		while (i1 <= middle) {
			temp.add(list.get(i1));
			i1++;
		}

		// Håndtering af eventuelle resterende elementer i højre delområde
		while (i2 <= high) {
			temp.add(list.get(i2));
			i2++;
		}

		// Opdaterer listen med de sammenflettede elementer
		for (int i = 0; i < list.size(); i++) {
			list.set(i, temp.get(i));
		}
	}
}
