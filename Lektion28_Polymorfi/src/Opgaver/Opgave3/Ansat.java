package Opgaver.Opgave3;

public abstract class Ansat extends Person {
    private double timelønssats;
    private int ugentligeArbejdsTimer;

    public Ansat(String name, String address, double timelønssats, int ugentligeArbejdsTimer) {
        super(name, address);
        this.timelønssats = timelønssats;
        this.ugentligeArbejdsTimer = ugentligeArbejdsTimer;
    }

    public double getTimelønssats() {
        return timelønssats;
    }

    public int getUgentligeArbejdsTimer() {
        return ugentligeArbejdsTimer;
    }

    public abstract double getLoen();
}
