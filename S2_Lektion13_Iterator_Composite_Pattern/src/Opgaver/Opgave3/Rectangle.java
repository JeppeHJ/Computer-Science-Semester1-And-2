package Opgaver.Opgave3;

public class Rectangle implements Figure {
    // Deklarer private instansvariabler
    private String name; // Navnet på rektanglet
    private double length; // Længden af rektanglet
    private double width; // Bredden af rektanglet

    // Konstruktør til at initialisere Rectangle-objektet
    public Rectangle(String name, double length, double width) {
        this.name = name;      // Sætter navnet på rektanglet
        this.length = length;  // Sætter længden af rektanglet
        this.width = width;    // Sætter bredden af rektanglet
    }

    // Implementerer getName() metoden fra Figure-interfacet
    @Override
    public String getName() {
        return this.name;  // Returnerer navnet på rektanglet
    }

    // Implementerer setName() metoden fra Figure-interfacet
    @Override
    public void setName(String name) {
        this.name = name;  // Sætter navnet på rektanglet
    }

    // Implementerer draw() metoden fra Figure-interfacet
    @Override
    public void draw() {
        System.out.println("Tegner " + name);  // Udskriver en besked der indikerer at rektanglet bliver tegnet
    }

    // Implementerer getArea() metoden fra Figure-interfacet
    @Override
    public double getArea() {
        return length * width;  // Beregner og returnerer rektanglets areal ved at multiplicere længden med bredden
    }
}