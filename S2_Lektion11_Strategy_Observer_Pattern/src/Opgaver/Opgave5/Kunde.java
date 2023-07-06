package Opgaver.Opgave5;

import java.util.ArrayList;

public class Kunde {
    private String navn; // Variabel til at gemme kundens navn
    private ArrayList<BogTitel> bogtitler; // Liste over bogtitler, som kunden har købt

    public Kunde(String navn) {
        this.navn = navn; // Initialiserer navn med den modtagne værdi
        this.bogtitler = new ArrayList<>(); // Opretter en ny liste til bogtitler
    }

    public void addBogtitel(BogTitel bogTitel) {
        this.bogtitler.add(bogTitel); // Tilføjer en bogtitel til listen over bogtitler, som kunden har købt
        bogTitel.addKunde(this); // Opdaterer bogtitlens liste over kunder, der har købt den
    }

    public String getNavn() {
        return navn; // Returnerer kundens navn
    }

    public ArrayList<BogTitel> getBogtitler() {
        return bogtitler; // Returnerer listen over bogtitler, som kunden har købt
    }
}
