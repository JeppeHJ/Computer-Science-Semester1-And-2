package Opgaver.Opgave2;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Opret en skole
        Skole skole = new Skole("Min Skole");

        // Opret studerende
        Studerende studerende1 = new Studerende(1, "Peter", new ArrayList<>());
        Studerende studerende2 = new Studerende(2, "Anna", new ArrayList<>());
        Studerende studerende3 = new Studerende(3, "Mads", new ArrayList<>());

        // Tilføj studerende til skolen
        skole.addStuderende(studerende1);
        skole.addStuderende(studerende2);
        skole.addStuderende(studerende3);

        // Tilføj karakterer til studerende
        studerende1.addKarakter(10);
        studerende1.addKarakter(12);
        studerende2.addKarakter(7);
        studerende2.addKarakter(9);
        studerende3.addKarakter(11);
        studerende3.addKarakter(8);

        // Udskriv skolens navn
        System.out.println("Skolens navn: " + skole.getNavn());

        // Udskriv gennemsnittet af karakterer for alle studerende
        System.out.println("Gennemsnit af karakterer: " + skole.gennemsnit());

        // Find studerende med studieNr
        int studieNr = 2;
        Studerende foundStuderende = skole.findStuderende(studieNr);
        if (foundStuderende != null) {
            System.out.println("Fundet studerende: " + foundStuderende);
        } else {
            System.out.println("Ingen studerende fundet med studieNr " + studieNr);
        }
    }
}
