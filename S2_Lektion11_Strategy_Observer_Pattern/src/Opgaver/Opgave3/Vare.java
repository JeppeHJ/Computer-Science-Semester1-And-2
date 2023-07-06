package Opgaver.Opgave3;

public abstract class Vare {
    private double price;
    private String navn;
    private String beskrivelse;
    private MomsBeregning momsBeregning;

    public Vare(double price, String navn, String beskrivelse) {
        this.price = price;
        this.navn = navn;
        this.beskrivelse = beskrivelse;
    }

    public double getPrice() {
        return price;
    }

    public String getNavn() {
        return navn;
    }

    public double beregnMoms() {
        return momsBeregning.beregnMoms(this.price);
    }

    public void setMomsBeregning(MomsBeregning momsBeregning) {
        this.momsBeregning = momsBeregning;
    }

    public double beregnTotalPris() {
        return momsBeregning.beregnMoms(this.price) + this.price;
    }


    public String getBeskrivelse() {
        return beskrivelse;
    }

}
