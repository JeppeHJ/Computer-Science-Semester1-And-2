package Opgaver.Opgave3;

import java.util.*;

public class UdskrivListeIterator {
    public static void main(String[] args) {
        // Opretter en liste af heltal
        List<Integer> numbers = new ArrayList<>();
        // Tilføjer heltal til listen
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);

        // Opretter en ListIterator for listen af heltal
        ListIterator<Integer> iterator = numbers.listIterator();
        // Itererer gennem listen og udskriver hver værdi
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Opretter en map af heltal og deres kvadrater
        Map<Integer, Integer> numberMap = new HashMap<>();
        numberMap.put(2, 4);
        numberMap.put(3, 9);
        numberMap.put(4, 16);
        numberMap.put(5, 25);
        numberMap.put(6, 36);

        // Opretter en Iterator til at iterere gennem nøglerne i map'en
        Iterator<Integer> mapIterator = numberMap.keySet().iterator();
        // Itererer gennem map'en og udskriver hver nøgle
        while (mapIterator.hasNext()) {
            System.out.println(mapIterator.next());
        }
    }
}
