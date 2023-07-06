package Materiale.eksempelpersist;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PesrsistPerson {

    public static void main(String[] args) {
        Person p = new Person("Jane Jensen");

        // Tilføj karakterer til Person-objektet
        p.addGrade(12);
        p.addGrade(10);
        p.addGrade(7);

        // Gem Person-objektet til filen "person.ser"
        try {
            FileOutputStream f_out = new FileOutputStream("person.ser");
            ObjectOutputStream obj_out = new ObjectOutputStream(f_out);

            // Skriv Person-objektet til outputstrømmen
            obj_out.writeObject(p);
            System.out.println("Person er gemt: " + p);
            obj_out.close();

        } catch (IOException e) {
            // Håndter IOException, hvis der opstår problemer med outputstrømmen
            e.printStackTrace();
        }
    }
}
