package Opgaver.Opgave2;

public class Customer implements Comparable {
    private String name;
    private String lastName;
    private int age;

    public Customer(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public int compareTo(Object o) {
        if (o instanceof Customer) {
            Customer customerA = (Customer) o;
            if (this.getName().compareTo(customerA.getName()) < 0) {
                return -1;
            } else if (this.getName().compareTo(customerA.getName()) > 0) {
                return 1;
            } else {
                if (this.getLastName().compareTo(customerA.getLastName()) < 0) {
                    return -1;
                } else if (this.getLastName().compareTo(customerA.getLastName()) > 0) {
                    return 1;
                } else {
                    return String.valueOf(this.getAge()).compareTo(String.valueOf(customerA.getAge()));
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
