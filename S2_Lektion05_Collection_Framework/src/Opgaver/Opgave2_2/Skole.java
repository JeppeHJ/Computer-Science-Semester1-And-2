package Opgaver.Opgave2_2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Skole {
    private String navn;
    private Map<Integer, Studerende> studerendeList;

    public Skole(String navn) {
        this.navn = navn;
        this.studerendeList = new HashMap<>();
    }

    public String getNavn() {
        return navn;
    }

    public void addStuderende(Studerende student) {
        this.studerendeList.put(student.getStudieNr(), student);
        }


    public void removeStuderende(Studerende studerende) {
        this.studerendeList.remove(studerende.getStudieNr());
        }

    public double gennemsnit() {
        double sum = 0;
        int count = 0;
        for (Studerende student: studerendeList.values()) {
            for (Integer karakter: student.getKarakterer()) {
                sum += karakter;
                count++;
            }
        }

        return sum / count;
    }

    public Studerende findStuderende(int studieNr) {
        return this.studerendeList.get(studieNr);
    }

    @Override
    public String toString() {
        return "Skole{" +
                "navn='" + navn + '\'' +
                '}';
    }
}
