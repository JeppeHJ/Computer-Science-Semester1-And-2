package Opgaver.Opgave3;

public class Arbejdsdreng extends Ansat {
    public Arbejdsdreng(String name, String address, double timelønssats, int ugentligeArbejdstimer) {
        super(name, address, timelønssats, ugentligeArbejdstimer);
    }

    @Override
    public double getLoen() {
        return super.getUgentligeArbejdsTimer() * super.getTimelønssats();
    }
}
