package Opgaver.Opgave4;

public class FødeVare extends Vare {
    public FødeVare(int pris, String navn) {
        super(pris, navn);
    }

    @Override
    public double beregnMoms() {
        return super.getPris() * 0.05;
    }
}
