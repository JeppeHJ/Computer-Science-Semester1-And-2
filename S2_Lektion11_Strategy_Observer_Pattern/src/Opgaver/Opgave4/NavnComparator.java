package Opgaver.Opgave4;

import java.util.Comparator;

public class NavnComparator implements Comparator<Kunde> {
    @Override
    public int compare(Kunde o1, Kunde o2) {
        // Sammenligner navnet på de to Kunde-objekter ved hjælp af compareTo-metoden for Strings
        // Returnerer et negativt tal, hvis o1's navn kommer før o2's navn i alfabetisk rækkefølge
        // Returnerer et positivt tal, hvis o1's navn kommer efter o2's navn i alfabetisk rækkefølge
        // Returnerer 0, hvis navnene er ens
        return o1.getNavn().compareTo(o2.getNavn());
    }
}
