package Opgaver.Opgave3;

public class FixedDiscount implements Discount {
    private int fixedDiscount;
    private int discountLimit;

    public FixedDiscount(int fixedDiscount, int discountLimit) {
        this.fixedDiscount = fixedDiscount;
        this.discountLimit = discountLimit;
    }

    public double getDiscount(double price) {
        if (price > this.discountLimit) {
            price = price - fixedDiscount;
        }
        return price;
    }
}
