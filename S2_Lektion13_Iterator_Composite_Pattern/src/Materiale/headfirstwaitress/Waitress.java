package Materiale.headfirstwaitress;

import java.util.Iterator;

public class Waitress {
	// Attributter til opbevaring af PancakeHouseMenu og DinerMenu
	private PancakeHouseMenu pancakeHouseMenu;
	private DinerMenu dinerMenu;

	// Konstruktør til oprettelse af Waitress-objekt med PancakeHouseMenu og DinerMenu
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}

	// Metode til at udskrive menuen
	public void printMenu() {
		// Iterator til PancakeHouseMenu
		Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.iterator();

		// Udskrivning af morgenmadsmenuen
		System.out.println("Menu\n---\nBreakfast");
		printMenu(pancakeIterator);

		// Iterator til DinerMenu
		Iterator<MenuItem> dinerIterator = dinerMenu.iterator();

		// Udskrivning af frokostmenuen
		System.out.println("\nLunch");
		printMenu(dinerIterator);
	}

	// Hjælpefunktion til at udskrive menuen ved hjælp af en iterator
	private void printMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			// Hent det næste menuelement fra iterator
			MenuItem menuItem = iterator.next();
			System.out.println(menuItem.getName() + ", ");
			System.out.println(menuItem.getPrice() + "--  ");
			System.out.println(menuItem.getDescription());
			System.out.println();
		}
	}
}
