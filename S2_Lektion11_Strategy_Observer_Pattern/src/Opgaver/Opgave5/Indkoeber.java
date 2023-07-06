package Opgaver.Opgave5;

public class Indkoeber implements Observer {
    private String navn; // Variabel til at gemme indkøberens navn

    public Indkoeber(String navn) {
        this.navn = navn; // Initialiserer navn med den modtagne værdi
    }

    @Override
    public void update(Subject s) {
        BogTitel bog = (BogTitel) s; // Konverterer Subject-objektet til en BogTitel
        if (bog.getAntal() < 6) {
            System.out.println("Bestil 10 bøger med titlen " + bog.getTitel());
        }
        bog.indkoebTilLager(10); // Indkøberen bestiller 10 bøger af den pågældende titel til lageret
    }
}
