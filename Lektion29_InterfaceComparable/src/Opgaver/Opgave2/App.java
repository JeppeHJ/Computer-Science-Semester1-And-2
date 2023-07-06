package Opgaver.Opgave2;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Customer c1 = new Customer("John", "Doe", 25);
        Customer c2 = new Customer("Alice", "Smith", 30);
        Customer c3 = new Customer("Bob", "Johnson", 35);
        Customer c4 = new Customer("Emma", "Williams", 40);
        Customer c5 = new Customer("Michael", "Brown", 45);
        Customer c6 = new Customer("Sophia", "Davis", 50);
        Customer c7 = new Customer("David", "Miller", 55);
        Customer c8 = new Customer("Olivia", "Wilson", 60);
        Customer c9 = new Customer("James", "Anderson", 65);
        Customer c10 = new Customer("Emily", "Taylor", 70);

        Customer[] customers = new Customer[10];

        customers[0] = c1;
        customers[1] = c2;
        customers[2] = c3;
        customers[3] = c4;
        customers[4] = c5;
        customers[5] = c6;
        customers[6] = c7;
        customers[7] = c8;
        customers[8] = c9;
        customers[9] = c10;

        System.out.println(lastCustomer(customers));
        System.out.println(Arrays.toString(afterCustomer(customers, c1)));

    }

    public static Customer lastCustomer(Customer[] customers) {
        Customer lastCustomer = customers[0];
        for (int i = 0; i < customers.length - 1; i++) {
            if (customers[i].compareTo(lastCustomer) > 0) {
                lastCustomer = customers[i];
            }
        }
        return lastCustomer;
    }

    public static Customer[] afterCustomer(Customer[] customers, Customer customer) {
        int count = 0;
        for (int i = 0; i <= customers.length - 1; i++) {
            if (customers[i].compareTo(customer) == 0) {
                count = i;
                break;
                }
            }

        //count = 0

        Customer[] newList = new Customer[customers.length - (count + 1)];
        for (int j = count + 1, k = 0; j < customers.length; j++, k++) {
            newList[k] = customers[j];
        }

        return newList;
    }
}
