package Opgaver.Opgave5;

public class App {
    public static void main(String[] args) {
        Rygsæk rygsæk = new Rygsæk();

        // Tilføj nogle strenge til rygsækken
        rygsæk.add("bog");
        rygsæk.add("blyant");
        rygsæk.add("blyant");
        rygsæk.add("blyant");
        rygsæk.add("blyant");
        rygsæk.add("linjal");
        rygsæk.add("linjal");
        rygsæk.add("linjal");

        // Fjern nogle strenge fra rygsækken
        rygsæk.remove("blyant");
        rygsæk.remove("linjal");

        // Udskriv antallet af gange en bestemt streng findes i rygsækken
        System.out.println("Antallet af 'bog' i rygsækken: " + rygsæk.getCount("bog"));
        System.out.println("Antallet af 'blyant' i rygsækken: " + rygsæk.getCount("blyant"));
        System.out.println("Antallet af 'linjal' i rygsækken: " + rygsæk.getCount("linjal"));

        // Udskriv alle unikke strenge i rygsækken
        System.out.println("\nAlle unikke strenge i rygsækken:");
        for (String item : rygsæk) {
            System.out.println(item);
        }
    }
}
