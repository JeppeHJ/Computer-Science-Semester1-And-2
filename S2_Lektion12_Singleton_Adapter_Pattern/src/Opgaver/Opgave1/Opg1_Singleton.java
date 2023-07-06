package Opgaver.Opgave1;

public class Opg1_Singleton {

    // TODO Hvad løser Singleton?
    // Singleton løser det problem, at der kun kan oprettes ét objekt - en instans - af en Singleton-klasse
    // Det kan være nyttigt i flere kontekster. F.eks. hvis klassen indeholder konfigurationer og indstillinger
    // Her vil det være en god ide at være sikker på, at vi kun har ét objekt, så vi ikke har flere objekter
    // med forskellige indstillinger og konfigurationer.

    // TODO Beskriv hvordan Singleton Pattern implementeres i praksis
    // Det gør det ved at sætte constructoren som privat
    // Sætte en static instans-variable af sig selv
    // Sætte en static metode til at få adgang til Singleton-instansen
    // getInstance() returnerer så enten en ny instans (hvis det er første gang kaldet laves)
    // ellers returnerer den instans-variablen uniqueInstance
    // Det kan også implementeres på andre måder bla ved anvendelse af synchronized,
    // volatile double-looking (som også anvender synchronized) samt enum
    // Vi kan også anvende eagerly construction, hvor vi konstruerer Singleton-objektet klassen loades (i instans variablen)
}
