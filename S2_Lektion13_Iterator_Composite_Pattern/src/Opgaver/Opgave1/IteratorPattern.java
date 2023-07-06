package Opgaver.Opgave1;

public class IteratorPattern {

    // TODO Hvad opnår vi ved at bruge Iterator Pattern?
    // Ved at bruge Iterator mønsteret får vi en standardiseret måde at gennemgå elementer i forskellige datastrukturer.
    // Dette øger koden ensartethed og genanvendelighed. Vi opnår også en adskillelse af bekymringer - datastrukturen er
    // ansvarlig for opbevaring af data, og iteratoren er ansvarlig for at gennemgå det.

    // TODO Beskriv hvordan Iterator Pattern implementeres i praksis og hvilke elementer der indgår
    // I praksis består Iterator mønsteret typisk af tre dele: Collection, Iterator og Client.
    // Collection er den datastruktur, der skal gennemgås. Det er denne struktur, der returnerer en iterator.
    // Iterator er et objekt, der er designet til at gennemgå en bestemt samling. Det implementerer typisk metoder
    // til at kontrollere, om der er flere elementer og til at hente det næste element.
    // Client er den del af koden, der faktisk bruger iteratoren til at gennemgå samlingen.

    // TODO Hvordan er sammenhængen mellem Iterator pattern og metoden iterator() i Javas Collection framework?
    // I Java's Collection framework implementeres Iterator mønsteret ved at alle Collection klasser (såsom List, Set, etc.)
    // har en metode kaldet iterator(), der returnerer et Iterator objekt. Dette objekt giver brugeren mulighed for at gennemgå
    // samlingen på en standardiseret måde, uafhængig af den specifikke type af Collection.

    // TODO Hvorfor udvides aggregatet (collection) ikke bare med metoder der gør det muligt at gennemløbe aggregatet ?
    // Udvidelse af aggregatet med metoder til at gennemgå det kunne gøre det mere kompliceret og forvirrende for brugeren.
    // Det ville også bryde Single Responsibility Principle, hvor hver klasse eller komponent kun bør have en grund til at ændre.
    // Ved at adskille iteratoren fra selve aggregatet, kan de to komponenter udvikles, ændres og bruges uafhængigt af hinanden.
}
