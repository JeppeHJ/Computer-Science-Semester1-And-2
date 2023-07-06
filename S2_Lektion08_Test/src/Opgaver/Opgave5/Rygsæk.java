package Opgaver.Opgave5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.function.Consumer;

public class Rygsæk implements Bag, Iterable<String> {

    private HashMap<String, Integer> indhold; // HashMap til at gemme indholdet af rygsækken

    public Rygsæk() {
        this.indhold = new HashMap<>(); // Opretter en ny HashMap til indholdet i rygsækken
    }

    @Override
    public void add(String s) {
        if (!indhold.containsKey(s)) { // Hvis indholdet ikke allerede findes i HashMap'en
            indhold.put(s, 0); // Tilføj indholdet med en startværdi på 0
        } else {
            int itemCount = indhold.get(s); // Hent antallet af det specifikke indhold
            indhold.replace(s, itemCount, itemCount + 1); // Opdater antallet ved at øge det med 1
        }
    }

    @Override
    public void remove(String s) {
        int itemCount = indhold.get(s); // Hent antallet af det specifikke indhold
        if (indhold.containsKey(s)) { // Hvis indholdet findes i HashMap'en
            indhold.put(s, itemCount - 1); // Opdater antallet ved at formindske det med 1
        } else {
            indhold.remove(s); // Fjern indholdet fra HashMap'en, hvis antallet når 0
        }
    }

    @Override
    public int getCount(String s) {
        return indhold.get(s); // Returner antallet af det specifikke indhold
    }

    @Override
    public Iterator<String> iterator() {
        return indhold.keySet().iterator(); // Returner en iterator til at iterere over indholdets nøgler (indholdet)
    }
}
