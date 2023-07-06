package Opgaver.Opgave2;

import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private ArrayList<Gift> gifts;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.gifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        if (!this.gifts.contains(gift)) {
            this.gifts.add(gift);
        }
    }

    public void removeGift(Gift gift) {
        if (this.gifts.contains(gift)) {
            this.gifts.remove(gift);
        }
    }

    public ArrayList<Gift> getGifts() {
        return new ArrayList<Gift>(gifts);
    }

    public ArrayList<Person> getGivers() {
        ArrayList<Person> givers = new ArrayList<>();
        for (Gift gift: this.gifts) {
            givers.add(gift.getGiver());
        }

        return new ArrayList<>(givers);
    }

    public double getTotalGiftValue() {
        double sum = 0;
        for (Gift gift: this.gifts) {
            sum += gift.getPrice();
        }
        return sum;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
