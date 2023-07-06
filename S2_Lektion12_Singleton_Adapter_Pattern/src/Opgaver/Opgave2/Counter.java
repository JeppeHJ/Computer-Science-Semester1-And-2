package Opgaver.Opgave2;

public class Counter {
    private int value;
    private static Counter uniqueInstance;

    private Counter() {
        this.value = 0;
    }

    public static Counter getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Counter();
        }
        return uniqueInstance;
    }

    public void count() {
        this.value++;
    }
    public void times2() {
        this.value = this.value * 2;
    }
    public void zero() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }
}
