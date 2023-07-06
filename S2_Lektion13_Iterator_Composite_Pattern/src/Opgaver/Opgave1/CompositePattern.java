package Opgaver.Opgave1;

public class CompositePattern {

    // TODO Hvad kan vi opnå ved at bruge Composite Pattern?
    // Ved at bruge Composite mønsteret kan vi behandle individuelle objekter og kompositioner
    // af objekter ensartet. Dette gør det nemt at arbejde med komplekse hierarkier af objekter.
    // Det gør også designet mere generelt, hvilket tillader mere kodegenbrug og forbedrer systemets fleksibilitet

    // TODO Hvilke dele består Composite pattern af?
    // Composite mønsteret består normalt af tre dele: Component, Leaf, og Composite.
    // Component er en abstrakt klasse eller interface, der definerer den fælles opførsel for både Leaf og Composite.
    // Leaf er den mest grundlæggende del af hierarkiet og har ikke nogen børn.
    // Composite er en klasse, der implementerer Component og indeholder en gruppe af Components.
    // Dette kan inkludere andre Composites samt Leafs.

    // TODO Hvordan skal de forskellige klasser i Composite mønsteret programmeres?
    // Component skal definere de metoder, der er fælles for både Leaf og Composite. Dette kan inkludere
    // operationer som "display", "add", "remove" osv.
    // Leaf implementerer Component og definerer opførsel for primitive objekter i sammensætningen.
    // Composite implementerer også Component og definerer opførsel for komponenter, der har børn.
    // Dette inkluderer typisk at vedligeholde en liste over sine børn og at implementere metoder, der tillader tilføjelse og fjernelse af børn.

    // TODO Forklar eksemplet Designing Menus with Composite
    // Designing Menus med Composite er et eksempel, der illustrerer, hvordan man kan bruge Composite
    // mønsteret til at designe et hierarkisk menussystem. I dette eksempel kan et "Menu" objekt være en Composite,
    // der indeholder en liste over "MenuItem" objekter, som er Leafs. Både "Menu" og "MenuItem" objekter implementerer
    // et "MenuComponent" interface, der definerer metoder som "display".
    // Med dette design kan vi nemt oprette komplekse menuer ved at tilføje eller fjerne "MenuItem"
    // eller "Menu" objekter fra andre "Menu" objekter. Desuden kan vi behandle alle
    // menukomponenter ens, uanset om de er enkelte menuobjekter eller hele menublokke.
}
