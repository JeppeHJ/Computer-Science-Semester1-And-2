package Opgaver.Opgave2;

import java.util.ArrayList;

public class MekanikerAppTwo {
    public static void main(String[] args) {
        ArrayList<Mekaniker> mekanikere = new ArrayList<>();

        Person p1 = new Person("Jan", "Hej1");
        Person p2 = new Person("Jan", "Hej1");
        Person p3 = new Person("Jan", "Hej1");
        Mekaniker m1 = new Mekaniker("Jeppe", "Hej", 1992, 1);
        Mekaniker m2 = new Mekaniker("Jeppe", "Hej", 1992, 1);
        Mekaniker m3 = new Mekaniker("Jeppe", "Hej", 1992, 1);
        Mekaniker v1 = new Værkfører("Jeppe", "Hej", 1990, 1, 1991, 1);
        Mekaniker v2 = new Værkfører("Jeppe", "Hej", 1990, 1, 1991, 1);
        Mekaniker v3 = new Værkfører("Jeppe", "Hej", 1990, 1, 1991, 1);
        Mekaniker s3 = new Synsmand("Jeppe", "Hej", 1990, 1, 10);

        mekanikere.add(m1);
        mekanikere.add(m2);
        mekanikere.add(m3);
        mekanikere.add(v2);
        mekanikere.add(v3);
        mekanikere.add(s3);


        System.out.println(samletLoen(mekanikere));
    }

    /**
     * Beregner summen af ugelønnen for alle i listen
     **/
    public static double samletLoen(ArrayList<Mekaniker> list){
        double sum = 0;
        for (Mekaniker arbejder: list) {
            sum += arbejder.samletLoen();
        }

        return sum;
    }
}


