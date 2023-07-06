package Opgaver.Opgave1;

public class Mekaniker extends Person {
    private int svendeprøveÅr;
    private double timelønssats;


    public Mekaniker(String name, String address, int svendeprøveÅr, double timelønssats) {
        super(name, address);
        this.svendeprøveÅr = svendeprøveÅr;
        this.timelønssats = timelønssats;
    }

    public int getSvendeprøveÅr() {
        return svendeprøveÅr;
    }

    public void setSvendeprøveÅr(int svendeprøveÅr) {
        this.svendeprøveÅr = svendeprøveÅr;
    }

    public double getTimelønssats() {
        return timelønssats;
    }

    public void setTimelønssats(double timelønssats) {
        this.timelønssats = timelønssats;
    }
}
