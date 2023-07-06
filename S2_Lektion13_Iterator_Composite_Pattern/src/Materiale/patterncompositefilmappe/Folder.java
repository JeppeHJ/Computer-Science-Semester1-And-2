package Materiale.patterncompositefilmappe;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Path {
	private List<Path> paths; // Liste til at gemme underliggende stier

	public Folder() {
		paths = new ArrayList<Path>();  // Opretter en ny liste til stier
	}

	public void addPath(Path path) {
		if (!paths.contains(path)) {
			paths.add(path);  // Tilføjer stien til listen, hvis den ikke allerede findes
		}
	}

	public void removePath(Path path) {
		paths.remove(path);  // Fjerner stien fra listen
	}

	public Path getChild(int i) {
		if (i >= 0 && i < paths.size()) {
			return paths.get(i);  // Returnerer stien på det angivne indeks
		} else {
			return null;  // Hvis indekset er ugyldigt, returneres null
		}
	}

	@Override
	public int size() {
		int sum = 0;
		for (Path p : paths) {
			sum += p.size();  // Beregner den samlede størrelse af folderen ved at summere størrelsen af hver underliggende sti
		}
		return sum;
	}
}