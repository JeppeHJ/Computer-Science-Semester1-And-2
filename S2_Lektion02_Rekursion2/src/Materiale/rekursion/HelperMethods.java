package Materiale.rekursion;

import java.util.ArrayList;

public class HelperMethods {
	// Metoden sum1 tæller summen af tallene i listen ved hjælp af rekursion.
	public static int sum1(ArrayList<Integer> list) {
		int result;
		if (list.size() == 0) {
			result = 0; // Hvis listen er tom, er summen 0.
		} else {
			result = list.get(0); // Hent det første tal i listen.
			list.remove(0); // Fjern det første element fra listen.
			result = result + sum(list); // Læg det første tal til summen af de resterende tal i listen.
		}
		return result;
	}

	// Metoden sum kaldes af sum1 og har de nødvendige parametre for den rekursive kald.
	public static int sum(ArrayList<Integer> list) {
		return sum(list, 0);
	}

	// Rekursiv hjælpemetode til at beregne summen af tal i en given liste.
	private static int sum(ArrayList<Integer> list, int index) {
		int result;
		if (index == list.size()) {
			result = 0; // Hvis index når grænsen for listen, er summen 0.
		} else {
			result = list.get(index) + sum(list, index + 1); // Læg det aktuelle tal til summen og fortsæt med det næste tal.
		}
		return result;
	}

	// Metoden length tæller antallet af elementer i listen ved hjælp af rekursion.
	public static int length(ArrayList<Integer> list) {
		return length(list, 0);
	}

	// Rekursiv hjælpemetode til at beregne antallet af elementer i en given liste.
	private static int length(ArrayList<Integer> list, int index) {
		int result;
		if (index == list.size()) {
			result = 0; // Hvis index når grænsen for listen, er antallet 0.
		} else {
			result = 1 + length(list, index + 1); // Tæl det aktuelle element og fortsæt med det næste element.
		}
		return result;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(10);
		list.add(17);
		list.add(4);
		list.add(8);
		list.add(45);
		list.add(29);
		System.out.println(list);
		System.out.println("sum: " + sum(list));
		System.out.println("length: " + length(list));

		System.out.println(list);
	}
}
