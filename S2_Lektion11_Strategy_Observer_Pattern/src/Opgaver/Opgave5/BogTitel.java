package Opgaver.Opgave5;

import java.util.ArrayList;

public class BogTitel implements Subject {
    private String titel; // Variabel til at gemme titlen på bogen
    private int antal; // Variabel til at gemme antallet af bøger
    private ArrayList<Opgaver.Opgave5.Observer> observers; // Liste over observatører, der er tilmeldt denne bogtitel
    private ArrayList<Kunde> kunder; // Liste over kunder, der har købt denne bogtitel

    public BogTitel(String titel, int antal) {
        this.titel = titel; // Initialiserer titel med den modtagne værdi
        this.antal = antal; // Initialiserer antal med den modtagne værdi
        this.observers = new ArrayList<>(); // Opretter en ny liste til observatører
        this.kunder = new ArrayList<>(); // Opretter en ny liste til kunder
    }

    public void indkoebTilLager(int antal) {
        this.antal = this.antal + antal; // Tilføjer antallet til lagerbeholdningen
    }

    public ArrayList<Kunde> getKunder() {
        return kunder; // Returnerer listen over kunder
    }

    public void addKunde(Kunde k) {
        this.kunder.add(k); // Tilføjer en kunde til listen over kunder
    }

    private void etKoeb(Kunde k) {
        this.kunder.add(k); // Tilføjer en kunde til listen over kunder
        k.addBogtitel(this); // Tilføjer denne bogtitel til kundens liste over købte bogtitler
        this.antal--; // Reducerer antallet af bøger med 1
        notifyObservers(); // Underretter observatørerne om ændringen
    }

    private void notifyObservers() {
        for (Observer o : observers) {
            o.update(this); // Opdaterer hver observatør med den nye tilstand af bogtitlen
        }
    }

    public String getTitel() {
        return titel; // Returnerer titlen på bogen
    }

    public int getAntal() {
        return antal; // Returnerer antallet af bøger
    }

    @Override
    public void addObserver(Opgaver.Opgave5.Observer observer) {
        this.observers.add(observer); // Tilføjer en observatør til listen over observatører
    }

    @Override
    public void removeObserver(Opgaver.Opgave5.Observer observer) {
        this.observers.remove(observer); // Fjerner en observatør fra listen over observatører
    }
}
