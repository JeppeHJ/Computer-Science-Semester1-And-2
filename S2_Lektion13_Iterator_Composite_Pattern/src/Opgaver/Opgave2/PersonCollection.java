package Opgaver.Opgave2;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class PersonCollection implements Iterable<Person> {
    private Person[] persons; // Array til at gemme Person-objekter
    private int size; // Antallet af Person-objekter i samlingen
    private int modCount = 0; // Tæller for ændringer i samlingen

    public PersonCollection() {
        this(16);  // Kalder en anden konstruktør med en standard kapacitet på 16
    }

    public PersonCollection(int capacity) {
        this.persons = new Person[capacity];  // Opretter et array med den givne kapacitet
        this.size = 0;                       // Initialiserer størrelsen til 0
    }

    public void add(Person person) {
        if (this.size == this.persons.length) {
            throw new RuntimeException("Collection is full");  // Kaster en undtagelse hvis samlingen er fuld
        }
        this.persons[this.size] = person;  // Tilføjer personen til arrayet
        this.size++;                      // Øger størrelsen med 1
        this.modCount++;                  // Øger modifikationscountet med 1
    }

    public void add(int index, Person person) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException();  // Kaster en undtagelse hvis indekset er ugyldigt
        }
        for (int i = this.size; i > index; i--) {
            this.persons[i] = this.persons[i - 1];  // Flytter elementerne til højre for det angivne indeks en plads til højre
        }
        this.persons[index] = person;  // Indsætter personen på det angivne indeks
        this.size++;                  // Øger størrelsen med 1
        this.modCount++;              // Øger modifikationscountet med 1
    }

    public Person remove(int index) {
        if (index < 0 || index > this.size - 1) {
            throw new IndexOutOfBoundsException();  // Kaster en undtagelse hvis indekset er ugyldigt
        }
        Person person = this.persons[index];  // Gemmer personen på det angivne indeks
        for (int i = index; i < this.size - 1; i++) {
            this.persons[i] = this.persons[i + 1];  // Flytter elementerne til højre for det angivne indeks en plads til venstre
        }
        this.persons[this.size - 1] = null;  // Sætter det sidste element til null
        this.size--;                         // Formindsker størrelsen med 1
        this.modCount++;                     // Øger modifikationscountet med 1
        return person;                       // Returnerer den fjernede person
    }

    public Person get(int index) {
        if (index < 0 || index > this.size - 1) {
            throw new IndexOutOfBoundsException();  // Kaster en undtagelse hvis indekset er ugyldigt
        }
        return this.persons[index];  // Returnerer personen på det angivne indeks
    }

    public boolean contains(Person person) {
        boolean found = false;
        int i = 0;
        while (!found && i < this.size) {
            if (this.persons[i].equals(person)) {
                found = true;  // Sætter found til true hvis personen findes i samlingen
            }
            i++;
        }
        return found;  // Returnerer om personen blev fundet
    }

    public int size() {
        return this.size;  // Returnerer antallet af Person-objekter i samlingen
    }

    public boolean isEmpty() {
        return this.size == 0;  // Returnerer om samlingen er tom eller ej
    }

    public void clear() {
        for (int i = 0; i < this.size; i++) {
            this.persons[i] = null;  // Sætter hvert element til null
        }
        this.size = 0;        // Sætter størrelsen til 0
        this.modCount++;     // Øger modifikationscountet med 1
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return ("[]");  // Returnerer en tom samling som en tom streng
        }

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < this.size; i++) {
            sb.append(", " + this.persons[i]);  // Tilføjer hver person til StringBuilder
        }
        sb.append("]");
        sb.delete(1, 3);  // Sletter det første komma og mellemrum i strengen
        return sb.toString();  // Returnerer StringBuilder som en streng
    }

    @Override
    public Iterator<Person> iterator() {
        return new PersonCollectionIterator(this.persons, this.size, this.modCount);  // Returnerer en instans af PersonCollectionIterator
    }

    public class PersonCollectionIterator implements Iterator<Person> {
        private int position = 0;
        private Person[] persons;
        private int size;
        private int expectedModCount;

        public PersonCollectionIterator(Person[] persons, int size, int modCount) {
            this.persons = persons.clone();  // Opretter en kopi af arrayet for at undgå ændringer
            this.size = size;                // Sætter størrelsen af samlingen
            this.expectedModCount = modCount;  // Sætter det forventede modifikationscount
        }

        @Override
        public boolean hasNext() {
            return position < size && persons[position] != null;  // Returnerer om der er flere elementer at iterere over
        }

        @Override
        public Person next() {
            if (!hasNext()) {
                throw new IllegalStateException("No more elements to iterate over.");  // Kaster en undtagelse hvis der ikke er flere elementer at iterere over
            }
            if (expectedModCount != modCount) {
                throw new ConcurrentModificationException();  // Kaster en undtagelse hvis samlingen er blevet ændret under iterationen
            }
            return persons[position++];  // Returnerer det næste element og øger positionen med 1
        }
    }
}