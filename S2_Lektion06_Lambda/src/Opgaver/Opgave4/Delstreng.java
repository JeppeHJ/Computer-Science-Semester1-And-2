package Opgaver.Opgave4;

import java.util.ArrayList;
import java.util.List;

public class Delstreng {
    public static void main(String[] args) {
        // Opretter en liste af navne
        List<String> names = new ArrayList<>();
        // Tilføjer navne til listen
        names.add("Jan Jensen");
        names.add("Jens Hansen");
        names.add("Leo Hansen");
        names.add("Jens Jensen");
        names.add("Jensine Larsen");

        // Udskriver antallet af forekomster af delstrengen "Jens" i listen af navne
        System.out.println(countDelStreng(names, "Jens"));

        // Udskriver antallet af forekomster af delstrengen "Jens" i listen af navne ved hjælp af rekursion
        System.out.println(rekursivCountDelStreng(names, "Jens"));

        // Udskriver antallet af forekomster af delstrengen "Jens" i listen af navne ved hjælp af en delt, kombineret løsning
        System.out.println(delLøsKombinerDelStreng(names, "Jens"));
    }

    // Tæller antallet af forekomster af en given delstreng i en liste af navne ved hjælp af løkker
    public static int countDelStreng(List<String> list, String sub) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            // Opdeler hvert navn i listen i en array af delstrengene ved hjælp af mellemrum som adskillelse
            String[] splitName = list.get(i).split(" ");
            for (int j = 0; j < splitName.length; j++) {
                // Tjekker om den aktuelle delstreng indeholder den søgte delstreng
                if (splitName[j].contains(sub)) {
                    count++;
                }
            }
        }
        return count;
    }

    // Tæller antallet af forekomster af en given delstreng i en liste af navne ved hjælp af rekursion
    public static int rekursivCountDelStreng(List<String> list, String sub) {
        return rekursivCountDelStreng(list, sub, 0, list.size());
    }

    // Hjælpefunktion til rekursivCountDelStreng metoden, der bruger opdeling og kombination af opdelte områder
    private static int rekursivCountDelStreng(List<String> list, String sub, int startIndex, int endIndex) {
        // Base case: hvis startindekset er større eller lig med slutindeks, returneres 0 (ingen forekomster)
        if (startIndex >= endIndex) {
            return 0;
        } else {
            // Opdeler navnet ved startindekset i en array af delstrengene ved hjælp af mellemrum som adskillelse
            String[] splitNames = list.get(startIndex).split(" ");
            int count = 0;
            for (int i = 0; i < splitNames.length; i++) {
                // Tjekker om den aktuelle delstreng indeholder den søgte delstreng
                if (splitNames[i].contains(sub)) {
                    count++;
                }
            }
            // Kombinerer resultatet fra det opdelte område med resultatet fra resten af listen rekursivt
            return rekursivCountDelStreng(list, sub, startIndex + 1, endIndex) + count;
        }
    }

    // Tæller antallet af forekomster af en given delstreng i en liste af navne ved hjælp af en delt, kombineret løsning
    public static int delLøsKombinerDelStreng(List<String> list, String sub) {
        return delLøsKombinerDelStreng(list, sub, 0, list.size() - 1);
    }

    // Hjælpefunktion til delLøsKombinerDelStreng metoden, der bruger delt og kombineret metode til opdeling af områder
    private static int delLøsKombinerDelStreng(List<String> list, String sub, int low, int high) {
        // Base case: hvis lav og høj er ens, tælles forekomster af delstrengen direkte i det enkelte navn
        if (low == high) {
            return countSubstringOccurrences(list.get(low), sub);
        } else {
            // Finder midtpunktet mellem lav og høj
            int mid = (low + high) / 2;
            // Tæller forekomster af delstrengen i de to delområder rekursivt
            int count1 = delLøsKombinerDelStreng(list, sub, low, mid);
            int count2 = delLøsKombinerDelStreng(list, sub, mid + 1, high);
            // Kombinerer resultatet fra de to delområder
            return count1 + count2;
        }
    }

    // Tæller antallet af forekomster af en given delstreng i en enkelt streng
    public static int countSubstringOccurrences(String check, String sub) {
        int count = 0;
        // Opdeler strengen i en array af delstrengene ved hjælp af mellemrum som adskillelse
        String[] splitNames = check.split(" ");
        for (int i = 0; i < splitNames.length; i++) {
            // Tjekker om den aktuelle delstreng indeholder den søgte delstreng
            if (splitNames[i].contains(sub)) {
                count++;
            }
        }
        return count;
    }
}
