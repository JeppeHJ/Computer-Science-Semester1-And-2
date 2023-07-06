package Opgaver.Opgave4;

public class Chili implements Measurable {
    private String name;
    private double strength;

    public Chili(String name, double strength) {
        this.name = name;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    @Override
    public double getMeasure() {
        return strength;
    }

    @Override
    public String toString() {
        return "Chili{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                '}';
    }
}
