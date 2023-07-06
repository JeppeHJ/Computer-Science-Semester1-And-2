package Opgaver.Opg1_Generisk_Queue;

// Dette interface definerer metoderne for en kø.
// Ved at bruge generisk type E kan vi sikre, at vores kø kan arbejde med elementer af hvilken som helst type
public interface QueueI<E> {

	public boolean isEmpty();

	// Metoden enqueue tager nu et argument af typen E i stedet for Object
	public void enqueue(E newElement);

	// Metoden dequeue returnerer nu et element af typen E i stedet for Object
	public E dequeue();

	// Metoden getFront returnerer nu


	public E getFront();

	public int size();
}