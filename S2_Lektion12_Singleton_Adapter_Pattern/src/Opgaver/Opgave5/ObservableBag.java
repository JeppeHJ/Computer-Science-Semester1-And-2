package Opgaver.Opgave5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ObservableBag implements Bag, Iterable<String> {
    private ArrayList<Observer> observers; // ArrayList til at gemme observere

    private HashMap<String, Integer> indhold; // HashMap til at gemme indholdet af rygsækken

    public ObservableBag() {
        this.indhold = new HashMap<>(); // Opretter en ny HashMap til indholdet i rygsækken
        this.observers = new ArrayList<>(); // Opretter en ny ArrayList til observere
    }

    @Override
    public void add(String s) {
        if (!indhold.containsKey(s)) { // Hvis indholdet ikke allerede findes i HashMap'en
            indhold.put(s, 0); // Tilføj indholdet med en startværdi på 0
        } else {
            int itemCount = indhold.get(s);
            indhold.replace(s, itemCount, itemCount + 1); // Opdater antallet ved at øge det med 1
        }
        notifyObservers(s, indhold.get(s)); // Meddeler observerne om ændringen i indholdet
    }

    @Override
    public void remove(String s) {
        int itemCount = indhold.get(s); // Hent antallet af det specifikke indhold
        if (indhold.containsKey(s)) { // Hvis indholdet findes i HashMap'en
            indhold.put(s, itemCount - 1); // Opdater antallet ved at formindske det med 1
        } else {
            indhold.remove(s); // Fjern indholdet fra HashMap'en, hvis antallet når 0
        }
        notifyObservers(s, indhold.get(s)); // Meddeler observerne om ændringen i indholdet
    }

    @Override
    public int getCount(String s) {
        return indhold.get(s); // Returner antallet af det specifikke indhold
    }

    @Override
    public Iterator<String> iterator() {
        return indhold.keySet().iterator(); // Returner en iterator til at iterere over indholdets nøgler (indholdet)
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o); // Registrerer en observer ved at tilføje den til listen af observere
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o); // Fjerner en observer fra listen af observere
    }

    public void notifyObservers(String s, int antal) {
        for (Observer o : observers) { // Gennemgår alle observere
            o.update(s, antal); // Opdaterer hver observer med ændringerne i indholdet
        }
    }
}
