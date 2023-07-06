package Opgaver.Opgave1;

public class Værkfører extends Mekaniker {
    private int værkførerÅr;
    private int tillæg;


    public Værkfører(String name, String address, int svendeprøveÅr, double timelønssats, int værkførerÅr, int tillæg) {
        super(name, address, svendeprøveÅr, timelønssats);
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
}
