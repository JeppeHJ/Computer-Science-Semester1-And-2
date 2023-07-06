package Materiale.modelinsertisorteret;

import java.util.ArrayList;
import java.util.Arrays;

public class InserISoretet {
	// Metode til at indsætte et element (e) i et sorteret array (tabel)
	public static void insert(int[] tabel, int e) {
		int j = tabel.length - 1;

		// Finder den sidste ikke-nul-position i arrayet
		while (j >= 0 && tabel[j] == 0) {
			j--;
		}

		// Øger j med 1 for at få den næste ledige position i arrayet
		j++;

		boolean found = false;
		while (!found && j > 0) {
			if (e > tabel[j - 1]) {
				// Hvis det nye element er større end det foregående element i arrayet,
				// sættes found til true for at afslutte løkken
				found = true;
			} else {
				// Hvis det nye element er mindre end det foregående element i arrayet,
				// rykkes det foregående element en position ned i arrayet
				tabel[j] = tabel[j - 1];
				j--;
			}
		}

		// Indsæt det nye element på den korrekte position i arrayet
		tabel[j] = e;
	}

	// Metode til at indsætte et element (e) i en sorteret ArrayList (list)
	public static void insert(ArrayList<Integer> list, int e) {
		boolean found = false;
		int i = 0;

		// Find det korrekte indeks til at indsætte elementet ved at sammenligne med eksisterende elementer i listen
		while (!found && i < list.size()) {
			if (list.get(i) > e) {
				found = true;
			} else {
				i++;
			}
		}

		// Indsæt elementet på det fundne indeks
		list.add(i, e);
	}

	public static void main(String[] args) {
		// Opret et array til at gemme 10 tal
		int[] tabel = new int[10];

		// Indsæt tal i arrayet ved hjælp af insert-metoden
		insert(tabel, 5);
		insert(tabel, 2);
		insert(tabel, 9);
		insert(tabel, 4);
		insert(tabel, 1);
		insert(tabel, 7);
		insert(tabel, 10);
		insert(tabel, 12);
		insert(tabel, 6);
		insert(tabel, 3);

		// Udskriv arrayet
		System.out.println(Arrays.toString(tabel));

		// Opret en ArrayList til at gemme tal
		ArrayList<Integer> list = new ArrayList<Integer>();

		// Indsæt tal i ArrayList ved hjælp af insert-metoden
		insert(list, 5);
		insert(list, 2);
		insert(list, 9);
		insert(list, 4);
		insert(list, 1);
		insert(list, 7);
		insert(list, 10);
		insert(list, 12);
		insert(list, 6);
		insert(list, 3);

		// Udskriv ArrayList
		System.out.println(list);
	}
}
