/*
 *
 */
package Materiale.rekursion;

/**
 * Hanoi-klassen implementerer rekursiv løsning til Tower of Hanoi-problemet.
 * Tower of Hanoi er et matematisk puslespil, hvor man skal flytte en bunke af
 * skiver fra en pind til en anden, under overholdelse af visse regler.
 * Her er koden til at løse problemet.
 *
 * Koden er forsynet med udførlige kommentarer.
 */

public class Hanoi {

	/**
	 * Metoden flyt tager imod antallet af skiver (n), startpind (fra) og slutpind (til).
	 * Den anvender rekursion til at løse Tower of Hanoi-problemet ved at flytte skiverne
	 * fra startpind til slutpind ved hjælp af en midlertidig pind.
	 */
	public static void flyt(int n, int fra, int til) {
		if (n == 1) {
			// Base case: Hvis der kun er én skive tilbage, flyttes den direkte fra startpind til slutpind.
			System.out.println("Flyt fra " + fra + " til " + til);
		} else {
			// Rekursiv case: Hvis der er flere end én skive, udføres følgende trin:

			// 1. Find midlertidig pind ved at beregne forskellen mellem pindene 1, 2 og 3.
			int temp = 6 - fra - til;

			// 2. Rekursivt flyt (n-1) skiver fra startpind til midlertidig pind.
			flyt(n - 1, fra, temp);

			// 3. Flyt den største skive fra startpind til slutpind.
			System.out.println("Flyt fra " + fra + " til " + til);

			// 4. Rekursivt flyt (n-1) skiver fra midlertidig pind til slutpind.
			flyt(n - 1, temp, til);
		}
	}

	/**
	 * Main-metoden starter programmet og udfører Tower of Hanoi-løsningen ved at kalde flyt-metoden.
	 */
	public static void main(String[] args) {
		flyt(4, 1, 3);
	}
}
