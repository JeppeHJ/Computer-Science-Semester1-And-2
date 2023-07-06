package Opgaver.Opgave3;

public class PercentDiscount implements Discount {
    private int discountPercentage;

    public PercentDiscount(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double getDiscount(double price) {
        return price * (0.01 * discountPercentage);
    }

}
