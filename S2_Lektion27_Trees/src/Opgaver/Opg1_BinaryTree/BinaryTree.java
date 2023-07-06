package Opgaver.Opg1_BinaryTree;

// Denne klasse repræsenterer en binær træstruktur, hvor hver node har to børn.
public class BinaryTree<E> {
	private Node root; // Rodnoden for dette binære træ.

	// Konstruktøren initialiserer et tomt træ.
	public BinaryTree() {
		root = null; // Træet er tomt, så roden sættes til null.
	}

	// Denne konstruktør opretter et træ med en node og ingen børn.
	public BinaryTree(E rootData) {
		root = new Node(); // Opretter en ny node.
		root.data = rootData; // Sætter dataen i noden til rootData.
		root.left = null; // Ingen venstre undernode, så den sættes til null.
		root.right = null; // Ingen højre undernode, så den sættes til null.
	}

	public Node getRoot() {
		return root; // Returnerer rod noden.
	}

	// Denne konstruktør opretter et binært træ.
	public BinaryTree(E rootData, BinaryTree<E> left, BinaryTree<E> right) {
		root = new Node(); // Opretter en ny node.
		root.data = rootData; // Sætter dataen i noden til rootData.
		// Tildeler venstre og højre undertræer til roden, hvis de eksisterer.
		if (left != null) {
			root.left = left.root;
		}
		if (right != null) {
			root.right = right.root;
		}
	}

	// Denne metode tjekker, om træet er tomt.
	public boolean isEmpty() {
		return root == null; // Returnerer true, hvis træet er tomt (roden er null).
	}

	// Denne metode returnerer dataen ved roden af dette træ.
	public E data() {
		return root.data; // Returnerer dataen fra roden.
	}

	// Denne metode returnerer det venstre undertræ af dette træ.
	public BinaryTree<E> left() {
		BinaryTree<E> result = new BinaryTree<E>(); // Opretter et nyt binært træ.
		result.root = root.left; // Den nye træs rod er venstre node fra nuværende rod.
		return result;
	}

	// Denne metode returnerer det højre undertræ af dette træ.
	public BinaryTree<E> right() {
		BinaryTree<E> result = new BinaryTree<E>(); // Opretter et nyt binært træ.
		result.root = root.right; // Den nye træs rod er højre node fra nuværende rod.
		return result;
	}

	// Denne metode erstatter dataen ved roden med ny data og returnerer den tidligere data.
	public E replace(E rootData) {
		E dataToBeReturned = root.data; // Gemmer den nuværende data fra roden.
		root.data = rootData; // Opdaterer dataen i roden med den nye data.
		return dataToBeReturned; // Returnerer den tidligere data.
	}

	// Denne metode returnerer sand, hvis en given node n ikke har nogen børn.
	public boolean isLeaf(Node n) {
		return n.left == null && n.right == null; // En node er et blad, hvis begge børn er null.
	}

	// Denne metode returnerer sand, hvis en given node n har mindst et barn.
	public boolean isInternal(Node n) {
		return n.left != null || n.right != null; // En node er intern, hvis den har mindst et barn (enten venstre eller højre).
	}

	// Denne metode returnerer antallet af noder i træet.
	public int size() {
		return size(root); // Starter tælling af størrelsen fra roden af træet.
	}

	// Denne private metode beregner størrelsen (antal noder) i træet.
	private int size(Node n) {
		if (n == null) {
			return 0; // Hvis en node er null, bidrager den ikke til træets størrelse.
		} else {
			// Størrelsen af træet er størrelsen af det venstre undertræ plus størrelsen af det højre undertræ plus selve noden.
			return (size(n.left) + 1 + size(n.right));
		}
	}

	// Denne indre klasse repræsenterer en node i træet.
	private class Node {
		public E data; // Dataelementet gemt i denne node.
		public Node left; // Den venstre undernode af denne node.
		public Node right; // Den højre undernode af denne node.
	}
}
