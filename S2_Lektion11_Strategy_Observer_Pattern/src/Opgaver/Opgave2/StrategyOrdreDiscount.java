package Opgaver.Opgave2;

public class StrategyOrdreDiscount {
    //TODO Diskuter ”Lektion 27: Opgaver onsdag den 23. november ” opgave 3.c
    // i relation til Strategy pattern (Opgaven med Ordre - Discount)

    // Din klassestruktur er et meget godt eksempel på brugen af Strategy Pattern. Lad os gå igennem det:

    //Strategy Pattern bruges til at have en familie af algoritmer (strategier), kapsle dem individuelt og
    // gøre dem udskiftelige. En strategi er en metode for at løse et problem.

    //Her er din Discount klasse grundlæggende den abstrakte klasse (eller interface),
    // der repræsenterer "strategien". Du har så forskellige konkrete implementeringer
    // af denne strategi i form af FixedDiscount og PercentDiscount.

    //Din Customer klasse indeholder en reference til et Discount objekt, hvilket gør det muligt
    // for den at delegere beregningen af rabatten til den aktuelle Discount strategi.
    // Du kan ændre rabatberegningen dynamisk ved at skifte den konkrete Discount strategi,
    // som kunden bruger (ved at kalde setDiscount() metoden).

    //Alt dette er helt i tråd med Strategy Pattern. Hvis der skal tilføjes flere
    // rabatberegninger i fremtiden, kan du blot oprette flere klasser, der implementerer Discount,
    // og lade kunden bruge den nye strategi. Dette gør dit design fleksibelt og let at vedligeholde,
    // da det fjerner hårdkodet logik og gør det lettere at tilføje nye funktioner.
}
