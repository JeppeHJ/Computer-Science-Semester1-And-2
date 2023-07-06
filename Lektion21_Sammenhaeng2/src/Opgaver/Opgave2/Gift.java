package Opgaver.Opgave2;

public class Gift {
    private String description;
    private double price;
    private Person giver;

    public Gift(String description, double price, Person person) {
        this.description = description;
        this.price = price;
        this.giver = person;
    }

    public double getPrice() {
        return price;
    }

    public Person getGiver() {
        return giver;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
