package Opgaver.Opgave3;

public class AnvendPersonAdministrator {
    private PersonAdministrator personAdministrator;

    public AnvendPersonAdministrator() {
        this.personAdministrator = PersonAdministrator.getInstance();
    }

    public void testSingleton() {
        // Oprette nogle Person-objekter
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        // Tilføj Person-objekter til PersonAdministrator
        personAdministrator.addPerson(person1);
        personAdministrator.addPerson(person2);

        // Udskriv alle Person-objekter i PersonAdministrator
        System.out.println("Personer i PersonAdministrator:");
        for (Person person : personAdministrator.getPersoner()) {
            System.out.println("Navn: " + person.getNavn() + ", Alder: " + person.getAlder());
        }
    }
}
