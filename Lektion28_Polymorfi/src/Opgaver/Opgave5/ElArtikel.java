package Opgaver.Opgave5;

public class ElArtikel extends Vare {
    private double energi;

    public ElArtikel(double price, String navn, String beskrivelse, double energi) {
        super(price, navn, beskrivelse);
        this.energi = energi;
    }

    @Override
    public double beregnMoms() {
        double moms = super.getPrice() * 0.30;
        if (moms < 3) {
            return 3;
        }
        return moms;
    }

    @Override
    public double beregnSalgspris() {
        return super.getPrice() + beregnMoms();
    }
}
