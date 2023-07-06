package Opgaver.Opgave2;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        PersonCollection collection = new PersonCollection();

        collection.add(new Person("John"));
        collection.add(new Person("Jane"));
        collection.add(new Person("Mike"));

        Iterator<Person> iterator = collection.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person);
        }
    }
}
