package Opgaver.Opgave4;

public class Rektangel extends Firkant {
    private int sideLængde2;

    public Rektangel(int x, int y, int sideLængde, int sideLængde2) {
        super(x, y, sideLængde);
        this.sideLængde2 = sideLængde2;
    }

    @Override
    public double beregnAreal() {
        return super.getSideLængde() * sideLængde2;
    }
}
