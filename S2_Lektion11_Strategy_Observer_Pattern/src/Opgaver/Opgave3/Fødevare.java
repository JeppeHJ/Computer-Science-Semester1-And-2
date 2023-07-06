package Opgaver.Opgave3;

public class Fødevare extends Vare {
    private int holdbarhedsperiode;

    public Fødevare(double price, String navn, String beskrivelse, int holdbarhedsperiode) {
        super(price, navn, beskrivelse);
        this.holdbarhedsperiode = holdbarhedsperiode;
    }

}
