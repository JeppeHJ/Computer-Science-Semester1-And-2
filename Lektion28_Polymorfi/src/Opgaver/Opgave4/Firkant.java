package Opgaver.Opgave4;

public class Firkant extends Figur {
    private int sideLængde;

    public Firkant(int x, int y, int sideLængde) {
        super(x, y);
        this.sideLængde = sideLængde;
    }

    public int getSideLængde() {
        return sideLængde;
    }

    @Override
    public double beregnAreal() {
        return sideLængde * sideLængde;
    }

}
