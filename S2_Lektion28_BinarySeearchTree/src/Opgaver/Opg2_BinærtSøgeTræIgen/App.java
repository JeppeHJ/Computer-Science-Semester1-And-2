package Opgaver.Opg2_BinærtSøgeTræIgen;

public class App {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.add(45);
        binarySearchTree.add(22);
        binarySearchTree.add(77);

        binarySearchTree.add(11);
        binarySearchTree.add(90);
        binarySearchTree.add(30);

        binarySearchTree.add(15);
        binarySearchTree.add(25);
        binarySearchTree.add(88);

        binarySearchTree.print();
        System.out.println(binarySearchTree.findMax());
        System.out.println(binarySearchTree.findMin());
        System.out.println(binarySearchTree.removeMin());
        System.out.println(binarySearchTree.removeMax());
        binarySearchTree.print();
    }
}
