package Materiale.eksempelpersist;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LoadAndPersistPerson {

    public static void main(String[] args) {
        Person person = null;

        // Indlæs Person-objektet fra filen "person.ser"
        try (FileInputStream f_in = new FileInputStream("person.ser")) {
            try (ObjectInputStream obj_in = new ObjectInputStream(f_in)) {

                // Læs objektet fra inputstrømmen
                Object obj = obj_in.readObject();
                if (obj instanceof Person) {
                    person = (Person) obj;
                    System.out.println(person);
                }
            }
        }
        catch (IOException e) {
            // Håndter IOException, hvis der opstår problemer med inputstrømmen
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            // Håndter ClassNotFoundException, hvis der ikke kan findes en Person-klasse
            e.printStackTrace();
        }

        // Tilføj karakterer til Person-objektet
        person.addGrade(4);
        person.addGrade(12);

        // Gem det opdaterede Person-objekt til filen "person.ser"
        try (FileOutputStream f_out = new FileOutputStream("person.ser")) {
            try (ObjectOutputStream obj_out = new ObjectOutputStream(f_out)) {

                // Skriv det opdaterede Person-objekt til outputstrømmen
                obj_out.writeObject(person);
                System.out.println("Person er gemt: " + person);
            }

        }
        catch (IOException e) {
            // Håndter IOException, hvis der opstår problemer med outputstrømmen
            e.printStackTrace();
        }
    }
}
