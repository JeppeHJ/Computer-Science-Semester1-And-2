package Opgaver.Opgave1;

public class Opg3_StrategyPattern {

    // TODO INDSÆT IS-A, HAS-A og Implements på s22
    // DONE

    // TODO Kommentér Design Principle “Favor composition over inheritance” s. 23. Formuler dette med egne ord
    // Løskobling: Med sammensætning er klasserne mere løst koblede, hvilket betyder, at ændringer i en klasse har mindre sandsynlighed for at påvirke andre klasser.
    //Kodegenbrug: Sammensætning kan fremme kodegenbrug, da en klasse kan benytte sig af funktionaliteten
    // i en anden klasse uden at skulle arve alle dens metoder og attributter.

    //Simplicitet: Arv kan føre til dybe og komplicerede arvehierarkier, som kan være svære at forstå og vedligeholde.
    // Ved at bruge sammensætning kan man opnå en mere flad og simpel struktur.

    //Polymorfisme: Med sammensætning kan du ændre din adfærd ved at ændre de dele, du er sammensat af,
    // hvilket giver en form for runtime polymorfisme. Dette er noget, der ikke kan opnås med simpel arv,
    // da arv er fastlagt ved kompileringstidspunktet.

    //Single Responsibility Principle: Sammensætning hjælper med at opnå det enkelte ansvarsprincip (Single Responsibility Principle),
    // hvor hver klasse eller modul kun har ansvar for en enkelt del af systemets funktionalitet.

    //Forholdet mellem komposition og arv: Selvom komposition ofte favoriseres, er der stadig tilfælde,
    // hvor arv er passende. Det er vigtigt at forstå, at princippet ikke siger, at man altid skal bruge
    // sammensætning i stedet for arv. Det handler om at favorisere sammensætning,
    // når det giver mening, men det betyder ikke, at man skal udelukke arv helt.

    // TODO Forklar Strategy Pattern side 24
    // Indkapsling af adfærd: I stedet for at implementere adfærd eller algoritmer direkte inden i en klasse,
    // indkapsler Strategy Pattern disse adfærd eller algoritmer i separate klasser. Dette gør det muligt at
    // ændre adfærd eller algoritmer uden at ændre klassen, der bruger dem.

    //Udskiftelighed: Ved at definere en fælles interface for alle strategier, kan de forskellige strategier udskiftes
    // indbyrdes i kørselstid. Det betyder, at klientklassen kan ændre sin adfærd ved kørselstid ved at skifte til en anden strategi.
    // Øget modulært design: Strategy Pattern gør det muligt at isolere kode, der er specifik for en bestemt algoritme
    // eller adfærd, hvilket resulterer i mere modulær og genanvendelig kode.

    //Reduceret kompleksitet: Ved at fjerne algoritme-specifik kode fra klientklassen kan
    // Strategy Pattern hjælpe med at reducere kompleksiteten i klientklassen.

    //Eksempler på anvendelse: Strategy Pattern bruges ofte til at håndtere situationer,
    // hvor en klasse skal kunne vælge mellem flere forskellige adfærd eller algoritmer.
    // Et eksempel kunne være en sorteringsklasse, der kan vælge mellem forskellige sorteringsalgoritmer
    // (f.eks. quicksort, mergesort, bubblesort) baseret på inputdataene eller brugerens valg.
    //
}
