package Materiale.headfirstwaitress;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Iterable<MenuItem> {
	// ArrayList til opbevaring af menuelementer
	private ArrayList<MenuItem> menuItems;

	public PancakeHouseMenu() {
		// Initialisering af ArrayList til opbevaring af menuelementer
		menuItems = new ArrayList<MenuItem>();

		// Tilføj nogle eksempelmenuelementer
		addItem("K&B's Pancake Breakfast", "Pandekager med røræg og toast", true, 2.99);
		addItem("Regular Pancake Breakfast", "Pandekager med spejlæg og pølse", false, 2.99);
		addItem("Blueberry Pancakes", "Pandekager med friske blåbær", true, 3.49);
		addItem("Waffles", "Vaffler med valg af blåbær eller jordbær", true, 3.59);
	}

	// Metode til at tilføje et menuelement til ArrayListen
	public void addItem(String name, String description, boolean vegetarian, double price) {
		// Opret nyt menuelement-objekt
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}

	// Metode til at få en kopi af menuelementerne i form af en ArrayList
	public ArrayList<MenuItem> getMenuItems(){
		return new ArrayList<MenuItem>(menuItems);
	}

	@Override
	public Iterator<MenuItem> iterator() {
		// Returner en iterator til at iterere over menuelementerne i ArrayListen
		return menuItems.iterator();
	}
}
