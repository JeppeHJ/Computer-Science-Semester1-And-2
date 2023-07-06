package Opgaver.Opg2_Opbyg_BinaryTree;

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

	// Denne metode returnerer rod noden.
	public Node getRoot() {
		return root;
	}

	// Denne metode beregner og returnerer højden af træet.
	public int height() {
		return height(root); // Starter beregning af højden fra roden af træet.
	}

	// Denne private metode beregner højden af træet.
	private int height(Node n) {
		if (n == null) {
			return 0; // Hvis en node er null, bidrager den ikke til træets højde.
		} else {
			int heightLeft = height(n.left); // Beregner højden af det venstre undertræ.
			int heightRight = height(n.right); // Beregner højden af det højre undertræ.
			// Træets højde er det maksimale af højderne af de to undertræer plus 1.
			return 1 + Math.max(heightLeft, heightRight);
		}
	}

	// Denne metode udfører en pre-order gennemgang af træet og printer data fra hver node.
	public void preorder() {
		preorder(root); // Starter pre-order gennemgang fra roden af træet.
	}

	// Denne private metode udfører en pre-order gennemgang af træet.
	private void preorder(Node n) {
		if (n == null) {
			return;
		}
		System.out.println(n.data); // Printer dataen fra den aktuelle node.
		preorder(n.left); // Besøger venstre undertræ.
		preorder(n.right); // Besøger højre undertræ.
	}

	// Denne metode udfører en in-order gennemgang af træet og printer data fra hver node.
	public void inorder() {
		inorder(root); // Starter in-order gennemgang fra roden af træet.
	}

	// Denne private metode udfører en in-order gennemgang af træet.
	private void inorder(Node n) {
		if (n == null) {
			return;
		}
		inorder(n.left); // Besøger venstre undertræ.
		System.out.println(n.data); // Printer dataen fra den aktuelle node.
		inorder(n.right); // Besøger højre undertræ.
	}

	// Denne metode udfører en post-order gennemgang af træet og printer data fra hver node.
	public void postorder() {
		postorder(root); // Starter post-order gennemgang fra roden af træet.
	}

	// Denne private metode udfører en post-order gennemgang af træet.
	private void postorder(Node n) {
		if (n == null) {
			return;
		}
		postorder(n.left); // Besøger venstre undertræ.
		postorder(n.right); // Besøger højre undertræ.
		System.out.println(n.data); // Printer dataen fra den aktuelle node.
	}

	// Denne konstruktør opretter et binært træ med en given rod, venstre undertræ og højre undertræ.
	public BinaryTree(E rootData, BinaryTree<E> left, BinaryTree<E> right) {
		root = new Node(); // Opretter en ny node.
		root.data = rootData; // Sætter dataen i noden til rootData.
		if (left != null) {
			root.left = left.root; // Sætter den venstre undernode til roden af det venstre undertræ.
		}
		if (right != null) {
			root.right = right.root; // Sætter den højre undernode til roden af det højre undertræ.
		}
	}

	// Denne metode tjekker, om træet er tomt.
	public boolean isEmpty() {
		return root == null; // Træet er tomt, hvis roden er null.
	}

	// Denne metode returnerer dataen i roden af træet.
	public E data() {
		return root.data;
	}

	// Denne metode returnerer det venstre undertræ af træet.
	public BinaryTree<E> left() {
		BinaryTree<E> result = new BinaryTree<E>(); // Opretter et nyt binært træ.
		result.root = root.left; // Sætter roden af det nye træ til den venstre undernode af det aktuelle træ.
		return result; // Returnerer det nye træ.
	}

	// Denne metode returnerer det højre undertræ af træet.
	public BinaryTree<E> right() {
		BinaryTree<E> result = new BinaryTree<E>(); // Opretter et nyt binært træ.
		result.root = root.right; // Sætter roden af det nye træ til den højre undernode af det aktuelle træ.
		return result; // Returnerer det nye træ.
	}

	// Denne metode erstatter dataen i roden af træet og returnerer de gamle data.
	public E replace(E rootData) {
		E dataToBeReturned = root.data; // Gemmer de gamle data.
		root.data = rootData; // Erstatter dataen i roden med de nye data.
		return dataToBeReturned; // Returnerer de gamle data.
	}

	// Denne metode returnerer sand, hvis en given node n ikke har nogen børn.
	public boolean isLeaf(Node n) {
		return n.left == null && n.right == null; // En node er et blad, hvis den hverken har en venstre eller højre undernode.
	}

	// Denne metode returnerer sand, hvis en given node n har mindst et barn.
	public boolean isInternal(Node n) {
		return n.left != null || n.right != null; // En node er intern, hvis den har mindst en undernode.
	}

	// Denne metode returnerer antallet af noder i træet.
	public int size() {
		return size(root); // Starter beregningen af størrelsen fra roden af træet.
	}

	// Denne private metode beregner størrelsen af træet.
	private int size(Node n) {
		if (n == null) {
			return 0; // Hvis en node er null, bidrager den ikke til størrelsen af træet.
		} else {
			// Størrelsen af træet er størrelsen af det venstre undertræ plus 1 plus størrelsen af det højre undertræ.
			return (size(n.left) + 1 + size(n.right));
		}
	}

	// Denne private klasse repræsenterer en node i det binære træ.
	private class Node {
		public E data; // Dataen i noden.
		public Node left; // Den venstre undernode.
		public Node right; // Den højre undernode.
	}
}
