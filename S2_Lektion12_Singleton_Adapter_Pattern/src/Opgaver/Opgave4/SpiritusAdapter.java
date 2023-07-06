package Opgaver.Opgave4;

public class SpiritusAdapter extends Vare {

    private Spiritus spiritus;

    public SpiritusAdapter(Spiritus spiritus) {
        // Kalder superklassens konstruktør med prisen og betegnelse fra spiritus-objektet
        super(spiritus.getPrisen(), spiritus.getBetgenelse());
        // Gemmer spiritus-objektet i adapteren
        this.spiritus = spiritus;
    }

    public double beregnMoms() {
        // Kalder hentMoms-metoden på spiritus-objektet og returnerer momsbeløbet
        return spiritus.hentMoms();
    }

}
