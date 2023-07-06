package Opgaver.Opgave3;

import java.util.ArrayList;
import java.util.List;

public class CompositeFigure implements Figure {
    // Deklarer private instansvariabler
    private String name; // Navnet på den sammensatte figur
    private List<Figure> figures = new ArrayList<>(); // Liste til at gemme de underliggende figurer

    // Konstruktør til at initialisere CompositeFigure-objektet
    public CompositeFigure(String name) {
        this.name = name;  // Sætter navnet på den sammensatte figur
    }

    // Metode til at tilføje en figur til den sammensatte figur
    public void addFigure(Figure figure) {
        figures.add(figure);  // Tilføjer figuren til listen over figurer
    }

    // Implementerer getName() metoden fra Figure-interfacet
    @Override
    public String getName() {
        return this.name;  // Returnerer navnet på den sammensatte figur
    }

    // Implementerer setName() metoden fra Figure-interfacet
    @Override
    public void setName(String name) {
        this.name = name;  // Sætter navnet på den sammensatte figur
    }

    // Implementerer draw() metoden fra Figure-interfacet
    @Override
    public void draw() {
        System.out.println("Tegner " + name);  // Udskriver en besked der indikerer at den sammensatte figur bliver tegnet
        for (Figure figure : figures) {
            figure.draw();  // Kalder draw() metoden på hver underliggende figur i listen
        }
    }

    // Implementerer getArea() metoden fra Figure-interfacet
    @Override
    public double getArea() {
        double totalArea = 0;
        for (Figure figure : figures) {
            totalArea += figure.getArea();  // Summerer arealerne af hver underliggende figur i listen
        }
        return totalArea;  // Returnerer den samlede areal af den sammensatte figur
    }
}