package Opgaver.Opgave4;

public class ElVare extends Vare {
    public ElVare(int pris, String navn) {
        super(pris, navn);
    }

    @Override
    public double beregnMoms() {
        return super.getPris() * 0.30;
    }
}
