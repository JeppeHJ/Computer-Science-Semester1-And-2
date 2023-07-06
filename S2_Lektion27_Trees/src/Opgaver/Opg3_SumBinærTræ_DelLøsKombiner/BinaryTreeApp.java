package Opgaver.Opg3_SumBinærTræ_DelLøsKombiner;

public class BinaryTreeApp {
    public static void main(String[] args) {
        // Opretter nogle binære træer med enkelte noder
        BinaryTree b15 = new BinaryTree(15, null, null);
        BinaryTree b25 = new BinaryTree(25, null, null);
        BinaryTree b88 = new BinaryTree(88, null, null);

        BinaryTree b11 = new BinaryTree(11, null, b15);
        BinaryTree b30 = new BinaryTree(30, b25, null);
        BinaryTree b90 = new BinaryTree(90, b88, null);

        BinaryTree b22 = new BinaryTree(22, b11, b30);
        BinaryTree b77 = new BinaryTree(77, null, b90);
        BinaryTree root45 = new BinaryTree(45, b22, b77);

        System.out.println(root45.sumAfBinærTræ());
        //root45.preorder();
        //root45.inorder();
        //root45.postorder();
    }

}
