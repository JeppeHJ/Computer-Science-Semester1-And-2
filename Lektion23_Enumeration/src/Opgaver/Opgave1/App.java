package Opgaver.Opgave1;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Hund h1 = new Hund("Lotte", false, 100, Race.TERRIER);
        Hund h2 = new Hund("Lotte2", false, 100, Race.PUDDEL);
        Hund h3 = new Hund("Lotte3", false, 100, Race.PUDDEL);
        Hund h4 = new Hund("Lotte4", false, 100, Race.PUDDEL);
        Hund h5 = new Hund("Lotte5", false, 100, Race.PUDDEL);

        ArrayList<Hund> hunde = new ArrayList<>();
        hunde.add(h1);
        hunde.add(h2);
        hunde.add(h3);
        hunde.add(h4);
        hunde.add(h5);

        System.out.println(samletPris(hunde,Race.TERRIER));

    }

    public static int samletPris(ArrayList<Hund> hunde, Race race) {
        int sum = 0;
        for (Hund hund: hunde) {
            if (hund.getRace() == race) {
                sum += hund.getPris();
            }
        }

        return sum;
    }

}
