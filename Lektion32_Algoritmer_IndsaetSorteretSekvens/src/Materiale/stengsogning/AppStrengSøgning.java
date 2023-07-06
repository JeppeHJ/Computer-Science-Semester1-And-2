package Materiale.stengsogning;

public class AppStrengSøgning {
	// Metode til at finde indekset af en delstreng (m) i en større streng (sm)
	public static int find(String sm, String m) {
		int indeks = -1;
		int i = 0;

		// Gennemgår den større streng (sm) indtil slutningen minus længden af delstrengen (m)
		while (indeks == -1 && i <= sm.length() - m.length()) {
			if (match(sm, m, i)) {
				// Hvis delstrengen matcher på det aktuelle indeks (i), sættes indeks til i
				indeks = i;
			} else {
				// Hvis der ikke er et match, øges tælleren i
				i++;
			}
		}

		// Returnerer indekset, hvor delstrengen blev fundet, eller -1, hvis den ikke blev fundet
		return indeks;
	}

	// Metode til at kontrollere, om en delstreng (m) matcher en del af en større streng (sm) på et givet indeks (i)
	private static boolean match(String sm, String m, int i) {
		boolean foundDiff = false;
		int j = 0;

		// Gennemgår hvert tegn i delstrengen (m) og sammenligner det med tilsvarende tegn i den større streng (sm)
		while (!foundDiff && j < m.length()) {
			if (sm.charAt(i + j) != m.charAt(j)) {
				// Hvis der findes en forskel mellem tegnene, sættes foundDiff til true
				foundDiff = true;
			} else {
				// Hvis tegnene er ens, øges tælleren j
				j++;
			}
		}

		// Returnerer true, hvis der ikke blev fundet nogen forskel, ellers false
		return !foundDiff;
	}

	public static void main(String[] args) {
		// Eksempel på brug af find-metoden til at finde indekset af en delstreng
		System.out.println(find("God juleferie", "jul"));

		// Alternativ metode til at finde indekset ved hjælp af indexOf-metoden i String-klassen
		String sm = "God juleferie";
		String m = "jul";
		System.out.println(sm.indexOf(m));
	}
}
