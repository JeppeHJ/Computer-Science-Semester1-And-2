package Opgaver.Opgave3;

public class AlkoholMoms implements MomsBeregning {

    public double beregnMoms(double price) {
        double moms = price * 0.8;
        if (price > 90) {
            moms = price * 1.2;
        }
        return moms;
    }
}
