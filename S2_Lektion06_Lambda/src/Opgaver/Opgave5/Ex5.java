package Opgaver.Opgave5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Ex5 {

	public static void main(String[] args) {
		// Opretter en liste af Runner-objekter
		List<Runner> runners = new ArrayList<>();
		// Tilføjer Runner-objekter til listen
		runners.addAll(List.of(
				new Runner("Ib", 30),
				new Runner("Per", 50),
				new Runner("Ole", 27),
				new Runner("Ulla", 40),
				new Runner("Jens", 35),
				new Runner("Hans", 28)));
		System.out.println(runners);
		System.out.println();

		// OBS: Kaster en exception.
		// Itererer gennem listen og forsøger at fjerne løbere, hvis omgangstid er større end 40
		// Dette vil kaste en ConcurrentModificationException, da listen ændres under iterationen
		// Det er generelt ikke tilladt at modificere en samling, mens man itererer over den på denne måde
		for (Runner runner : runners) {
			if (runner.getLapTime() > 40)
				runners.remove(runner);
		}
		System.out.println(runners);
		System.out.println();

		// Den exception, der kastes, er sandsynligvis en ConcurrentModificationException.
		// Denne exception sker, fordi programmet forsøger at fjerne elementer fra en samling (i dette tilfælde en liste af "løbere")
		// mens det itererer over samme samling. I Java er det generelt ikke tilladt at modificere en samling mens du itererer over den,
		// medmindre du bruger en Iterator's egen remove() metode.

		// B
		// Bruger en Iterator til at iterere gennem løberlisten og fjerne løbere, hvis omgangstid er større end eller lig med 40
		Iterator<Runner> runnerIterator = runners.iterator();
		while (runnerIterator.hasNext()) {
			// Henter næste løber i iterationen
			Runner runner = runnerIterator.next();
			// Tjekker om løberens omgangstid er større end eller lig med 40
			if (runner.getLapTime() >= 40)
				// Fjerner løberen ved hjælp af Iterator's remove() metode
				runnerIterator.remove();
		}
		System.out.println(runners);
		System.out.println();

		// D
		// Kalder en egen metode removeIf(), der fjerner løbere, der opfylder betingelsen givet af et Predicate-objekt
		removeIf(runners, runner -> runner.getLapTime() >= 40);
		System.out.println(runners);
		System.out.println();

		// Bruger den indbyggede removeIf() metode fra List-interfacet til at fjerne løbere, der opfylder betingelsen
		runners.removeIf(runner -> runner.getLapTime() >= 40);
		System.out.println(runners);
		System.out.println();
	}

	// C
	// Metode der fjerner løbere fra listen, der opfylder en given betingelse defineret af et Predicate-objekt
	public static boolean removeIf(List<Runner> runners, Predicate<Runner> filter) {
		boolean isRemoved = false;
		// Opretter en Iterator til at iterere gennem løberlisten
		Iterator<Runner> runnerIterator = runners.iterator();
		// Gennemgår løberlisten
		while (runnerIterator.hasNext()) {
			// Henter næste løber i iterationen
			Runner runner = runnerIterator.next();
			// Tjekker om betingelsen givet af Predicate-objektet er sand for den aktuelle løber
			if (filter.test(runner)) {
				// Fjerner løberen ved hjælp af Iterator's remove() metode
				runnerIterator.remove();
				// Angiver at mindst én løber er blevet fjernet
				isRemoved = true;
			}
		}
		// Returnerer true, hvis mindst én løber blev fjernet, ellers false
		return isRemoved;
	}
}
