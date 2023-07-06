package Opgaver.Opgave5;

public class Main {
    public static void main(String[] args) {
        // Opret objekter
        Saelger hansen = new Saelger("Hansen");
        Indkoeber jensen = new Indkoeber("Jensen");
        BogTitel andersAnd = new BogTitel("Anders And", 6);
        BogTitel java = new BogTitel("Java", 8);
        Kunde laesehest1 = new Kunde("Læsehest1");
        Kunde laesehest2 = new Kunde("Læsehest2");
        Kunde laesehest3 = new Kunde("Læsehest3");

        // Tilføj observere
        andersAnd.addObserver(hansen);
        andersAnd.addObserver(jensen);
        java.addObserver(jensen);

        // Køb bøger
        laesehest1.addBogtitel(java);
        laesehest2.addBogtitel(java);
        laesehest3.addBogtitel(java);
        laesehest1.addBogtitel(andersAnd);
        laesehest2.addBogtitel(andersAnd);
        laesehest3.addBogtitel(andersAnd);
    }
}
