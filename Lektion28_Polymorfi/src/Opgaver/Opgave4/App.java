package Opgaver.Opgave4;

public class App {
    public static void main(String[] args) {
    // Opretter et Cirkel objekt
    Cirkel cirkel = new Cirkel(0, 0, 10);
        System.out.println("Cirkel areal: " + cirkel.beregnAreal());
        cirkel.forskyd(5);

    // Opretter et Ellipse objekt
    Ellipse ellipse = new Ellipse(0, 0, 10, 5);
        System.out.println("Ellipse areal: " + ellipse.beregnAreal());
        ellipse.forskyd(10);

    // Opretter et Firkant objekt
    Firkant firkant = new Firkant(0, 0, 10);
        System.out.println("Firkant areal: " + firkant.beregnAreal());
        firkant.forskyd(20);

    // Opretter et Rektangel objekt
    Rektangel rektangel = new Rektangel(0, 0, 10, 20);
        System.out.println("Rektangel areal: " + rektangel.beregnAreal());
        rektangel.forskyd(15);
}
}

