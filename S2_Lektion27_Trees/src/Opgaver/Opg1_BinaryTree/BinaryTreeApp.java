package Opgaver.Opg1_BinaryTree;

public class BinaryTreeApp {
    public static void main(String[] args) {
        // Opretter nogle binære træer med enkelte noder
        BinaryTree<Integer> tree1 = new BinaryTree<>(1);
        BinaryTree<Integer> tree2 = new BinaryTree<>(2);
        BinaryTree<Integer> tree3 = new BinaryTree<>(3);

        // Opretter et større træ ved hjælp af de mindre træer
        BinaryTree<Integer> tree4 = new BinaryTree<>(4, tree2, tree3);
        BinaryTree<Integer> tree5 = new BinaryTree<>(5, tree1, tree4);

        // Tester isEmpty metode
        System.out.println("Is tree5 empty? " + tree5.isEmpty());

        // Tester data metode
        System.out.println("Data at root of tree5: " + tree5.data());

        // Tester left og right metoder
        System.out.println("Data at left child of root in tree5: " + tree5.left().data());
        System.out.println("Data at right child of root in tree5: " + tree5.right().data());

        // Tester replace metode
        System.out.println("Old root data after replacing in tree5: " + tree5.replace(6));
        System.out.println("New root data in tree5: " + tree5.data());

        // Tester size metode
        System.out.println("Size of tree5: " + tree5.size());

        // Tester isLeaf metode
        System.out.println("Is root of tree5 a leaf? " + tree5.isLeaf(tree5.getRoot()));

        // Tester isInternal metode
        System.out.println("Is root of tree5 internal? " + tree5.isInternal(tree5.getRoot()));
    }
}
