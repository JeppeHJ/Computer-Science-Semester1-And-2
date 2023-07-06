package Opgaver.Opgave2;

public class AnvendCounter {
    private Counter counter;

    public AnvendCounter() {
        // Opretter en instans af Counter ved hjælp af getInstance() metoden
        this.counter = Counter.getInstance();

        // Kalder forskellige metoder på Counter objektet
        counter.count(); // Incrementerer værdien med 1
        counter.times2(); // Ganger værdien med 2
        counter.zero(); // Nulstiller værdien til 0

        // Henter den aktuelle værdi fra Counter objektet
        int value = counter.getValue();

        // Udskriver værdien på konsollen
        System.out.println("Counter value: " + value);
    }
}
