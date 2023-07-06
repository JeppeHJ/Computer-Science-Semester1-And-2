package Opgaver.Opgave2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MyTime implements Serializable {
    private List<String> times;
    private int time;

    public MyTime() {
        this.time = 0;
        this.times = new ArrayList<>();
    }

    public List<String> getTimes() {
        return times;
    }

    public void saveTime() {
        this.times.add(String.valueOf(time));
    }

    public void increase() {
        time++;
    }

    public void reset() {
        this.time = 0;
    }

    public int getTime() {
        return time;
    }
}
