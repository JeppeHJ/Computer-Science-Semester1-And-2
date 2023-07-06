package Materiale.headfirstwaitress;

public class MenuItem {
	// Attributter for menuelementet
	private String name;
	private String description;
	private boolean vegetarian;
	private double price;

	// Konstruktør til oprettelse af menuelementet med specificerede værdier
	public MenuItem(String name, String description, boolean vegetarian, double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	// Metode til at få navnet på menuelementet
	public String getName() {
		return name;
	}

	// Metode til at få beskrivelsen af menuelementet
	public String getDescription() {
		return description;
	}

	// Metode til at tjekke om menuelementet er vegetarisk
	public boolean isVegetarian() {
		return vegetarian;
	}

	// Metode til at få prisen på menuelementet
	public double getPrice() {
		return price;
	}
}
