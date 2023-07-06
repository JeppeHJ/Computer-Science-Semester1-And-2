package Opgaver.Opgave1;

import java.util.ArrayList;

public class Car {
    private String license;
    private double pricePerDay;
    private int purchaseYear;
    private ArrayList<Rental> rentals;

    public Car(String license, double pricePerDay, int purchaseYear) {
        this.license = license;
        this.pricePerDay = pricePerDay;
        this.purchaseYear = purchaseYear;
        this.rentals = new ArrayList<>();
    }

    public void addRental(Rental rental) {
        if (!this.rentals.contains(rental)) {
            this.rentals.add(rental);
            rental.addCar(this);
        }
    }

    public void removeRental(Rental rental) {
        if (this.rentals.contains(rental)) {
            this.rentals.remove(rental);
            rental.removeCar(this);
        }
    }

    public int highestDaysRented() {
        int days = 0;
        for (Rental rental: this.rentals) {
            if (rental.getDays() > days) {
                days = rental.getDays();
            }
        }

        return days;
    }

    public ArrayList<Rental> getRentals() {
        return new ArrayList<Rental>(this.rentals);
    }

    public String getLicense() {
        return license;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public int getPurchaseYear() {
        return purchaseYear;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
}
