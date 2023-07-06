package Opgaver.Opgave5;

public class App {
    public static void main(String[] args) {
        ObservableBag observableBag = new ObservableBag();

        // Tilføj nogle strenge til rygsækken
        observableBag.add("bog");
        observableBag.add("blyant");
        observableBag.add("blyant");
        observableBag.add("blyant");
        observableBag.add("blyant");
        observableBag.add("linjal");
        observableBag.add("linjal");
        observableBag.add("linjal");

        // Fjern nogle strenge fra rygsækken
        observableBag.remove("blyant");
        observableBag.remove("linjal");

        // Udskriv antallet af gange en bestemt streng findes i rygsækken
        System.out.println("Antallet af 'bog' i rygsækken: " + observableBag.getCount("bog"));
        System.out.println("Antallet af 'blyant' i rygsækken: " + observableBag.getCount("blyant"));
        System.out.println("Antallet af 'linjal' i rygsækken: " + observableBag.getCount("linjal"));

        // Udskriv alle unikke strenge i rygsækken
        System.out.println("\nAlle unikke strenge i rygsækken:");
        for (String item : observableBag) {
            System.out.println(item);
        }
    }
}
