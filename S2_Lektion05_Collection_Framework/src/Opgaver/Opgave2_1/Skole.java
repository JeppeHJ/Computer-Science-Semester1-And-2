package Opgaver.Opgave2_1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Skole {
    private String navn;
    private Set<Studerende> studerendeList;

    public Skole(String navn) {
        this.navn = navn;
        this.studerendeList = new HashSet<>();
    }

    public String getNavn() {
        return navn;
    }

    public void addStuderende(Studerende studerende) {
        if (!this.studerendeList.contains(studerende)) {
            this.studerendeList.add(studerende);
        }
    }

    public void removeStuderende(Studerende studerende) {
        if (this.studerendeList.contains(studerende)) {
            this.studerendeList.remove(studerende);
        }
    }

    public double gennemsnit() {
        double sum = 0;
        int count = 0;
        for (Studerende student: studerendeList) {
            for (Integer karakter: student.getKarakterer()) {
                sum += karakter;
                count++;
            }
        }

        return sum / count;
    }

    public Studerende findStuderende(int studieNr) {
        for (Studerende student: studerendeList) {
            if (student.getStudieNr() == studieNr) {
                return student;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Skole{" +
                "navn='" + navn + '\'' +
                '}';
    }
}
