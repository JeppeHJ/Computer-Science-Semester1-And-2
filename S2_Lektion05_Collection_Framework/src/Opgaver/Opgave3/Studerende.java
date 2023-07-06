package Opgaver.Opgave3;

import java.util.List;

public class Studerende implements Comparable {
    private int studieNr;
    private String navn;
    private List<Integer> karakterer;

    public Studerende(int studieNr, String navn, List<Integer> karakterer) {
        this.studieNr = studieNr;
        this.navn = navn;
        this.karakterer = karakterer;
    }

    public int getStudieNr() {
        return studieNr;
    }

    public String getNavn() {
        return navn;
    }

    public List<Integer> getKarakterer() {
        return karakterer;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
    public void addKarakter(int karakter) {
        this.karakterer.add(karakter);
    }

    @Override
    public String toString() {
        return "Studerende{" +
                "studieNr=" + studieNr +
                ", navn='" + navn + '\'' +
                ", karakterer=" + karakterer +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Studerende) {
            Studerende student = (Studerende) o;

            return Integer.compare(this.studieNr, student.getStudieNr());
        }
        return 0;

    }
}
