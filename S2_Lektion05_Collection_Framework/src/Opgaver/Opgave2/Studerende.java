package Opgaver.Opgave2;

import java.util.List;

public class Studerende {
    private int studieNr; // Deklarerer en privat variabel 'studieNr' af typen int
    private String navn; // Deklarerer en privat variabel 'navn' af typen String
    private List<Integer> karakterer; // Deklarerer en privat liste 'karakterer' af typen Integer

    public Studerende(int studieNr, String navn, List<Integer> karakterer) {
        this.studieNr = studieNr; // Tildeler den medfølgende værdi 'studieNr' til variablen 'studieNr'
        this.navn = navn; // Tildeler den medfølgende værdi 'navn' til variablen 'navn'
        this.karakterer = karakterer; // Tildeler den medfølgende liste 'karakterer' til variablen 'karakterer'
    }

    public int getStudieNr() {
        return studieNr; // Returnerer værdien af variablen 'studieNr'
    }

    public String getNavn() {
        return navn; // Returnerer værdien af variablen 'navn'
    }

    public List<Integer> getKarakterer() {
        return karakterer; // Returnerer listen af karakterer
    }

    public void setNavn(String navn) {
        this.navn = navn; // Opdaterer værdien af variablen 'navn' med den medfølgende værdi 'navn'
    }

    public void addKarakter(int karakter) {
        this.karakterer.add(karakter); // Tilføjer en karakter til listen 'karakterer'
    }

    @Override
    public String toString() {
        return "Studerende{" +
                "studieNr=" + studieNr +
                ", navn='" + navn + '\'' +
                ", karakterer=" + karakterer +
                '}';
    }
}
