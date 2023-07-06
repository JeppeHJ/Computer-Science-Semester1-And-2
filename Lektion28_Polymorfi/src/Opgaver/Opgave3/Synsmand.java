package Opgaver.Opgave3;

public class Synsmand extends Mekaniker {
    private int synsCount;

    public Synsmand(String name, String address, int svendeprøveÅr, double timelønssats, int synsCount, int ugentligeArbejdstimer) {
        super(name, address, svendeprøveÅr, timelønssats, ugentligeArbejdstimer);
        this.synsCount = synsCount;
    }

    public double getLoen() {
        return synsCount * 29;
    }
}
