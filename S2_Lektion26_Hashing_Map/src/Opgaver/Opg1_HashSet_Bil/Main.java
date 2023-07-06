package Opgaver.Opg1_HashSet_Bil;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Bil b1 = new Bil("10","Volvo","1","Sort");
        Bil b2 = new Bil("10","Volvo","1","Sort");
        Set<Bil> bilSet = new HashSet<>();
        bilSet.add(b1);
        bilSet.add(b2);

        System.out.println(bilSet);



    }
}
