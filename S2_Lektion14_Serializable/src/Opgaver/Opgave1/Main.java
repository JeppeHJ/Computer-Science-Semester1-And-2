package Opgaver.Opgave1;

import Materiale.eksempelpersist.Person;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyTime myTime = null;

        // Indlæs MyTime-objektet fra filen "myTime.ser"
        try {
            FileInputStream f_in = new FileInputStream("myTime.ser");
            ObjectInputStream obj_in = new ObjectInputStream(f_in);

            // Læs objektet fra inputstrømmen og kontroller om det er af typen MyTime
            Object obj = obj_in.readObject();
            if (obj instanceof MyTime) {
                myTime = (MyTime) obj;
            }

            obj_in.close();
            f_in.close();

        } catch (ClassNotFoundException e) {
            // Håndter ClassNotFoundException, hvis den opstår ved deserialisering af objektet
            e.printStackTrace();
        } catch (IOException e) {
            // Håndter IOException, hvis der opstår problemer med inputstrømmen
            e.printStackTrace();
        }

        // Øg tiden med tre enheder
        myTime.increase();
        myTime.increase();
        myTime.increase();

        // Udskriv den aktuelle tid
        System.out.println(myTime.getTime());

        // Gem MyTime-objektet til filen "myTime.ser"
        try {
            FileOutputStream f_out = new FileOutputStream("myTime.ser");
            ObjectOutputStream obj_out = new ObjectOutputStream(f_out);

            // Skriv MyTime-objektet til outputstrømmen
            obj_out.writeObject(myTime);
            System.out.println("Tiden er gemt: " + myTime);
            obj_out.close();

        } catch (IOException e) {
            // Håndter IOException, hvis der opstår problemer med outputstrømmen
            e.printStackTrace();
        }
    }
}
