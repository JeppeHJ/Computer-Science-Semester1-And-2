package Opgaver.Opgave4;

public abstract class Figur {
    private int x;
    private int y;

    public Figur(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract double beregnAreal();
    public void forskyd(int distance) {
        this.x = x + distance;
        this.y = y + distance;
    }

}
