package Opgaver.Opg2_DictionaryInterface_Map;

import java.util.HashMap;
import java.util.Map;

public class DictionaryHashMap<K, V> implements Dictionary<K, V> {

	// Vi bruger et array af hash maps som vores grundlæggende datastruktur.
	private Map<K, V>[] tabel;

	// Vi sætter en standardstørrelse til vores dictionary.
	private static int STANDARD_STØRRELSE = 10;

	// Vi holder styr på, hvor mange elementer vi har i vores dictionary.
	private int aktuelStørrelse;

	public DictionaryHashMap() {
		// Vi opretter vores tabel med den angivne standardstørrelse.
		tabel = new HashMap[STANDARD_STØRRELSE];

		// Vi opretter et nyt HashMap for hver position i vores tabel.
		for (int i = 0; i < STANDARD_STØRRELSE; i++) {
			tabel[i] = new HashMap<>();
		}
	}

	@Override
	public V get(K key) {
		// Vi finder først den hash map i vores tabel, hvor vores nøgle skulle være.
		int index = key.hashCode() % STANDARD_STØRRELSE;
		Map<K, V> map = tabel[index];

		// Vi forsøger derefter at finde nøglen i den valgte hash map.
		return map.get(key);
	}

	@Override
	public boolean isEmpty() {
		// Vi antager først, at vores dictionary er tom.
		boolean erTom = true;
		int i = 0;

		// Vi gennemgår hver hash map i vores tabel.
		while (erTom && i < STANDARD_STØRRELSE) {
			// Hvis vi finder en hash map, der ikke er tom, så er vores dictionary ikke tom.
			erTom = (tabel[i]).isEmpty();
			i++;
		}

		return erTom;
	}

	@Override
	public V put(K key, V value) {
		// Vi finder først den hash map i vores tabel, hvor vores nøgle skulle være.
		int index = key.hashCode() % STANDARD_STØRRELSE;

		// Vi tilføjer nøgle-værdi-parret til den valgte hash map.
		V tilføjetVærdi = tabel[index].put(key,value);

		// Vi returnerer den værdi, der blev tilføjet.
		return tilføjetVærdi;
	}

	@Override
	public V remove(K key) {
		// Vi finder først den hash map i vores tabel, hvor vores nøgle skulle være.
		int index = key.hashCode() % STANDARD_STØRRELSE;

		// Vi forsøger at fjerne nøgle-værdi-parret fra den valgte hash map.
		V fjernetVærdi = tabel[index].remove(key);

		// Hvis en værdi blev fjernet, reducerer vi vores tæller for aktuelle størrelse.
		if (fjernetVærdi != null) {
			aktuelStørrelse--;
		}

		// Vi returnerer den værdi, der blev fjernet.
		return fjernetVærdi;
	}

	@Override
	public int size() {
		// Vi returnerer størrelsen af vores dictionary.
		return aktuelStørrelse;
	}
}
