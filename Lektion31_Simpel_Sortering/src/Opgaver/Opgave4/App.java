package Opgaver.Opgave4;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        // Opret Customer-objekter og tilføj dem til listen
        Customer customer1 = new Customer("Johnson", "John", 25);
        Customer customer2 = new Customer("Smith", "Alice", 30);
        Customer customer3 = new Customer("Brown", "David", 40);
        Customer customer4 = new Customer("Johnson", "Emma", 35);

        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);

        System.out.println("Før sortering:");
        for (Customer customer : customerList) {
            System.out.println(customer);
        }

        Collections.sort(customerList);

        System.out.println("\nEfter sortering:");
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }
    }
