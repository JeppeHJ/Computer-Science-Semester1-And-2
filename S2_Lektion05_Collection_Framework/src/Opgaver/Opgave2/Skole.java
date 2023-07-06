package Opgaver.Opgave2;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Skole {
    private String navn; // Deklarerer en privat variabel 'navn' af typen String
    private List<Studerende> studerendeList; // Deklarerer en privat liste 'studerendeList' af typen Studerende

    public Skole(String navn) {
        this.navn = navn; // Tildeler den medfølgende værdi 'navn' til variablen 'navn'
        this.studerendeList = new ArrayList<>(); // Initialiserer listen 'studerendeList' som en ny instans af ArrayList
    }

    public String getNavn() {
        return navn; // Returnerer værdien af variablen 'navn'
    }

    public void addStuderende(Studerende studerende) {
        if (!this.studerendeList.contains(studerende)) {
            this.studerendeList.add(studerende); // Tilføjer en studerende til listen 'studerendeList', hvis den ikke allerede er til stede
        }
    }

    public void removeStuderende(Studerende studerende) {
        if (this.studerendeList.contains(studerende)) {
            this.studerendeList.remove(studerende); // Fjerner en studerende fra listen 'studerendeList', hvis den er til stede
        }
    }

    public double gennemsnit() {
        double sum = 0; // Initialiserer en variabel 'sum' til 0, der holder styr på den samlede sum af karakterer
        int count = 0; // Initialiserer en variabel 'count' til 0, der holder styr på antallet af karakterer
        for (Studerende student: studerendeList) {
            for (Integer karakter: student.getKarakterer()) {
                sum += karakter; // Lægger hver karakter til 'sum'
                count++; // Øger 'count' med 1 for hver karakter
            }
        }

        return sum / count; // Returnerer gennemsnittet ved at dividere summen med antallet af karakterer
    }

    public Studerende findStuderende(int studieNr) {
        for (Studerende student: studerendeList) {
            if (student.getStudieNr() == studieNr) {
                return student; // Returnerer den studerende med det givne studienummer, hvis den findes
            }
        }
        return null; // Returnerer null, hvis ingen studerende med det givne studienummer blev fundet
    }

    @Override
    public String toString() {
        return "Skole{" +
                "navn='" + navn + '\'' +
                '}';
    }
}
