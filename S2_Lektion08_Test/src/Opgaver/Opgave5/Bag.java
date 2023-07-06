package Opgaver.Opgave5;

import java.util.Comparator;
import java.util.Iterator;

public interface Bag {
    /** Add a String to the bag */
    public void add(String s);
    /** Remove a String from the bag */
    public void remove(String s);
    /** Get the count of Strings equal to s in the bag */
    public int getCount(String s);
}