package Opgaver.Opgave4;

public class Cirkel extends Figur {
    private double radius;

    public Cirkel(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double beregnAreal() {
        return 3.14 * (radius * radius);
    }
}
