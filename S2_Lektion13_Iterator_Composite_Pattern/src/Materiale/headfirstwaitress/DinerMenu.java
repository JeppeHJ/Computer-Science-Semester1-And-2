package Materiale.headfirstwaitress;

import java.util.Iterator;

public class DinerMenu implements Iterable<MenuItem> {
	// Maksimalt antal elementer i menuen
	private static final int MAX_ITEMS = 6;

	// Antal elementer i menuen
	private int numberOfItems;

	// Array til opbevaring af menuelementer
	private MenuItem[] menuItems;

	public DinerMenu() {
		// Initialisering af array til opbevaring af menuelementer
		menuItems = new MenuItem[MAX_ITEMS];
		// Start med nul elementer
		numberOfItems = 0;

		// Tilføj nogle eksempelmenuelementer
		addItem("Vegetarian BLT", "(Fakin') Bacon med salat og tomat på fuldkorn", true, 2.99);
		addItem("BLT", "Bacon med salat og tomat på fuldkorn", false, 2.99);
		addItem("Dagens suppe", "\"Dagens suppe med kartoffelsalat\"", false, 3.29);
		addItem("Hotdog", "En hotdog med surkål, relish, løg, toppet med ost", false, 3.05);
	}

	// Metode til at tilføje et menuelement
	public void addItem(String name, String description, boolean vegetarian, double price) {
		// Opret nyt menuelement-objekt
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) {
			// Hvis menuen er fuld, udskriv en fejlbesked
			System.out.println("Beklager, menuen er fuld!");
		} else {
			// Ellers tilføj menuelementet til arrayet og opdater antallet af elementer
			menuItems[numberOfItems] = menuItem;
			numberOfItems++;
		}
	}

	@Override
	public Iterator<MenuItem> iterator() {
		// Returner en ny instans af DinerMenuIterator
		return new DinerMenuIterator();
	}

	// --------------------------- Indre klasse -------------------------------
	// Implementering af Iterator-interface til iteration over menuelementer
	private class DinerMenuIterator implements Iterator<MenuItem> {
		// Positionen for den aktuelle iteration
		private int position;

		public DinerMenuIterator() {
			// Start positionen ved 0
			position = 0;
		}

		@Override
		public boolean hasNext() {
			// Tjek om der er flere elementer tilbage i menuItems-arrayet
			// og om det aktuelle element ikke er null
			return position < menuItems.length && menuItems[position] != null;
		}

		@Override
		public MenuItem next() {
			// Hent det aktuelle element og opdater positionen
			MenuItem item = menuItems[position];
			position++;
			return item;
		}
	}
}
