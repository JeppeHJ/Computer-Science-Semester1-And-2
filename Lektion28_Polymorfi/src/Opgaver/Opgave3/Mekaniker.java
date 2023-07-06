package Opgaver.Opgave3;

public class Mekaniker extends Ansat {
    private int svendeprøveÅr;

    public Mekaniker(String name, String address, int svendeprøveÅr, double timelønssats, int ugentligeArbejdstimer) {
        super(name, address, timelønssats, ugentligeArbejdstimer);
        this.svendeprøveÅr = svendeprøveÅr;
    }

    public int getSvendeprøveÅr() {
        return svendeprøveÅr;
    }

    @Override
    public double getLoen() {
        return super.getTimelønssats() * super.getUgentligeArbejdsTimer();
    }
}
