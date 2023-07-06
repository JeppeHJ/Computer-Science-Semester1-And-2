package Opgaver.Opg3_Generisk_Klasse;

public class Person<T extends Comparable<T>> implements Comparable<Person<T>> {

    /**
     * Klassen Person er en generisk klasse, der repræsenterer en person med et navn af typen T.
     * Kravet om at T skal være Comparable<T> betyder, at navnet kan sammenlignes med andre navne af samme type.
     * Det gør det muligt at sortere og sammenligne Person-objekter baseret på deres navne.
     */

    private T navn;

    /**
     * Konstruktøren initialiserer et nyt Person-objekt med det givne navn.
     *
     * @param navn Navnet på personen af typen T.
     */
    public Person(T navn) {
        this.navn = navn;
    }

    /**
     * Returnerer navnet på personen.
     *
     * @return Navnet på personen af typen T.
     */
    public T getNavn() {
        return navn;
    }

    /**
     * Indstiller navnet på personen til det givne navn.
     *
     * @param navn Det nye navn på personen af typen T.
     */
    public void setNavn(T navn) {
        this.navn = navn;
    }

    /**
     * Returnerer en strengrepræsentation af Person-objektet.
     *
     * @return Strengrepræsentationen af Person-objektet.
     */
    @Override
    public String toString() {
        return "Person{" +
                "navn=" + navn +
                '}';
    }

    /**
     * Sammenligner dette Person-objekt med et andet Person-objekt baseret på deres navne.
     * Returnerer en negativ værdi, nul eller en positiv værdi afhængigt af resultatet.
     *
     * @param o Det andet Person-objekt, der skal sammenlignes med.
     * @return En negativ værdi, nul eller en positiv værdi, afhængigt af resultatet af sammenligningen.
     */
    @Override
    public int compareTo(Person<T> o) {
        return this.getNavn().compareTo(o.getNavn());
    }
}
