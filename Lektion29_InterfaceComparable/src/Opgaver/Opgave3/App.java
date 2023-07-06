package Opgaver.Opgave3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) {
        Product p1 = new Product(1,"Lol1",1);
        Product p2 = new Product(2,"Lol2",1);
        Product p3 = new Product(3,"Lol3",1);
        Product p4 = new Product(4,"Lol4",1);
        Product p5 = new Product(5,"Lol5",1);

        Customer c1 = new Customer("Hej1", LocalDate.of(1992,10,10));
        Customer c2 = new Customer("Hej1", LocalDate.of(1992,10,10));

        Order o1 = new Order(1);
        Order o2 = new Order(1);
        Order o3 = new Order(1);
        Order o4 = new Order(1);
        Order o5 = new Order(1);
        Order o6 = new Order(1);

        o1.createOrderLine(5,p1);
        o1.createOrderLine(10,p2);
        o1.createOrderLine(5,p3);
        o1.createOrderLine(5,p4);

        o2.createOrderLine(10,p5);
        o2.createOrderLine(5,p4);
        o2.createOrderLine(3,p3);
        o4.createOrderLine(3,p3);
        o4.createOrderLine(3,p3);
        o5.createOrderLine(3,p3);
        o5.createOrderLine(3,p3);
        o6.createOrderLine(3,p3);
        o6.createOrderLine(3,p3);
        o6.createOrderLine(3,p3);
        o6.createOrderLine(3,p3);
        o6.createOrderLine(3,p3);
        o6.createOrderLine(3,p3);

        c1.addOrder(o1);
        c1.addOrder(o2);
        c1.addOrder(o3);
        c1.addOrder(o4);
        c2.addOrder(o5);
        c2.addOrder(o6);
        PercentDiscount d1 = new PercentDiscount(10);
        AgeDiscount d2 = new AgeDiscount((int) ChronoUnit.YEARS.between(c2.getBirthday(), LocalDate.now()));
        c2.setDiscount(d2);


        System.out.println(c2.totalBuyWithDiscount());
    }
}
