package Opgaver.Opgave4;

public class Main {
    public static void main(String[] args) {
        Spiritus spiritus = new Spiritus(100, "Vodka");
        SpiritusAdapter adapter = new SpiritusAdapter(spiritus);

        System.out.println("Spiritus information:");
        System.out.println("Navn: " + adapter.getNavn());
        System.out.println("Pris: " + adapter.getPris());
        System.out.println("Momsbeløb: " + adapter.beregnMoms());
    }
}
