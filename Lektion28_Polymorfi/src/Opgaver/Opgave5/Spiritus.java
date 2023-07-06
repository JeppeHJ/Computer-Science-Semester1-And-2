package Opgaver.Opgave5;

public class Spiritus extends Vare {
    private double alkoholprocent;

    public Spiritus(double price, String navn, String beskrivelse, double alkoholprocent) {
        super(price, navn, beskrivelse);
        this.alkoholprocent = alkoholprocent;
    }

    @Override
    public double beregnMoms() {
        double moms = super.getPrice() * 0.8;
        if (super.getPrice() > 90) {
            moms = super.getPrice() * 1.2;
        }
        return moms;
    }

    @Override
    public double beregnSalgspris() {
        return super.getPrice() + beregnMoms();
    }
}
