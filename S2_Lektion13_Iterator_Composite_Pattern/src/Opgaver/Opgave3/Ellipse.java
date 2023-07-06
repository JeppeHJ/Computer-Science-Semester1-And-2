package Opgaver.Opgave3;

public class Ellipse implements Figure {
    // Deklarer private instansvariabler
    private String name; // Navnet på ellipsen
    private double radius1; // Radius 1 af ellipsen
    private double radius2; // Radius 2 af ellipsen

    // Konstruktør til at initialisere Ellipse-objektet
    public Ellipse(String name, double radius1, double radius2) {
        this.name = name;          // Sætter navnet på ellipsen
        this.radius1 = radius1;    // Sætter radius 1 af ellipsen
        this.radius2 = radius2;    // Sætter radius 2 af ellipsen
    }

    // Implementerer getName() metoden fra Figure-interfacet
    @Override
    public String getName() {
        return this.name;  // Returnerer navnet på ellipsen
    }

    // Implementerer setName() metoden fra Figure-interfacet
    @Override
    public void setName(String name) {
        this.name = name;  // Sætter navnet på ellipsen
    }

    // Implementerer draw() metoden fra Figure-interfacet
    @Override
    public void draw() {
        System.out.println("Tegner " + name);  // Udskriver en besked der indikerer at ellipsen bliver tegnet
    }

    // Implementerer getArea() metoden fra Figure-interfacet
    @Override
    public double getArea() {
        return Math.PI * radius1 * radius2;  // Beregner og returnerer ellipsens areal ved at gange pi med radius 1 og radius 2
    }
}