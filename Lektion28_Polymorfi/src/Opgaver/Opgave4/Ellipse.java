package Opgaver.Opgave4;

public class Ellipse extends Cirkel {
    private double radius2;

    public Ellipse(int x, int y, double radius, double radius2) {
        super(x, y, radius);
        this.radius2 = radius2;

    }

    @Override
    public double beregnAreal() {
        return 3.14 * super.getRadius() * radius2;
    }
}
