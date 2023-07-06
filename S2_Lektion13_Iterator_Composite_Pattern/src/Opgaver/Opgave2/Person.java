package Opgaver.Opgave2;

public class Person {
    private String name; // Navnet på personen

    public Person(String name) {
        super();  // Kalder superklassens konstruktør
        this.name = name;  // Sætter navnet på personen
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;  // Hvis objektet er identisk med sig selv, returneres true
        }
        if (obj == null) {
            return false;  // Hvis objektet er null, returneres false
        }
        if (getClass() != obj.getClass()) {
            return false;  // Hvis objektet ikke tilhører samme klasse, returneres false
        }
        Person other = (Person) obj;  // Typekaster objektet til en Person
        if (name == null) {
            if (other.name != null) {
                return false;  // Hvis navnet er null, men den anden persons navn ikke er null, returneres false
            }
        } else if (!name.equals(other.name)) {
            return false;  // Hvis navnet ikke er null og det ikke er lig med den anden persons navn, returneres false
        }
        return true;  // Hvis ingen af de foregående betingelser opfyldes, returneres true
    }

    @Override
    public String toString() {
        return name;  // Returnerer navnet på personen som en streng
    }
}