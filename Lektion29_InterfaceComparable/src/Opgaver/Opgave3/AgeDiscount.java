package Opgaver.Opgave3;

public class AgeDiscount implements Discount {
    private int age;
    public AgeDiscount(int age) {
        this.age = age;
    }

    @Override
    public double getDiscount(double price) {
        return price * (0.1 * age);
    }
}
