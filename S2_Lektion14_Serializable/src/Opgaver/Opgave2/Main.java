package Opgaver.Opgave2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyTime myTime2 = null;

        // Indlæs MyTime-objektet fra filen "myTime2.ser"
        try {
            FileInputStream f_in = new FileInputStream("myTime2.ser");
            ObjectInputStream obj_in = new ObjectInputStream(f_in);

            // Læs objektet fra inputstrømmen og kontroller om det er af typen MyTime
            Object obj = obj_in.readObject();
            if (obj instanceof MyTime) {
                myTime2 = (MyTime) obj;
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

        // Øg tiden med to enheder
        myTime2.increase();
        myTime2.increase();

        // Gem den aktuelle tid og tilføj den til listen af tider
        myTime2.saveTime();

        // Øg tiden med fire enheder
        myTime2.increase();
        myTime2.increase();
        myTime2.increase();
        myTime2.increase();

        // Gem den aktuelle tid og tilføj den til listen af tider
        myTime2.saveTime();

        // Gem MyTime-objektet til filen "myTime2.ser"
        try {
            FileOutputStream f_out = new FileOutputStream("myTime2.ser");
            ObjectOutputStream obj_out = new ObjectOutputStream(f_out);

            // Skriv MyTime-objektet til outputstrømmen
            obj_out.writeObject(myTime2);
            System.out.println("Tiden er gemt: " + myTime2.getTime());
            System.out.println(myTime2.getTimes());
            obj_out.close();

        } catch (IOException e) {
            // Håndter IOException, hvis der opstår problemer med outputstrømmen
            e.printStackTrace();
        }

    }
}
