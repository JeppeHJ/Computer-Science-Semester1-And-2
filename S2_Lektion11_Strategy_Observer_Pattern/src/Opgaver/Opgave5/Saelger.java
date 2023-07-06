package Opgaver.Opgave5;

import java.util.ArrayList;

public class Saelger implements Observer {
    private String navn; // Variabel til at gemme sælgerens navn

    public Saelger(String navn) {
        this.navn = navn; // Initialiserer navn med den modtagne værdi
    }

    @Override
    public void update(Subject s) {
        BogTitel bog = (BogTitel) s; // Konverterer Subject-objektet til en BogTitel
        ArrayList<String> solgteBoger = new ArrayList<>(); // Liste til at gemme titlerne på solgte bøger

        // Gennemgår hver kunde, der har købt den pågældende bogtitel
        for (Kunde kunde : bog.getKunder()) {
            // Gennemgår hver bogtitel, som kunden har købt
            for (BogTitel bogTitel : kunde.getBogtitler()) {
                // Tjekker om bogtitlen er forskellig fra den aktuelle bogtitel og ikke allerede er tilføjet til solgteBoger-listen
                if (!bogTitel.getTitel().equals(bog.getTitel()) && !solgteBoger.contains(bogTitel.getTitel())) {
                    solgteBoger.add(bogTitel.getTitel()); // Tilføjer bogtitlen til solgteBoger-listen
                }
            }
        }

        System.out.println("Andre bøger købt af kunder, der også købte " + bog.getTitel() + ": " + String.join(", ", solgteBoger));
        // Udskriver titlerne på andre bøger, som kunder, der også købte den aktuelle bogtitel, har købt
    }
}
