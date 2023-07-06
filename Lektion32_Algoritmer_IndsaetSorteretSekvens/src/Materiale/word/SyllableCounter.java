package Materiale.word;
import java.util.Scanner;

/**
 * This program counts the syllables of all words in a sentence.
 */
public class SyllableCounter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// Bed brugeren om at indtaste en sætning, der slutter med et punktum
		System.out.println("Enter a sentence ending in a period.");

		String input;
		do {
			// Læs det næste ord fra input
			input = in.next();

			// Opret et Word-objekt baseret på det indtastede ord
			Word w = new Word(input);

			// Tæl antallet af stavelser i ordet
			int syllables = w.countSyllables();

			// Udskriv antallet af stavelser i ordet
			System.out.println("Syllables in " + input + ": " + syllables);

		} while (!input.endsWith("."));
		// Fortsæt loopet, indtil brugeren indtaster et ord, der slutter med et punktum
	}
}
