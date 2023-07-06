package Opgaver.Opg3_SumBinærTræ_DelLøsKombiner;

/**
 * A binary tree in which each node has two children.
 */
public class BinaryTree<E> {
	private Node root;

	/**
	 * Constructs an empty tree.
	 */
	public BinaryTree() {
		root = null;
	}

	/**
	 * Constructs a tree with one node and no children.
	 *
	 * @param rootData
	 *            the data for the root
	 */
	public BinaryTree(Integer rootData) {
		root = new Node();
		root.data = rootData;
		root.left = null;
		root.right = null;
	}

	// Denne metode starter beregningen af summen af alle elementer i det binære træ.
	public int sumAfBinærTræ() {
		return sumAfBinærTræ(root); // Starter beregningen fra roden af træet.
	}

	// Denne private metode beregner summen af alle elementer i det binære træ.
	private int sumAfBinærTræ(Node n) {
		if (n == null) {
			return 0; // Hvis en node er null, bidrager den ikke til summen.
		} else {
			int sumLeft = sumAfBinærTræ(n.left); // Beregner summen af det venstre undertræ.
			int sumRight = sumAfBinærTræ(n.right); // Beregner summen af det højre undertræ.
			return sumLeft + sumRight + n.data; // Summen af træet er summen af det venstre undertræ plus summen af det højre undertræ plus dataen i den aktuelle node.
		}
	}


	public Node getRoot() {
		return root;
	}

	public int height() {
		return height(root);
	}

	private int height(Node n) {
		if (n == null) {
			return 0;
		} else {
			int heightLeft = height(n.left);
			int heightRight = height(n.right);
			int height = 1 + Math.max(heightLeft, heightRight);
			return height;
		}
	}

	public void preorder() {
		preorder(root);
	}
	private void preorder(Node n) {
		if (n == null) {
			return;
		}
		System.out.println(n.data);
		preorder(n.left);
		preorder(n.right);
	}

	public void inorder() {
		inorder(root);
	}
	private void inorder(Node n) {
		if (n == null) {
			return;
		}
		inorder(n.left);
		System.out.println(n.data);
		inorder(n.right);
	}

	public void postorder() {
		postorder(root);
	}
	private void postorder(Node n) {
		if (n == null) {
			return;
		}
		postorder(n.left);
		postorder(n.right);
		System.out.println(n.data);
	}

	/**
	 * Constructs a binary tree.
	 *
	 * @param rootData
	 *            the data for the root
	 * @param left
	 *            the left subtree
	 * @param right
	 *            the right subtree
	 */
	public BinaryTree(Integer rootData, BinaryTree<E> left, BinaryTree<E> right) {
		root = new Node();
		root.data = rootData;
		if (left != null) {
			root.left = left.root;
		}
		if (right != null) {
			root.right = right.root;
		}
	}

	/**
	 * Checks whether this tree is empty.
	 *
	 * @return true if this tree is empty
	 */
	public boolean isEmpty() {
		return root == null;
	}

	/**
	 * Gets the data at the root of this tree.
	 *
	 * @return the root data
	 */
	public int data() {
		return root.data;
	}

	/**
	 * Gets the left subtree of this tree.
	 *
	 * @return the left child of the root
	 */
	public BinaryTree<E> left() {
		BinaryTree<E> result = new BinaryTree<E>();
		result.root = root.left;
		return result;
	}

	/**
	 * Gets the right subtree of this tree.
	 *
	 * @return the right child of the root
	 */
	public BinaryTree<E> right() {
		BinaryTree<E> result = new BinaryTree<E>();
		result.root = root.right;
		return result;

	}

	/**
	 *
	 * @param rootData
	 *            the new data for the root
	 *
	 * @return the data previous in the root
	 */
	public int replace(int rootData) {
		int dataToBeReturned = root.data;
		root.data = rootData;
		return dataToBeReturned;

	}

	/**
	 *
	 * @param n
	 * @return true in n has no children
	 */
	public boolean isLeaf(Node n) {
		return n.left == null && n.right == null;

	}

	/**
	 *
	 * @param n
	 * @return true in n has at least one child
	 */
	public boolean isInternal(Node n) {
		return n.left != null || n.right != null;
	}

	/**
	 *
	 * @return the number of nodes in the tree
	 */
	public int size() {
		return size(root);
	}

	private int size(Node n) {
		if (n == null) {
			return 0;
		} else {
			return (size(n.left) + 1 + size(n.right));
		}
	}

	private class Node {
		public int data;
		public Node left;
		public Node right;
	}
}
