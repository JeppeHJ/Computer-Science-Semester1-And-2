package Opgaver.Opgave5;

import java.util.ArrayList;

public class Episode {
    private int number;
    private ArrayList<String> guestActors;
    private int lengthMinutes;

    public Episode(int number, ArrayList<String> guestActors, int lengthMinutes, Series series) {
        this.number = number;
        this.guestActors = guestActors;
        this.lengthMinutes = lengthMinutes;
        series.addEpisode(this);
    }

    public int getNumber() {
        return number;
    }

    public ArrayList<String> getGuestActors() {
        return guestActors;
    }

    public int getLengthMinutes() {
        return lengthMinutes;
    }
}

