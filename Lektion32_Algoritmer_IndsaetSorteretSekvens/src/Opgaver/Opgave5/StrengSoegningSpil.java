package Opgaver.Opgave5;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StrengSoegningSpil {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        // Opretter en ArrayList kaldet 'words' til at gemme en liste af ord
        ArrayList<String> words = new ArrayList<>();

        // Tilføjer ord til listen
        words.add("frugt");
        words.add("lapper");
        words.add("skrive");
        words.add("vandet");
        words.add("grønts");
        words.add("styrke");
        words.add("slange");
        words.add("brødet");
        words.add("skolen");
        words.add("havnen");

        // Opretter en variabel 'gameOn' og sætter den til true.
        // Denne variabel styrer, om spillet skal fortsætte eller stoppe.
        boolean gameOn = true;

        // Starter spillet i en løkke, der fortsætter, så længe 'gameOn' er true.
        while (gameOn) {
            // Vælger et tilfældigt ord fra listen 'words'
            String wordToGuess = chooseWord(words);

            // Opretter en ArrayList 'guesses' til at gemme brugerens gæt
            ArrayList<String> guesses = new ArrayList<>();

            // Viser en velkomstbesked og længden af det valgte ord
            System.out.println("VELKOMMEN TIL WORD GUESSER!");
            System.out.println("Længden af ordet er " + wordToGuess.length());

            // Starter en løkke, der fortsætter, så længe det gættede ord ikke er identisk med
            // stjerner og bogstaver genereret af 'generateStarsAndChars' metoden.
            while (!wordToGuess.equals(generateStarsAndChars(wordToGuess, guesses).toString())) {
                // Viser de stjerner og bogstaver, der er gættet korrekt indtil nu,
                // sammen med de gæt, der er foretaget.
                System.out.println(generateStarsAndChars(wordToGuess, guesses) + " Brugt: " + guesses.toString());

                // Opretter en Scanner til at læse brugerens input
                Scanner scanner = new Scanner(System.in);

                // Læser brugerens gæt
                String guess = scanner.nextLine();

                // Hvis gættet ikke er tomt (brugeren har indtastet noget), tilføjes gættet til listen af gæt
                if (!guess.isEmpty()) {
                    guesses.add(guess.toLowerCase());
                }
            }

            // Viser en besked om, at brugeren har gættet ordet korrekt og antallet af gæt, der blev brugt
            System.out.println("Du gættede ordet med kun " + guesses.size() + " gæt!");

            // Afslutter spillet efter et ord er gættet.
            // Fjern denne linje, hvis du vil fortsætte med et nyt ord.
            gameOn = false;
        }
    }

    // Genererer en streng med stjerner og bogstaver baseret på det ord, der skal gættes, og brugerens gæt.
    public static StringBuilder generateStarsAndChars(String wordToGuess, ArrayList<String> guesses) {
        StringBuilder placeholder = new StringBuilder("");

        // Gennemgår hvert bogstav i ordet, der skal gættes
        for (int i = 0; i < wordToGuess.length(); i++) {
            // Hvis bogstavet er blevet gættet korrekt (findes i 'guesses' listen),
            // tilføjes bogstavet til strengen 'placeholder'
            if (guesses.contains(String.valueOf(wordToGuess.charAt(i)))) {
                placeholder.append(wordToGuess.charAt(i));
            } else {
                // Ellers tilføjes en stjerne til strengen 'placeholder'
                placeholder.append("*");
            }
        }

        // Returnerer strengen 'placeholder' med stjerner og gættede bogstaver
        return placeholder;
    }

    // Vælger et tilfældigt ord fra listen af ord.
    public static String chooseWord(ArrayList<String> words) {
        Random rand = new Random();

        // Genererer et tilfældigt tal mellem 0 og størrelsen af listen 'words'
        int randomIndex = rand.nextInt(words.size());

        // Returnerer ordet på det tilfældige indeks
        return words.get(randomIndex);
    }
}
