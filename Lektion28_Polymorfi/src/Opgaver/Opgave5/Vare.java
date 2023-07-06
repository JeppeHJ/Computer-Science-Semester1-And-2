package Opgaver.Opgave5;

public abstract class Vare {
    private double price;
    private String navn;
    private String beskrivelse;

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


    public String getBeskrivelse() {
        return beskrivelse;
    }

    public abstract double beregnMoms();
    public abstract double beregnSalgspris();

}
