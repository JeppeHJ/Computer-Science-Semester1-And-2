package Opgaver.Opg1_Generisk_Queue;

import java.util.NoSuchElementException;

// Denne klasse implementerer en kø ved hjælp af en cirkulær array-struktur.
// Den generiske type <E> gør det muligt at indsætte hvilken som helst type elementer i køen.
public class CircularArrayQueue<E> implements QueueI<E> {
	// En array af elementer af generisk type E
	private E[] elements;
	private int currentSize; // Antallet af elementer i køen
	private int head; // Indekset for den første (første i køen) element
	private int tail; // Indekset for den sidste (sidste i køen) element

	public CircularArrayQueue() {
		final int INITIAL_SIZE = 5;
		// Konstruktøren initialiserer et nyt array af objekter,
		// som derefter castes til den generiske type E
		elements = (E[]) new Object[INITIAL_SIZE];
		currentSize = 0; // Ingen elementer i køen ved oprettelse
		head = 0; // Indekset for den første (første i køen) element sættes til 0
		tail = 0; // Indekset for den sidste (sidste i køen) element sættes til 0
	}

	@Override
	public boolean isEmpty() {
		return currentSize == 0; // Returnerer true, hvis køen er tom (ingen elementer)
	}

	// Metoden enqueue tager nu et argument af typen E i stedet for Object
	@Override
	public void enqueue(E newElement) {
		growIfNecessary(); // Hvis køen er fuld, øges størrelsen af arrayet
		currentSize++; // Øger antallet af elementer i køen
		elements[tail] = newElement; // Indsætter det nye element i slutningen af køen
		tail = (tail + 1) % elements.length; // Opdaterer indextallet for den sidste element i køen
	}

	// Metoden dequeue returnerer nu et element af typen E i stedet for Object
	@Override
	public E dequeue() {
		if (currentSize == 0) {
			throw new NoSuchElementException(); // Kaster en exception, hvis køen er tom og der ikke er noget at fjerne
		}
		E removed = elements[head]; // Gemmer det element, der skal fjernes (første i køen)
		head = (head + 1) % elements.length; // Opdaterer indextallet for den første element i køen
		currentSize--; // Reducerer antallet af elementer i køen
		return removed; // Returnerer det fjernede element
	}

	// Denne hjælpemetode sørger for at vokse arrayet, hvis det er nødvendigt
	private void growIfNecessary() {
		// Ved at oprette et nyt array af objekter og caste det til type E,
		// sikrer vi, at vores kø kan indeholde elementer af hvilken som helst type
		E[] newElements = (E[]) new Object[2 * elements.length]; // Opretter et nyt array med dobbelt størrelse
		for (int i = 0; i < elements.length; i++) {
			newElements[i] = elements[(head + i) % elements.length]; // Kopierer elementerne fra det gamle array til det nye array
		}
		elements = newElements; // Opdaterer reference til det nye array
		head = 0; // Opdaterer indextallet for den første element i køen i det nye array
		tail = currentSize; // Opdaterer indextallet for den sidste element i køen i det nye array
	}

	// Metoden getFront returnerer nu et element af typen E i stedet for Object
	@Override
	public E getFront() {
		if (currentSize == 0) {
			throw new NoSuchElementException(); // Kaster en exception, hvis køen er tom og der ikke er noget element forrest
		}
		return elements[head]; // Returnerer det første element i køen
	}

	@Override
	public int size() {
		return currentSize; // Returnerer antallet af elementer i køen
	}
}
