package Opgaver.Opg3_Generisk_Klasse;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        Person<String> p1 = new Person<>("Lars");
        System.out.println(p1);

        Navn n1 = new Navn("Mads", "Mikkelsen");
        Person<Navn> p2 = new Person<>(n1);
        System.out.println(p2);

        ArrayList<Person<Navn>> personList = new ArrayList<>();
        personList.add(new Person<Navn>(new Navn("Hans", "Jensen")));
        personList.add(new Person<Navn>(new Navn("Bo", "Andersen")));
        personList.add(new Person<Navn>(new Navn("Lars", "Nielsen")));

        System.out.println("Før sortering: " + personList);

        Collections.sort(personList);

        System.out.println("Efter sortering: " + personList);
    }
}