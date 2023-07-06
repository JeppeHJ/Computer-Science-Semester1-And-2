package Opgaver.Opgave4;

public class RekursivReverse {
    public static void main(String[] args) {
        System.out.println(reverse("Hej"));

        // Først kontrolleres det, om længden af strengen s er mindre end eller lig med 1.
        // Dette er termineringsreglen for rekursionen. Hvis strengen har en længde på 1 eller mindre, returneres den uændret.
        // Dette er basistilfældet for rekursionen, da en streng med længde 0 eller 1 allerede er vendt.
        //
        //Hvis længden af strengen er større end 1, fortsætter vi til rekursionsdelen.
        // Vi tager det sidste tegn i strengen ved hjælp af charAt(s.length() - 1).
        // Dette er det sidste tegn i den oprindelige streng, og det vil være det første tegn i den vendte streng.
        //
        //Derefter kaldes metoden reverse rekursivt med resten af strengen, uden det sidste tegn, ved hjælp af s.substring(0, s.length() - 1).
        // Dette resulterer i en mindre del af den oprindelige streng.
        //
        //Rekursionen fortsætter med at kalde sig selv på den reducerede streng, og det sidste tegn tilføjes til begyndelsen af resultatet.
        // Dette sker ved hjælp af rekursionens stak. Hver gang et rekursivt kald fuldføres, tilføjer vi det sidste tegn fra den aktuelle delstreng til begyndelsen af resultatet.
        //
        //Når rekursionen når termineringsreglen (længden af strengen er 1 eller mindre), vil det sidste kald til reverse
        // returnere det sidste tegn, der blev tilføjet til resultatet. Dette resultat sendes derefter tilbage til det tidligere kald til reverse,
        // som tilføjer sit eget sidste tegn til begyndelsen af resultatet, og processen fortsætter, indtil hele strengen er vendt.
    }

    /**
     * Vendt en streng rekursivt.
     *
     * @param s strengen, der skal vendes
     * @return den vendte streng
     */
    public static String reverse(String s) {
        // Termineringsregel: Hvis længden af strengen er 1 eller mindre, returneres strengen uændret.
        if (s.length() <= 1) {
            return s;
        } else {
            // Rekurrensregel: Det sidste tegn i strengen tilføjes til begyndelsen af resultatet,
            // og metoden kaldes rekursivt med resten af strengen uden det sidste tegn.
            return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
        }
    }
}
