package Opgaver.Opgave1;

public class Opg1_OprindeligLøsning {

    // TODO LØSNING 1, NEDARVNING
    // Problemet med første løsning er, at der skal en masse overskrivning til
    // Ænder, der ikke kan flyve, nedarver f.eks. evnen til at flyve
    // Ænder, der ikke kan sige en lyd, nedarver evnen til at sige squawk
    // Det vil medføre problemer, når der skal tilføjes nye variationer af Duck-klassen.

    // TODO LØSNING 2, INTERFACE
    // Vi løser en del af problemet ved at lade subklasserne implementere et interface, som dikterer deres behavior
    // Ænder, der kan flyve, implementerer FLYABLE-interfacet. Ænder, der kan quacke, implementerer Quackable-interfacet
    // Problemet er, at der i et "normalt" interface ikke er implementation i metoderne
    // Altså skal vi skrive en unik behavior for hver Duck-klasse
    // Et andet stort problem er, hvis vi vil ændre den generelle FLY-BEHAVIOR
    // Så skal vi altså ind i SAMTLIGE subklasser, der implementerer FLYABLEs metode og ændre den
    // Masse code re-use
}
