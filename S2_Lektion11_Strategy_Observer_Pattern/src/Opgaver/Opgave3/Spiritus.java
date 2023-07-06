package Opgaver.Opgave3;

public class Spiritus extends Vare {
    private double alkoholprocent;

    public Spiritus(double price, String navn, String beskrivelse, double alkoholprocent) {
        super(price, navn, beskrivelse);
        this.alkoholprocent = alkoholprocent;
    }

}
