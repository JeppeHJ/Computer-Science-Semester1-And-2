package Opgaver.Opgave1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex1 {

	public static void main(String[] args) {
		// Opretter en liste af Person-objekter ved hjælp af List.of()
		List<Person> list = List.of(
				new Person("Bent", 25), new Person("Susan", 34),
				new Person("Mikael", 60), new Person("Klaus", 44),
				new Person("Birgitte", 17), new Person("Liselotte", 9));
		// Opretter en ny ArrayList og kopierer Person-objekterne fra den oprindelige liste til den nye liste
		List<Person> persons = new ArrayList<Person>(list);
		System.out.println(persons);
		System.out.println();

		// Udskriver den første person i listen, der opfylder betingelsen givet af Predicate-objektet
		System.out.println(findFirst(persons,p -> p.getAge() == 44));

		// Udskriver den første person i listen, hvis navn starter med bogstavet 'S'
		System.out.println(findFirst(persons,p -> p.getName().charAt(0) == 'S'));

		// Udskriver den første person i listen, hvis navnet indeholder mere end én forekomst af bogstavet 'i'
		System.out.println(findFirst(persons, p -> {
			int count = 0;
			for (char c : p.getName().toCharArray()) {
				if (c == 'i') {
					count++;
				}
			}
			return count > 1;
		}));

		// Udskriver den første person i listen, hvis længden af navnet er lig med personens alder
		System.out.println(findFirst(persons,p -> p.getName().length() == p.getAge()));

		// Udskriver alle personer i listen, der er under 30 år
		System.out.println(findAll(persons,p -> p.getAge() < 30));

		// Udskriver alle personer i listen, hvis navn indeholder bogstavet 'i'
		System.out.println(findAll(persons,p -> p.getName().contains("i")));

		// Udskriver alle personer i listen, hvis navn starter med bogstavet 'i'
		System.out.println(findAll(persons,p -> p.getName().charAt(0) == 'i'));

		// Udskriver alle personer i listen, hvis længden af navnet er større end 5
		System.out.println(findAll(persons,p -> p.getName().length() > 5));

		// Udskriver alle personer i listen, hvis længden af navnet er større end 6 og alderen er under 40
		System.out.println(findAll(persons,p -> p.getName().length() > 6 && p.getAge() < 40));
	}

	/**
	 * Finder den første person i listen, der opfylder betingelsen givet af Predicate-objektet.
	 * Returnerer null, hvis ingen person opfylder betingelsen.
	 */
	public static Person findFirst(List<Person> list, Predicate<Person> filter) {
		for (Person p : list) {
			// Tjekker om betingelsen givet af Predicate-objektet er sand for den aktuelle person
			if (filter.test(p)) {
				return p; // Returnerer den første person, der opfylder betingelsen
			}
		}
		return null; // Hvis ingen person opfylder betingelsen, returneres null
	}

	/**
	 * Finder alle personer i listen, der opfylder betingelsen givet af Predicate-objektet.
	 * Returnerer en ArrayList med de personer, der opfylder betingelsen.
	 */
	public static ArrayList<Person> findAll(List<Person> list, Predicate<Person> filter) {
		ArrayList<Person> temp = new ArrayList<>();
		for (Person p : list) {
			// Tjekker om betingelsen givet af Predicate-objektet er sand for den aktuelle person
			if (filter.test(p)) {
				temp.add(p); // Tilføjer den aktuelle person til ArrayList'en
			}
		}
		return temp; // Returnerer ArrayList'en med de personer, der opfylder betingelsen
	}
}
