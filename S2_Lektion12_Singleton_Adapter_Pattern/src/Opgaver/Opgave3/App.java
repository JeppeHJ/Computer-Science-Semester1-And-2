package Opgaver.Opgave3;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("Jeppe",30);
        Person p2 = new Person("Jeppe2",31);
        Person p3 = new Person("Jeppe3",32);
        AnvendPersonAdministrator admin1 = new AnvendPersonAdministrator();
        admin1.testSingleton();
    }
}
