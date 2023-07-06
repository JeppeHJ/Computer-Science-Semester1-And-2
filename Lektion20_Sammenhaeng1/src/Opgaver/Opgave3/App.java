package Opgaver.Opgave3;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Rental> rentals = new ArrayList<>();

        Car car1 = new Car("License1",10,1992);
        Car car2 = new Car("License2",15,1993);
        Car car3 = new Car("License3",20,1994);
        Car car4 = new Car("License4",25,1995);
        Car car5 = new Car("License5",30,1996);

        Rental rental1 = new Rental(1,5,"10-10-2020");
        Rental rental2 = new Rental(2,10,"10-10-2021");

        rental1.addCar(car1);
        rental1.addCar(car2);
        rental1.addCar(car3);

        rental2.addCar(car4);
        rental2.addCar(car5);

        System.out.println(rental1.getPrice());

    }
}
