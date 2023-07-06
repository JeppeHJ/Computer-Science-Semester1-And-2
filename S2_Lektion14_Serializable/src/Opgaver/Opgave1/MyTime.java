package Opgaver.Opgave1;

import java.io.Serializable;

public class MyTime implements Serializable {
    private int time;

    public MyTime() {
        this.time = 0;
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
