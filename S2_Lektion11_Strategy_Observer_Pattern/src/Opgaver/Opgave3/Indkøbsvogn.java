package Opgaver.Opgave3;

import java.util.ArrayList;

public class Indkøbsvogn {
    private ArrayList<Vare> varer;

    public Indkøbsvogn() {
        this.varer = new ArrayList<>();

    }

    public void addVare(Vare vare) {
        if (!varer.contains(vare)) {
            varer.add(vare);
        }
    }

}
