package Opgaver.Opgave1;

public class Opg2_DenNyeLøsningMedDelegation {

    // TODO DISKUTER DEN NYE LØSNING
    // Den nye løsning er langt, langt bedre. Vi opnår langt bedre fleksibilitet
    // Vi kan ændre i langt mere kode, uden vi skal kode-reuse
    // Vi kan nemt tilføje nye subklasser med andre fly- og quack-behaviors
    // Der er langt mere genbrug af kode, uden vi skal skrive ny!


    // TODO Hvilke designprincipper anvendes? Formuler disse med egne ord
    // Vi anvender indkapsling for den behavior, som Ducks kan have
    // Med andre ord uddelegeres noget ansvar fra Duck klassen til en anden klasse
    // Vi flytter altså den del af koden, der er subject til change og tilføjelser
    // Væk fra selve Duck-klassen. Vi anvender også polymorfi og abstraction
    // Omend disse to også anvendes i første og anden løsning

    // TODO Udpeg de vigtigste dele i den færdige kode
    // Den vigtigste del er uden tvivl den implementation af de to interfaces FlyBehavior og QuackBehavior
    // I stedet for at lade Duck-klassen eller subklasserne direkte implementere et interface som før
    // hvor vi så skal ind og overskrive quick og fly-metoder, så er der nu en "HAS-A"-associering
    // mellem Duck-superklassen og både FlyBehavior og Quack-Behavior interfacesne
    // Og så har vi "konkrete klasser" der implementerer de respektive interfaces
    // De bliver altså "delegeret" opgaven at håndtere Quack og Fly behavior

    // TODO Hvordan kan opførslen for ”the ducks” ændres på kørselstidspunktet?
    // Når vi snakker "runtime" så menes der, når koden kører. Med en SET-metode kan vi altså
    // ændre på behavior under runtime.

}
