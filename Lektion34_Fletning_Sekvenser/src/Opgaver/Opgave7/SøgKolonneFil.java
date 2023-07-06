package Opgaver.Opgave7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SøgKolonneFil {
    public static void main(String[] args) {
        System.out.println(linFileSearchPerson("personer.txt","Olsen"));
    }

    public static String linFileSearchPerson(String fileName, String target) {
        String name = "";
        File file = new File(fileName);
        try (Scanner in = new Scanner(file)) {
            while (in.hasNextLine()) {
                String line = in.nextLine();
                if (line.contains(target)) {
                    String[] split = line.split("\\s+");
                    name = split[1] + " " + split[2];
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return name;
    }
}
