package Opgaver.Opgave5;

import java.util.ArrayList;

public class Indkøbsvogn {
    private ArrayList<Vare> varer;

    public Indkøbsvogn() {

    }

    public void addVare(Vare vare) {
        if (!varer.contains(vare)) {
            varer.add(vare);
        }
    }

    public double beregnTotalPris() {
        double sum = 0;
        for (Vare vare: varer) {
            sum += vare.beregnSalgspris();
        }
        return sum;
    }

}
