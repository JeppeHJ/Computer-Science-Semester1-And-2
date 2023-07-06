package Opgaver.Opgave3;

public class ElArtikel extends Vare {
    private double energi;

    public ElArtikel(double price, String navn, String beskrivelse, double energi) {
        super(price, navn, beskrivelse);
        this.energi = energi;
    }

}
