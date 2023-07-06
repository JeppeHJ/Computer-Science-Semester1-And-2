package Opgaver.Opgave4;

public class StrengthFilter implements Filter {
    private double threshold;

    public StrengthFilter(double threshold) {
        this.threshold = threshold;
    }

    @Override
    public boolean accept(Object x) {
        if (x instanceof Chili) {
            Chili chili = (Chili) x;
            return chili.getStrength() > threshold;
        }
        return false;
    }
}
