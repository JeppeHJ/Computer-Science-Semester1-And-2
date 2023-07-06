package Opgaver.Opgave2;

public class Synsmand extends Mekaniker {
    private int synsCount;

    public Synsmand(String name, String address, int svendeprøveÅr, double timelønssats, int synsCount) {
        super(name, address, svendeprøveÅr, timelønssats);
        this.synsCount = synsCount;
    }

    public double getLoen() {
        return synsCount * 29;
    }
}
