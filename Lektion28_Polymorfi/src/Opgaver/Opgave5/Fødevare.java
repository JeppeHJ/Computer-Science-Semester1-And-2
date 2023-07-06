package Opgaver.Opgave5;

public class Fødevare extends Vare {
    private int holdbarhedsperiode;

    public Fødevare(double price, String navn, String beskrivelse, int holdbarhedsperiode) {
        super(price, navn, beskrivelse);
        this.holdbarhedsperiode = holdbarhedsperiode;
    }

    @Override
    public double beregnMoms() {
        return super.getPrice() * 0.05;
    }

    @Override
    public double beregnSalgspris() {
        return super.getPrice() + beregnMoms();
    }
}
