package Opgaver.Opgave3;

import java.util.ArrayList;

public class MekanikerAppTwo {
    public static void main(String[] args) {
        ArrayList<Mekaniker> mekanikere = new ArrayList<>();

        Person p1 = new Person("Jan", "Hej1");
        Person p2 = new Person("Jan", "Hej1");
        Person p3 = new Person("Jan", "Hej1");
        Ansat m1 = new Mekaniker("Jeppe", "Hej", 1992, 1, 37);
        Ansat m2 = new Mekaniker("Jeppe", "Hej", 1992,1, 37);
        Ansat m3 = new Mekaniker("Jeppe", "Hej", 1992, 1, 37);
        Ansat v1 = new Værkfører("Jeppe", "Hej", 1, 1990, 10, 37);
        Ansat v2 = new Værkfører("Jeppe", "Hej", 1, 1990, 10, 37);
        Ansat v3 = new Værkfører("Jeppe", "Hej", 1, 1990, 10, 37);

        Mekaniker s3 = new Synsmand("Jeppe", "Hej", 1990, 1, 10, 37);

    }

    /**
     * Beregner summen af lønnen for alle ansatte i listen
     **/
    public static double samletUgeløn(ArrayList<Ansat> list) {
        double sum = 0;
        for (Ansat ansat : list) {
            sum += ansat.getLoen();
        }
        return sum;
    }

}


