package Opgaver.Opgave3;

public class Værkfører extends Ansat {
    private int værkførerÅr;
    private int tillæg;


    public Værkfører(String name, String address, double timelønssats, int værkførerÅr, int tillæg, int ugentligeArbejdstimer) {
        super(name, address, timelønssats, ugentligeArbejdstimer);
        this.værkførerÅr = værkførerÅr;
        this.tillæg = tillæg;
    }



    public int getVærkførerÅr() {
        return værkførerÅr;
    }

    public void setVærkførerÅr(int værkførerÅr) {
        this.værkførerÅr = værkførerÅr;
    }

    public int getTillæg() {
        return tillæg;
    }

    public void setTillæg(int tillæg) {
        this.tillæg = tillæg;
    }

    @Override
    public double getLoen() {
        return super.getTimelønssats() * super.getUgentligeArbejdsTimer() + tillæg;
    }
}
