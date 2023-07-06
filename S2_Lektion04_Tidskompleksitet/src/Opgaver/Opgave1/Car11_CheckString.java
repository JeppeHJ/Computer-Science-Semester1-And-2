package Opgaver.Opgave1;

public class Car11_CheckString {

    // Første loop er O(n), hvor n er mængden af elementer i Arrayet
    // Basic operation er sammenligning - så hele Arrayet skal kigges igennem
    // Altså er tidskompleksiteten O(n)


    boolean checkString(String[] strings, String st) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == st) {
                return true;
            }
        } return false;
    }
}
