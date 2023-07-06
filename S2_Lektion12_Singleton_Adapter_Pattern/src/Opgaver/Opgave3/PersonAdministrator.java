package Opgaver.Opgave3;

import java.util.ArrayList;

public class PersonAdministrator {
    private static PersonAdministrator uniqueInstance;
    private ArrayList<Person> personer;

    private PersonAdministrator() {
        // Opretter en tom ArrayList til at holde styr på Person objekter
        this.personer = new ArrayList<>();
    }

    public static PersonAdministrator getInstance() {
        if (uniqueInstance == null) {
            // Hvis uniqueInstance er null, oprettes en ny instans af PersonAdministrator
            uniqueInstance = new PersonAdministrator();
        }
        return uniqueInstance;
    }

    public void addPerson(Person person) {
        // Tilføjer en Person til personer ArrayList
        this.personer.add(person);
    }

    public ArrayList<Person> getPersoner() {
        // Returnerer personer ArrayList
        return personer;
    }
}
