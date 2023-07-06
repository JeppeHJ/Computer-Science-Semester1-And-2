package Opgaver.Opgave1;

import java.util.ArrayList;

public class Rental {
    private int number;
    private int days;
    private String date;
    private ArrayList<Car> cars;

    public Rental(int number, int days, String date) {
        this.number = number;
        this.days = days;
        this.date = date;
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        if (!this.cars.contains(car)) {
            this.cars.add(car);
            car.addRental(this);
        }
    }

    public void removeCar(Car car) {
        if (this.cars.contains(car)) {
            this.cars.remove(car);
            car.removeRental(this);
        }
    }

    public ArrayList<Car> getCars() {
        return new ArrayList<>(this.cars);
    }

    public double getPrice() {
        double sum = 0;
        for (Car car: this.cars) {
            sum += car.getPricePerDay() * this.days;
        }

        return sum;
    }

    public int getDays() {
        return this.days;
    }



}
