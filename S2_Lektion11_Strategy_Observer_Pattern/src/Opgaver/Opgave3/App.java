package Opgaver.Opgave3;

public class App {
    public static void main(String[] args) {
        // Opret nogle varer
        ElArtikel tv = new ElArtikel(2000, "Smart TV", "Et 42 tommer smart TV", 100);
        tv.setMomsBeregning(new AlkoholMoms());

        Fødevare apple = new Fødevare(10, "Æble", "Et rødt æble", 7);
        apple.setMomsBeregning(new FødevareMoms());

        Spiritus wine = new Spiritus(150, "Rødvin", "En flaske rødvin", 13.5);
        wine.setMomsBeregning(new AlkoholMoms());

        // Opret en indkøbsvogn og tilføj varerne
        Indkøbsvogn indkøbsvogn = new Indkøbsvogn();
        indkøbsvogn.addVare(tv);
        indkøbsvogn.addVare(apple);
        indkøbsvogn.addVare(wine);

        // Beregn den totale pris

        System.out.println(wine.beregnMoms());

    }
}
