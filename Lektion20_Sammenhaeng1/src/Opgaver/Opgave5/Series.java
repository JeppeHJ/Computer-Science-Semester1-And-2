package Opgaver.Opgave5;

import java.util.ArrayList;

public class Series {
    private String title;
    private ArrayList<String> cast;
    private ArrayList<Episode> episodes;

    public Series(String title, ArrayList<String> cast) {
        this.title = title;
        this.cast = cast;
    }

    public void addEpisode(Episode episode) {
        if (!this.episodes.contains(episode)) {
            this.episodes.add(episode);
        }
    }

    public void removeEpisode(Episode episode) {
        if (this.episodes.contains(episode)) {
            this.episodes.remove(episode);
        }
    }

    public int totalLength() {
        int sum = 0;
        for (Episode episode: episodes) {
            sum += episode.getLengthMinutes();
        }

        return sum;
    }



    public ArrayList<Episode> getEpisodes() {
        return episodes;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<String> getCast() {
        return cast;
    }
}
