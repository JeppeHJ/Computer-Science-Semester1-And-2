package Opgaver.Opgave2;

import Opgaver.Opgave1.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Ex2 {

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

		// runners.forEach() kører en Consumer lambda-funktion for hver løber i listen runners.
		// Lambda-funktionen tager en Runner som parameter og udskriver navnet og lapTime for hver løber ved at kalde getName() og getLapTime() metoderne.
		// System.out.println() bruges til at udskrive resultatet.
		// Denne kode udskriver en linje for hver løber med deres navn og lapTime i formatet <navn>: <lapTime> sec.
		runners.forEach(runner -> System.out.println(runner.getName() + ": " + runner.getLapTime() + " sec"));

		// runners.forEach() kører en Consumer lambda-funktion for hver løber i listen runners.
		// Lambda-funktionen tjekker om løberens lapTime er mindre end 30.
		// Hvis betingelsen er sand, udskrives løberens navn og lapTime.
		runners.forEach(runner -> {
			if (runner.getLapTime() < 30) {
				System.out.println(runner.getName() + runner.getLapTime());
			}
		});

		// runners.sort() bruges til at sortere løberne i listen runners.
		// Lambda-udtrykket ((runner1, runner2) -> Integer.compare(runner1.getLapTime(), runner2.getLapTime())) fungerer som en Comparator,
		// der sammenligner lapTime for to løbere.
		// System.out::println bruges i forEach-metoden til at udskrive hver løber.
		runners.sort((runner1, runner2) -> Integer.compare(runner1.getLapTime(), runner2.getLapTime()));
		runners.forEach(System.out::println);
	}
}
