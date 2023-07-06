package Opgaver.Opgave3;

public class FødevareMoms implements MomsBeregning {

    public double beregnMoms(double price) {
        return price * 0.05;
    }
}
