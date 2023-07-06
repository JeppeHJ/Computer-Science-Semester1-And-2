package Opgaver.Opg2_DictionaryInterface_Map;

public class DictionaryLinked<K, V> implements Dictionary<K, V> {

	private Node start;
	private int size;

	public DictionaryLinked() {
		// Sentinel (tomt listehoved - der ikke indeholder data)
		start = new Node();
		size = 0;
	}

	@Override
	public V get(K key) {
		// Tjek om listen er tom
		if (isEmpty()) {
			// Hvis listen er tom, er nøglen ikke i listen, og vi returnerer null
			return null;
		}

		// Start fra starten af listen
		Node current = start;

		// Fortsæt indtil vi når slutningen af listen
		while (current != null) {
			// Hvis vi finder nøglen, returner dens værdi
			if (current.key.equals(key)) {
				return current.value;
			}
			// Gå videre til næste node
			current = current.next;
		}

		// Hvis vi når her, fandt vi ikke nøglen i listen, og vi returnerer null
		return null;
	}

	@Override
	public boolean isEmpty() {
		// Listen er tom, hvis dens størrelse er 0
		return size == 0;
	}

	@Override
	public V put(K key, V value) {
		// Opret en ny node med givne nøgle og værdi
		Node newNode = new Node();
		newNode.key = key;
		newNode.value = value;

		// Hvis listen er tom, tilføjer vi den nye node som det første element
		// og returnerer null, da der ikke var nogen tidligere værdi
		if (isEmpty()) {
			start = newNode;
			size++;
			return null;
		}

		// Vi starter med at tjekke den første node i listen
		Node current = start;

		// Tjek om den første node i listen har den nøgle, vi vil indsætte
		if (current.key.equals(key)) {
			V oldValue = current.value;
			current.value = value;
			return oldValue;
		}

		// Hvis den første node ikke havde nøglen, skal vi gennemgå resten af listen
		while (current.next != null) {
			// Hvis den næste node har nøglen
			if (current.next.key.equals(key)) {
				V oldValue = current.next.value;
				current.next.value = value;
				return oldValue;
			}
			current = current.next;
		}

		// Hvis vi er nået til enden af listen uden at finde nøglen,
		// tilføjer vi den nye node i slutningen af listen
		current.next = newNode;
		size++;

		// Da vi tilføjede en ny nøgle i slutningen af listen,
		// returnerer vi null for at indikere, at ingen tidligere værdi blev erstattet
		return null;
	}

	@Override
	public V remove(K key) {
		if (isEmpty()) {
			return null;
		}

		// Hvis det er det første element
		if (start.key.equals(key)) {
			V valueToBeReturned = start.value;
			start = start.next;
			size--;
			return valueToBeReturned;
		}

		// Søg efter nøglen i resten af listen
		Node previous = start;
		Node current = start.next;

		while (current != null && !current.key.equals(key)) {
			previous = current;
			current = current.next;
		}

		// Hvis nøglen ikke findes
		if (current == null) {
			return null;
		}

		// Fjern noden og opdater listen
		V valueToBeReturned = current.value;
		previous.next = current.next;
		size--;

		return valueToBeReturned;
	}

	@Override
	public int size() {
		return size;
	}

	private class Node {
		Node next;
		K key;
		V value;
	}
}
