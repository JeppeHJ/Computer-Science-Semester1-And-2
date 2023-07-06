package Opgaver.Opgave2;

public class PercentDiscount extends Discount {
    private int discountPercentage;

    public PercentDiscount(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double getDiscount(double price) {
        return price * (0.01 * discountPercentage);
    }

}
