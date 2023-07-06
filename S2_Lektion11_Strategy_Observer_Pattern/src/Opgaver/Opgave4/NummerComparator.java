package Opgaver.Opgave4;

import java.util.Comparator;

public class NummerComparator implements Comparator<Kunde> {
    @Override
    public int compare(Kunde o1, Kunde o2) {
        // Sammenligner numrene på de to Kunde-objekter
        // Returnerer et negativt tal, hvis o1's nummer er større end o2's nummer
        // Returnerer et positivt tal, hvis o1's nummer er mindre end o2's nummer
        // Returnerer 0, hvis numrene er ens
        if (o1.getNummer() > o2.getNummer()) {
            return -1;
        } else if (o1.getNummer() < o2.getNummer()) {
            return 1;
        } else {
            return 0;
        }
    }
}
