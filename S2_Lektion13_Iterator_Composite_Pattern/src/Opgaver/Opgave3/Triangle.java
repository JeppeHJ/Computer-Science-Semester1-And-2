package Opgaver.Opgave3;

public class Triangle implements Figure {
    // Deklarer private instansvariabler
    private String name; // Navnet på trekanten
    private double base; // Basen af trekanten
    private double height; // Højden af trekanten

    // Konstruktør til at initialisere Triangle-objektet
    public Triangle(String name, double base, double height) {
        this.name = name;      // Sætter navnet på trekanten
        this.base = base;      // Sætter basen af trekanten
        this.height = height;  // Sætter højden af trekanten
    }

    // Implementerer getName() metoden fra Figure-interfacet
    @Override
    public String getName() {
        return this.name;  // Returnerer navnet på trekanten
    }

    // Implementerer setName() metoden fra Figure-interfacet
    @Override
    public void setName(String name) {
        this.name = name;  // Sætter navnet på trekanten
    }

    // Implementerer draw() metoden fra Figure-interfacet
    @Override
    public void draw() {
        System.out.println("Tegner " + name);  // Udskriver en besked der indikerer at trekanten bliver tegnet
    }

    // Implementerer getArea() metoden fra Figure-interfacet
    @Override
    public double getArea() {
        return 0.5 * base * height;  // Beregner og returnerer trekantens areal ved hjælp af formlen (0.5 * base * height)
    }
}
