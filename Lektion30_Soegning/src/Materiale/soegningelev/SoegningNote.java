package Materiale.soegningelev;

import java.util.ArrayList;

public class SoegningNote {
	/**
	 * Lineær søgning i en ArrayList<String>.
	 *
	 * @param list   en liste af strenge
	 * @param target den streng, der skal findes
	 * @return indekset for den første forekomst af målet i listen, eller -1 hvis målet ikke findes
	 */
	public static int linearSearchList(ArrayList<String> list, String target) {
		int indeks = -1;
		int i = 0;
		while (indeks == -1 && i < list.size()) {
			String k = list.get(i);
			if (k.equals(target))
				indeks = i; // Gemmer indeks, hvis målet er fundet
			else
				i++; // Går videre til næste element i listen
		}
		return indeks;
	}

	/**
	 * Lineær søgning i en ArrayList<Kunde>.
	 *
	 * @param list en liste af Kunde-objekter
	 * @param name navnet på den Kunde, der skal findes
	 * @return den første Kunde i listen med det angivne navn, eller null hvis ingen Kunde matcher
	 */
	public static Kunde linearSearchKunde(ArrayList<Kunde> list, String name) {
		Kunde kunde = null;
		int i = 0;
		while (kunde == null && i < list.size()) {
			Kunde k = list.get(i);
			if (k.getNavn().equals(name))
				kunde = k; // Gemmer kunden, hvis navnet matcher
			else {
				i++; // Går videre til næste element i listen
			}
		}
		return kunde;
	}

	/**
	 * Lineær søgning i et array af Strings.
	 *
	 * @param list   et array af strenge
	 * @param target den streng, der skal findes
	 * @return indekset for den første forekomst af målet i arrayet, eller -1 hvis målet ikke findes
	 */
	public static int linearSearchArray(String[] list, String target) {
		int indeks = -1;
		int i = 0;
		while (indeks == -1 && i < list.length) {
			String k = list[i];
			if (k.equals(target))
				indeks = i; // Gemmer indeks, hvis målet er fundet
			else
				i++; // Går videre til næste element i arrayet
		}
		return indeks;
	}

	/**
	 * Lineær søgning i et array af Kunde-objekter.
	 *
	 * @param list et array af Kunde-objekter
	 * @param name navnet på den Kunde, der skal findes
	 * @return den første Kunde i arrayet med det angivne navn, eller null hvis ingen Kunde matcher
	 */
	public static Kunde linearSearchKundeArray(Kunde[] list, String name) {
		Kunde kunde = null;
		int i = 0;
		while (kunde == null && i < list.length) {
			Kunde k = list[i];
			if (k.getNavn().equals(name))
				kunde = k; // Gemmer kunden, hvis navnet matcher
			else
				i++; // Går videre til næste element i arrayet
		}
		return kunde;
	}

	/**
	 * Binær søgning i et array af ints.
	 *
	 * @param arr    et sorteret array af heltal
	 * @param target tallet, der skal findes
	 * @return indekset for den første forekomst af målet i arrayet, eller -1 hvis målet ikke findes
	 */
	public static int binSearchArray(int[] arr, int target) {
		int indeks = -1;
		int left = 0;
		int right = arr.length - 1;
		int middle = -1;
		while (indeks == -1 && left <= right) {
			middle = (left + right) / 2; // Beregner midten af det aktuelle område
			int k = arr[middle];
			if (k == target)
				indeks = middle; // Gemmer indeks, hvis målet er fundet
			else if (k > target)
				right = middle - 1; // Opdaterer højre grænse til at være venstre for midten
			else
				left = middle + 1; // Opdaterer venstre grænse til at være højre for midten
		}
		return indeks;
	}

	/**
	 * Binær søgning i en sorteret ArrayList<Kunde>.
	 *
	 * @param list en sorteret liste af Kunde-objekter
	 * @param name navnet på den Kunde, der skal findes
	 * @return den første Kunde i listen med det angivne navn, eller null hvis ingen Kunde matcher
	 */
	public static Kunde binSearchList(ArrayList<Kunde> list, String name) {
		Kunde kunde = null;
		int left = 0;
		int right = list.size() - 1;
		int middle = -1;
		while (kunde == null && left <= right) {
			middle = (left + right) / 2; // Beregner midten af det aktuelle område
			Kunde k = list.get(middle);
			int comp = k.getNavn().compareTo(name);
			if (comp == 0)
				kunde = k; // Gemmer kunden, hvis navnet matcher
			else if (comp > 0)
				right = middle - 1; // Opdaterer højre grænse til at være venstre for midten
			else
				left = middle + 1; // Opdaterer venstre grænse til at være højre for midten
		}
		return kunde;
	}
}
