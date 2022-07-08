package BinaryTree;

public class BinarySearchTreeDemo {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.root = bst.insert(bst.root, 50);
        bst.insert(20);
        bst.insert(70);
        bst.insert(10);
        bst.insert(25);
        bst.insert(60);
        bst.insert(90);
        bst.insert(80);
        bst.insert(0);
        bst.inOrder(bst.root);
        System.out.println();
        bst.search(bst.root,800);
        bst.searchInLoop(bst.root,0);
        bst.delete(bst.root, 900);
        bst.inOrder(bst.root);
        System.out.println(bst.searchBST(bst.root,20));
    }
}
