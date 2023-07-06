package Opgaver.Opgave3;

public class ElMoms implements MomsBeregning {

    public double beregnMoms(double price) {
        double moms = price * 0.30;
        if (moms < 3) {
            return 3;
        }
        return moms;
    }
}
